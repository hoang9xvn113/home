package com.dogoo.poc.home.rest.resource.v1_0_0.test;

import com.dogoo.poc.home.rest.client.dto.v1_0_0.Home;
import com.dogoo.poc.home.rest.client.http.HttpInvoker;
import com.dogoo.poc.home.rest.client.pagination.Page;
import com.dogoo.poc.home.rest.client.pagination.Pagination;
import com.dogoo.poc.home.rest.client.resource.v1_0_0.HomeResource;
import com.dogoo.poc.home.rest.client.serdes.v1_0_0.HomeSerDes;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.petra.function.UnsafeTriConsumer;
import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.search.test.util.SearchTestRule;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.resource.EntityModelResource;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.lang.time.DateUtils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author hoang
 * @generated
 */
@Generated("")
public abstract class BaseHomeResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_homeResource.setContextCompany(testCompany);

		HomeResource.Builder builder = HomeResource.builder();

		homeResource = builder.authentication(
			"test@liferay.com", "test"
		).locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		Home home1 = randomHome();

		String json = objectMapper.writeValueAsString(home1);

		Home home2 = HomeSerDes.toDTO(json);

		Assert.assertTrue(equals(home1, home2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		Home home = randomHome();

		String json1 = objectMapper.writeValueAsString(home);
		String json2 = HomeSerDes.toJSON(home);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		Home home = randomHome();

		home.setAddress(regex);
		home.setColor(regex);
		home.setOwner(regex);

		String json = HomeSerDes.toJSON(home);

		Assert.assertFalse(json.contains(regex));

		home = HomeSerDes.toDTO(json);

		Assert.assertEquals(regex, home.getAddress());
		Assert.assertEquals(regex, home.getColor());
		Assert.assertEquals(regex, home.getOwner());
	}

	@Test
	public void testGetHomes() throws Exception {
		Page<Home> page = homeResource.getHomes(
			RandomTestUtil.randomString(), null, Pagination.of(1, 2), null);

		Assert.assertEquals(0, page.getTotalCount());

		Home home1 = testGetHomes_addHome(randomHome());

		Home home2 = testGetHomes_addHome(randomHome());

		page = homeResource.getHomes(null, null, Pagination.of(1, 2), null);

		Assert.assertEquals(2, page.getTotalCount());

		assertEqualsIgnoringOrder(
			Arrays.asList(home1, home2), (List<Home>)page.getItems());
		assertValid(page);
	}

	@Test
	public void testGetHomesWithFilterDateTimeEquals() throws Exception {
		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.DATE_TIME);

		if (entityFields.isEmpty()) {
			return;
		}

		Home home1 = randomHome();

		home1 = testGetHomes_addHome(home1);

		for (EntityField entityField : entityFields) {
			Page<Home> page = homeResource.getHomes(
				null, getFilterString(entityField, "between", home1),
				Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(home1), (List<Home>)page.getItems());
		}
	}

	@Test
	public void testGetHomesWithFilterStringEquals() throws Exception {
		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.STRING);

		if (entityFields.isEmpty()) {
			return;
		}

		Home home1 = testGetHomes_addHome(randomHome());

		@SuppressWarnings("PMD.UnusedLocalVariable")
		Home home2 = testGetHomes_addHome(randomHome());

		for (EntityField entityField : entityFields) {
			Page<Home> page = homeResource.getHomes(
				null, getFilterString(entityField, "eq", home1),
				Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(home1), (List<Home>)page.getItems());
		}
	}

	@Test
	public void testGetHomesWithPagination() throws Exception {
		Home home1 = testGetHomes_addHome(randomHome());

		Home home2 = testGetHomes_addHome(randomHome());

		Home home3 = testGetHomes_addHome(randomHome());

		Page<Home> page1 = homeResource.getHomes(
			null, null, Pagination.of(1, 2), null);

		List<Home> homes1 = (List<Home>)page1.getItems();

		Assert.assertEquals(homes1.toString(), 2, homes1.size());

		Page<Home> page2 = homeResource.getHomes(
			null, null, Pagination.of(2, 2), null);

		Assert.assertEquals(3, page2.getTotalCount());

		List<Home> homes2 = (List<Home>)page2.getItems();

		Assert.assertEquals(homes2.toString(), 1, homes2.size());

		Page<Home> page3 = homeResource.getHomes(
			null, null, Pagination.of(1, 3), null);

		assertEqualsIgnoringOrder(
			Arrays.asList(home1, home2, home3), (List<Home>)page3.getItems());
	}

	@Test
	public void testGetHomesWithSortDateTime() throws Exception {
		testGetHomesWithSort(
			EntityField.Type.DATE_TIME,
			(entityField, home1, home2) -> {
				BeanUtils.setProperty(
					home1, entityField.getName(),
					DateUtils.addMinutes(new Date(), -2));
			});
	}

	@Test
	public void testGetHomesWithSortInteger() throws Exception {
		testGetHomesWithSort(
			EntityField.Type.INTEGER,
			(entityField, home1, home2) -> {
				BeanUtils.setProperty(home1, entityField.getName(), 0);
				BeanUtils.setProperty(home2, entityField.getName(), 1);
			});
	}

	@Test
	public void testGetHomesWithSortString() throws Exception {
		testGetHomesWithSort(
			EntityField.Type.STRING,
			(entityField, home1, home2) -> {
				Class<?> clazz = home1.getClass();

				String entityFieldName = entityField.getName();

				Method method = clazz.getMethod(
					"get" + StringUtil.upperCaseFirstLetter(entityFieldName));

				Class<?> returnType = method.getReturnType();

				if (returnType.isAssignableFrom(Map.class)) {
					BeanUtils.setProperty(
						home1, entityFieldName,
						Collections.singletonMap("Aaa", "Aaa"));
					BeanUtils.setProperty(
						home2, entityFieldName,
						Collections.singletonMap("Bbb", "Bbb"));
				}
				else if (entityFieldName.contains("email")) {
					BeanUtils.setProperty(
						home1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
					BeanUtils.setProperty(
						home2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
				}
				else {
					BeanUtils.setProperty(
						home1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
					BeanUtils.setProperty(
						home2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
				}
			});
	}

	protected void testGetHomesWithSort(
			EntityField.Type type,
			UnsafeTriConsumer<EntityField, Home, Home, Exception>
				unsafeTriConsumer)
		throws Exception {

		List<EntityField> entityFields = getEntityFields(type);

		if (entityFields.isEmpty()) {
			return;
		}

		Home home1 = randomHome();
		Home home2 = randomHome();

		for (EntityField entityField : entityFields) {
			unsafeTriConsumer.accept(entityField, home1, home2);
		}

		home1 = testGetHomes_addHome(home1);

		home2 = testGetHomes_addHome(home2);

		for (EntityField entityField : entityFields) {
			Page<Home> ascPage = homeResource.getHomes(
				null, null, Pagination.of(1, 2),
				entityField.getName() + ":asc");

			assertEquals(
				Arrays.asList(home1, home2), (List<Home>)ascPage.getItems());

			Page<Home> descPage = homeResource.getHomes(
				null, null, Pagination.of(1, 2),
				entityField.getName() + ":desc");

			assertEquals(
				Arrays.asList(home2, home1), (List<Home>)descPage.getItems());
		}
	}

	protected Home testGetHomes_addHome(Home home) throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetHomes() throws Exception {
		GraphQLField graphQLField = new GraphQLField(
			"homes",
			new HashMap<String, Object>() {
				{
					put("page", 1);
					put("pageSize", 2);
				}
			},
			new GraphQLField("items", getGraphQLFields()),
			new GraphQLField("page"), new GraphQLField("totalCount"));

		JSONObject homesJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/homes");

		Assert.assertEquals(0, homesJSONObject.get("totalCount"));

		Home home1 = testGraphQLHome_addHome();
		Home home2 = testGraphQLHome_addHome();

		homesJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/homes");

		Assert.assertEquals(2, homesJSONObject.get("totalCount"));

		assertEqualsIgnoringOrder(
			Arrays.asList(home1, home2),
			Arrays.asList(
				HomeSerDes.toDTOs(homesJSONObject.getString("items"))));
	}

	@Test
	public void testAddHome() throws Exception {
		Home randomHome = randomHome();

		Home postHome = testAddHome_addHome(randomHome);

		assertEquals(randomHome, postHome);
		assertValid(postHome);
	}

	protected Home testAddHome_addHome(Home home) throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testDeleteHomeByHomeId() throws Exception {
		@SuppressWarnings("PMD.UnusedLocalVariable")
		Home home = testDeleteHomeByHomeId_addHome();

		assertHttpResponseStatusCode(
			204, homeResource.deleteHomeByHomeIdHttpResponse(home.getId()));

		assertHttpResponseStatusCode(
			404, homeResource.getHomeByHomeIdHttpResponse(home.getId()));

		assertHttpResponseStatusCode(
			404, homeResource.getHomeByHomeIdHttpResponse(0L));
	}

	protected Home testDeleteHomeByHomeId_addHome() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGetHomeByHomeId() throws Exception {
		Home postHome = testGetHomeByHomeId_addHome();

		Home getHome = homeResource.getHomeByHomeId(postHome.getId());

		assertEquals(postHome, getHome);
		assertValid(getHome);
	}

	protected Home testGetHomeByHomeId_addHome() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetHomeByHomeId() throws Exception {
		Home home = testGraphQLHome_addHome();

		Assert.assertTrue(
			equals(
				home,
				HomeSerDes.toDTO(
					JSONUtil.getValueAsString(
						invokeGraphQLQuery(
							new GraphQLField(
								"homeByHomeId",
								new HashMap<String, Object>() {
									{
										put("homeId", home.getId());
									}
								},
								getGraphQLFields())),
						"JSONObject/data", "Object/homeByHomeId"))));
	}

	@Test
	public void testGraphQLGetHomeByHomeIdNotFound() throws Exception {
		Long irrelevantHomeId = RandomTestUtil.randomLong();

		Assert.assertEquals(
			"Not Found",
			JSONUtil.getValueAsString(
				invokeGraphQLQuery(
					new GraphQLField(
						"homeByHomeId",
						new HashMap<String, Object>() {
							{
								put("homeId", irrelevantHomeId);
							}
						},
						getGraphQLFields())),
				"JSONArray/errors", "Object/0", "JSONObject/extensions",
				"Object/code"));
	}

	@Test
	public void testUpdateHomeByHomeId() throws Exception {
		Assert.assertTrue(false);
	}

	@Rule
	public SearchTestRule searchTestRule = new SearchTestRule();

	protected Home testGraphQLHome_addHome() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(Home home1, Home home2) {
		Assert.assertTrue(
			home1 + " does not equal " + home2, equals(home1, home2));
	}

	protected void assertEquals(List<Home> homes1, List<Home> homes2) {
		Assert.assertEquals(homes1.size(), homes2.size());

		for (int i = 0; i < homes1.size(); i++) {
			Home home1 = homes1.get(i);
			Home home2 = homes2.get(i);

			assertEquals(home1, home2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<Home> homes1, List<Home> homes2) {

		Assert.assertEquals(homes1.size(), homes2.size());

		for (Home home1 : homes1) {
			boolean contains = false;

			for (Home home2 : homes2) {
				if (equals(home1, home2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(homes2 + " does not contain " + home1, contains);
		}
	}

	protected void assertValid(Home home) throws Exception {
		boolean valid = true;

		if (home.getId() == null) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("address", additionalAssertFieldName)) {
				if (home.getAddress() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("color", additionalAssertFieldName)) {
				if (home.getColor() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("floor", additionalAssertFieldName)) {
				if (home.getFloor() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("owner", additionalAssertFieldName)) {
				if (home.getOwner() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("room", additionalAssertFieldName)) {
				if (home.getRoom() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("square", additionalAssertFieldName)) {
				if (home.getSquare() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<Home> page) {
		boolean valid = false;

		java.util.Collection<Home> homes = page.getItems();

		int size = homes.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (Field field :
				getDeclaredFields(
					com.dogoo.poc.home.rest.dto.v1_0_0.Home.class)) {

			if (!ArrayUtil.contains(
					getAdditionalAssertFieldNames(), field.getName())) {

				continue;
			}

			graphQLFields.addAll(getGraphQLFields(field));
		}

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (Field field : fields) {
			com.liferay.portal.vulcan.graphql.annotation.GraphQLField
				vulcanGraphQLField = field.getAnnotation(
					com.liferay.portal.vulcan.graphql.annotation.GraphQLField.
						class);

			if (vulcanGraphQLField != null) {
				Class<?> clazz = field.getType();

				if (clazz.isArray()) {
					clazz = clazz.getComponentType();
				}

				List<GraphQLField> childrenGraphQLFields = getGraphQLFields(
					getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(Home home1, Home home2) {
		if (home1 == home2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("address", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						home1.getAddress(), home2.getAddress())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("color", additionalAssertFieldName)) {
				if (!Objects.deepEquals(home1.getColor(), home2.getColor())) {
					return false;
				}

				continue;
			}

			if (Objects.equals("floor", additionalAssertFieldName)) {
				if (!Objects.deepEquals(home1.getFloor(), home2.getFloor())) {
					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(home1.getId(), home2.getId())) {
					return false;
				}

				continue;
			}

			if (Objects.equals("owner", additionalAssertFieldName)) {
				if (!Objects.deepEquals(home1.getOwner(), home2.getOwner())) {
					return false;
				}

				continue;
			}

			if (Objects.equals("room", additionalAssertFieldName)) {
				if (!Objects.deepEquals(home1.getRoom(), home2.getRoom())) {
					return false;
				}

				continue;
			}

			if (Objects.equals("square", additionalAssertFieldName)) {
				if (!Objects.deepEquals(home1.getSquare(), home2.getSquare())) {
					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		Map<String, Object> map1, Map<String, Object> map2) {

		if (Objects.equals(map1.keySet(), map2.keySet())) {
			for (Map.Entry<String, Object> entry : map1.entrySet()) {
				if (entry.getValue() instanceof Map) {
					if (!equals(
							(Map)entry.getValue(),
							(Map)map2.get(entry.getKey()))) {

						return false;
					}
				}
				else if (!Objects.deepEquals(
							entry.getValue(), map2.get(entry.getKey()))) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected Field[] getDeclaredFields(Class clazz) throws Exception {
		Stream<Field> stream = Stream.of(
			ReflectionUtil.getDeclaredFields(clazz));

		return stream.filter(
			field -> !field.isSynthetic()
		).toArray(
			Field[]::new
		);
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_homeResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_homeResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		java.util.Collection<EntityField> entityFields = getEntityFields();

		Stream<EntityField> stream = entityFields.stream();

		return stream.filter(
			entityField ->
				Objects.equals(entityField.getType(), type) &&
				!ArrayUtil.contains(
					getIgnoredEntityFieldNames(), entityField.getName())
		).collect(
			Collectors.toList()
		);
	}

	protected String getFilterString(
		EntityField entityField, String operator, Home home) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("address")) {
			sb.append("'");
			sb.append(String.valueOf(home.getAddress()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("color")) {
			sb.append("'");
			sb.append(String.valueOf(home.getColor()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("floor")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("id")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("owner")) {
			sb.append("'");
			sb.append(String.valueOf(home.getOwner()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("room")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("square")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword("test@liferay.com:test");

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected JSONObject invokeGraphQLMutation(GraphQLField graphQLField)
		throws Exception {

		GraphQLField mutationGraphQLField = new GraphQLField(
			"mutation", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(mutationGraphQLField.toString()));
	}

	protected JSONObject invokeGraphQLQuery(GraphQLField graphQLField)
		throws Exception {

		GraphQLField queryGraphQLField = new GraphQLField(
			"query", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(queryGraphQLField.toString()));
	}

	protected Home randomHome() throws Exception {
		return new Home() {
			{
				address = StringUtil.toLowerCase(RandomTestUtil.randomString());
				color = StringUtil.toLowerCase(RandomTestUtil.randomString());
				floor = RandomTestUtil.randomInt();
				id = RandomTestUtil.randomLong();
				owner = StringUtil.toLowerCase(RandomTestUtil.randomString());
				room = RandomTestUtil.randomInt();
			}
		};
	}

	protected Home randomIrrelevantHome() throws Exception {
		Home randomIrrelevantHome = randomHome();

		return randomIrrelevantHome;
	}

	protected Home randomPatchHome() throws Exception {
		return randomHome();
	}

	protected HomeResource homeResource;
	protected Group irrelevantGroup;
	protected Company testCompany;
	protected Group testGroup;

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(String key, List<GraphQLField> graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = Arrays.asList(graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			List<GraphQLField> graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(": ");
					sb.append(entry.getValue());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final Log _log = LogFactoryUtil.getLog(
		BaseHomeResourceTestCase.class);

	private static BeanUtilsBean _beanUtilsBean = new BeanUtilsBean() {

		@Override
		public void copyProperty(Object bean, String name, Object value)
			throws IllegalAccessException, InvocationTargetException {

			if (value != null) {
				super.copyProperty(bean, name, value);
			}
		}

	};
	private static DateFormat _dateFormat;

	@Inject
	private com.dogoo.poc.home.rest.resource.v1_0_0.HomeResource _homeResource;

}