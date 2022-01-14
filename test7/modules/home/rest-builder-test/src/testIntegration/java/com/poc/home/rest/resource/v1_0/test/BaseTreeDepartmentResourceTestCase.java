package com.poc.home.rest.resource.v1_0.test;

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

import com.poc.home.rest.client.dto.v1_0.TreeDepartment;
import com.poc.home.rest.client.http.HttpInvoker;
import com.poc.home.rest.client.pagination.Page;
import com.poc.home.rest.client.pagination.Pagination;
import com.poc.home.rest.client.resource.v1_0.TreeDepartmentResource;
import com.poc.home.rest.client.serdes.v1_0.TreeDepartmentSerDes;

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
public abstract class BaseTreeDepartmentResourceTestCase {

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

		_treeDepartmentResource.setContextCompany(testCompany);

		TreeDepartmentResource.Builder builder =
			TreeDepartmentResource.builder();

		treeDepartmentResource = builder.authentication(
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

		TreeDepartment treeDepartment1 = randomTreeDepartment();

		String json = objectMapper.writeValueAsString(treeDepartment1);

		TreeDepartment treeDepartment2 = TreeDepartmentSerDes.toDTO(json);

		Assert.assertTrue(equals(treeDepartment1, treeDepartment2));
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

		TreeDepartment treeDepartment = randomTreeDepartment();

		String json1 = objectMapper.writeValueAsString(treeDepartment);
		String json2 = TreeDepartmentSerDes.toJSON(treeDepartment);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		TreeDepartment treeDepartment = randomTreeDepartment();

		treeDepartment.setAddress(regex);
		treeDepartment.setAlias(regex);
		treeDepartment.setBusinessName(regex);
		treeDepartment.setCode(regex);
		treeDepartment.setDescription(regex);
		treeDepartment.setHeadOffice(regex);
		treeDepartment.setName(regex);
		treeDepartment.setTax(regex);
		treeDepartment.setType(regex);
		treeDepartment.setTypeName(regex);

		String json = TreeDepartmentSerDes.toJSON(treeDepartment);

		Assert.assertFalse(json.contains(regex));

		treeDepartment = TreeDepartmentSerDes.toDTO(json);

		Assert.assertEquals(regex, treeDepartment.getAddress());
		Assert.assertEquals(regex, treeDepartment.getAlias());
		Assert.assertEquals(regex, treeDepartment.getBusinessName());
		Assert.assertEquals(regex, treeDepartment.getCode());
		Assert.assertEquals(regex, treeDepartment.getDescription());
		Assert.assertEquals(regex, treeDepartment.getHeadOffice());
		Assert.assertEquals(regex, treeDepartment.getName());
		Assert.assertEquals(regex, treeDepartment.getTax());
		Assert.assertEquals(regex, treeDepartment.getType());
		Assert.assertEquals(regex, treeDepartment.getTypeName());
	}

	@Test
	public void testGetTreeDepartments() throws Exception {
		Page<TreeDepartment> page = treeDepartmentResource.getTreeDepartments(
			RandomTestUtil.randomString(), null, Pagination.of(1, 2), null);

		Assert.assertEquals(0, page.getTotalCount());

		TreeDepartment treeDepartment1 =
			testGetTreeDepartments_addTreeDepartment(randomTreeDepartment());

		TreeDepartment treeDepartment2 =
			testGetTreeDepartments_addTreeDepartment(randomTreeDepartment());

		page = treeDepartmentResource.getTreeDepartments(
			null, null, Pagination.of(1, 2), null);

		Assert.assertEquals(2, page.getTotalCount());

		assertEqualsIgnoringOrder(
			Arrays.asList(treeDepartment1, treeDepartment2),
			(List<TreeDepartment>)page.getItems());
		assertValid(page);
	}

	@Test
	public void testGetTreeDepartmentsWithFilterDateTimeEquals()
		throws Exception {

		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.DATE_TIME);

		if (entityFields.isEmpty()) {
			return;
		}

		TreeDepartment treeDepartment1 = randomTreeDepartment();

		treeDepartment1 = testGetTreeDepartments_addTreeDepartment(
			treeDepartment1);

		for (EntityField entityField : entityFields) {
			Page<TreeDepartment> page =
				treeDepartmentResource.getTreeDepartments(
					null,
					getFilterString(entityField, "between", treeDepartment1),
					Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(treeDepartment1),
				(List<TreeDepartment>)page.getItems());
		}
	}

	@Test
	public void testGetTreeDepartmentsWithFilterStringEquals()
		throws Exception {

		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.STRING);

		if (entityFields.isEmpty()) {
			return;
		}

		TreeDepartment treeDepartment1 =
			testGetTreeDepartments_addTreeDepartment(randomTreeDepartment());

		@SuppressWarnings("PMD.UnusedLocalVariable")
		TreeDepartment treeDepartment2 =
			testGetTreeDepartments_addTreeDepartment(randomTreeDepartment());

		for (EntityField entityField : entityFields) {
			Page<TreeDepartment> page =
				treeDepartmentResource.getTreeDepartments(
					null, getFilterString(entityField, "eq", treeDepartment1),
					Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(treeDepartment1),
				(List<TreeDepartment>)page.getItems());
		}
	}

	@Test
	public void testGetTreeDepartmentsWithPagination() throws Exception {
		TreeDepartment treeDepartment1 =
			testGetTreeDepartments_addTreeDepartment(randomTreeDepartment());

		TreeDepartment treeDepartment2 =
			testGetTreeDepartments_addTreeDepartment(randomTreeDepartment());

		TreeDepartment treeDepartment3 =
			testGetTreeDepartments_addTreeDepartment(randomTreeDepartment());

		Page<TreeDepartment> page1 = treeDepartmentResource.getTreeDepartments(
			null, null, Pagination.of(1, 2), null);

		List<TreeDepartment> treeDepartments1 =
			(List<TreeDepartment>)page1.getItems();

		Assert.assertEquals(
			treeDepartments1.toString(), 2, treeDepartments1.size());

		Page<TreeDepartment> page2 = treeDepartmentResource.getTreeDepartments(
			null, null, Pagination.of(2, 2), null);

		Assert.assertEquals(3, page2.getTotalCount());

		List<TreeDepartment> treeDepartments2 =
			(List<TreeDepartment>)page2.getItems();

		Assert.assertEquals(
			treeDepartments2.toString(), 1, treeDepartments2.size());

		Page<TreeDepartment> page3 = treeDepartmentResource.getTreeDepartments(
			null, null, Pagination.of(1, 3), null);

		assertEqualsIgnoringOrder(
			Arrays.asList(treeDepartment1, treeDepartment2, treeDepartment3),
			(List<TreeDepartment>)page3.getItems());
	}

	@Test
	public void testGetTreeDepartmentsWithSortDateTime() throws Exception {
		testGetTreeDepartmentsWithSort(
			EntityField.Type.DATE_TIME,
			(entityField, treeDepartment1, treeDepartment2) -> {
				BeanUtils.setProperty(
					treeDepartment1, entityField.getName(),
					DateUtils.addMinutes(new Date(), -2));
			});
	}

	@Test
	public void testGetTreeDepartmentsWithSortInteger() throws Exception {
		testGetTreeDepartmentsWithSort(
			EntityField.Type.INTEGER,
			(entityField, treeDepartment1, treeDepartment2) -> {
				BeanUtils.setProperty(
					treeDepartment1, entityField.getName(), 0);
				BeanUtils.setProperty(
					treeDepartment2, entityField.getName(), 1);
			});
	}

	@Test
	public void testGetTreeDepartmentsWithSortString() throws Exception {
		testGetTreeDepartmentsWithSort(
			EntityField.Type.STRING,
			(entityField, treeDepartment1, treeDepartment2) -> {
				Class<?> clazz = treeDepartment1.getClass();

				String entityFieldName = entityField.getName();

				Method method = clazz.getMethod(
					"get" + StringUtil.upperCaseFirstLetter(entityFieldName));

				Class<?> returnType = method.getReturnType();

				if (returnType.isAssignableFrom(Map.class)) {
					BeanUtils.setProperty(
						treeDepartment1, entityFieldName,
						Collections.singletonMap("Aaa", "Aaa"));
					BeanUtils.setProperty(
						treeDepartment2, entityFieldName,
						Collections.singletonMap("Bbb", "Bbb"));
				}
				else if (entityFieldName.contains("email")) {
					BeanUtils.setProperty(
						treeDepartment1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
					BeanUtils.setProperty(
						treeDepartment2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
				}
				else {
					BeanUtils.setProperty(
						treeDepartment1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
					BeanUtils.setProperty(
						treeDepartment2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
				}
			});
	}

	protected void testGetTreeDepartmentsWithSort(
			EntityField.Type type,
			UnsafeTriConsumer
				<EntityField, TreeDepartment, TreeDepartment, Exception>
					unsafeTriConsumer)
		throws Exception {

		List<EntityField> entityFields = getEntityFields(type);

		if (entityFields.isEmpty()) {
			return;
		}

		TreeDepartment treeDepartment1 = randomTreeDepartment();
		TreeDepartment treeDepartment2 = randomTreeDepartment();

		for (EntityField entityField : entityFields) {
			unsafeTriConsumer.accept(
				entityField, treeDepartment1, treeDepartment2);
		}

		treeDepartment1 = testGetTreeDepartments_addTreeDepartment(
			treeDepartment1);

		treeDepartment2 = testGetTreeDepartments_addTreeDepartment(
			treeDepartment2);

		for (EntityField entityField : entityFields) {
			Page<TreeDepartment> ascPage =
				treeDepartmentResource.getTreeDepartments(
					null, null, Pagination.of(1, 2),
					entityField.getName() + ":asc");

			assertEquals(
				Arrays.asList(treeDepartment1, treeDepartment2),
				(List<TreeDepartment>)ascPage.getItems());

			Page<TreeDepartment> descPage =
				treeDepartmentResource.getTreeDepartments(
					null, null, Pagination.of(1, 2),
					entityField.getName() + ":desc");

			assertEquals(
				Arrays.asList(treeDepartment2, treeDepartment1),
				(List<TreeDepartment>)descPage.getItems());
		}
	}

	protected TreeDepartment testGetTreeDepartments_addTreeDepartment(
			TreeDepartment treeDepartment)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetTreeDepartments() throws Exception {
		GraphQLField graphQLField = new GraphQLField(
			"treeDepartments",
			new HashMap<String, Object>() {
				{
					put("page", 1);
					put("pageSize", 2);
				}
			},
			new GraphQLField("items", getGraphQLFields()),
			new GraphQLField("page"), new GraphQLField("totalCount"));

		JSONObject treeDepartmentsJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/treeDepartments");

		Assert.assertEquals(0, treeDepartmentsJSONObject.get("totalCount"));

		TreeDepartment treeDepartment1 =
			testGraphQLTreeDepartment_addTreeDepartment();
		TreeDepartment treeDepartment2 =
			testGraphQLTreeDepartment_addTreeDepartment();

		treeDepartmentsJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/treeDepartments");

		Assert.assertEquals(2, treeDepartmentsJSONObject.get("totalCount"));

		assertEqualsIgnoringOrder(
			Arrays.asList(treeDepartment1, treeDepartment2),
			Arrays.asList(
				TreeDepartmentSerDes.toDTOs(
					treeDepartmentsJSONObject.getString("items"))));
	}

	@Rule
	public SearchTestRule searchTestRule = new SearchTestRule();

	protected TreeDepartment testGraphQLTreeDepartment_addTreeDepartment()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(
		TreeDepartment treeDepartment1, TreeDepartment treeDepartment2) {

		Assert.assertTrue(
			treeDepartment1 + " does not equal " + treeDepartment2,
			equals(treeDepartment1, treeDepartment2));
	}

	protected void assertEquals(
		List<TreeDepartment> treeDepartments1,
		List<TreeDepartment> treeDepartments2) {

		Assert.assertEquals(treeDepartments1.size(), treeDepartments2.size());

		for (int i = 0; i < treeDepartments1.size(); i++) {
			TreeDepartment treeDepartment1 = treeDepartments1.get(i);
			TreeDepartment treeDepartment2 = treeDepartments2.get(i);

			assertEquals(treeDepartment1, treeDepartment2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<TreeDepartment> treeDepartments1,
		List<TreeDepartment> treeDepartments2) {

		Assert.assertEquals(treeDepartments1.size(), treeDepartments2.size());

		for (TreeDepartment treeDepartment1 : treeDepartments1) {
			boolean contains = false;

			for (TreeDepartment treeDepartment2 : treeDepartments2) {
				if (equals(treeDepartment1, treeDepartment2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				treeDepartments2 + " does not contain " + treeDepartment1,
				contains);
		}
	}

	protected void assertValid(TreeDepartment treeDepartment) throws Exception {
		boolean valid = true;

		if (treeDepartment.getId() == null) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("address", additionalAssertFieldName)) {
				if (treeDepartment.getAddress() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("alias", additionalAssertFieldName)) {
				if (treeDepartment.getAlias() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("businessName", additionalAssertFieldName)) {
				if (treeDepartment.getBusinessName() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("code", additionalAssertFieldName)) {
				if (treeDepartment.getCode() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("description", additionalAssertFieldName)) {
				if (treeDepartment.getDescription() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("headOffice", additionalAssertFieldName)) {
				if (treeDepartment.getHeadOffice() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (treeDepartment.getName() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("ord", additionalAssertFieldName)) {
				if (treeDepartment.getOrd() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("parentId", additionalAssertFieldName)) {
				if (treeDepartment.getParentId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("tax", additionalAssertFieldName)) {
				if (treeDepartment.getTax() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("treeDepartments", additionalAssertFieldName)) {
				if (treeDepartment.getTreeDepartments() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("type", additionalAssertFieldName)) {
				if (treeDepartment.getType() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("typeName", additionalAssertFieldName)) {
				if (treeDepartment.getTypeName() == null) {
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

	protected void assertValid(Page<TreeDepartment> page) {
		boolean valid = false;

		java.util.Collection<TreeDepartment> treeDepartments = page.getItems();

		int size = treeDepartments.size();

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
					com.poc.home.rest.dto.v1_0.TreeDepartment.class)) {

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

	protected boolean equals(
		TreeDepartment treeDepartment1, TreeDepartment treeDepartment2) {

		if (treeDepartment1 == treeDepartment2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("address", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getAddress(),
						treeDepartment2.getAddress())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("alias", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getAlias(),
						treeDepartment2.getAlias())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("businessName", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getBusinessName(),
						treeDepartment2.getBusinessName())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("code", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getCode(), treeDepartment2.getCode())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("description", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getDescription(),
						treeDepartment2.getDescription())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("headOffice", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getHeadOffice(),
						treeDepartment2.getHeadOffice())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getId(), treeDepartment2.getId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getName(), treeDepartment2.getName())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("ord", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getOrd(), treeDepartment2.getOrd())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("parentId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getParentId(),
						treeDepartment2.getParentId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("tax", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getTax(), treeDepartment2.getTax())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("treeDepartments", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getTreeDepartments(),
						treeDepartment2.getTreeDepartments())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("type", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getType(), treeDepartment2.getType())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("typeName", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						treeDepartment1.getTypeName(),
						treeDepartment2.getTypeName())) {

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

		if (!(_treeDepartmentResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_treeDepartmentResource;

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
		EntityField entityField, String operator,
		TreeDepartment treeDepartment) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("address")) {
			sb.append("'");
			sb.append(String.valueOf(treeDepartment.getAddress()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("alias")) {
			sb.append("'");
			sb.append(String.valueOf(treeDepartment.getAlias()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("businessName")) {
			sb.append("'");
			sb.append(String.valueOf(treeDepartment.getBusinessName()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("code")) {
			sb.append("'");
			sb.append(String.valueOf(treeDepartment.getCode()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("description")) {
			sb.append("'");
			sb.append(String.valueOf(treeDepartment.getDescription()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("headOffice")) {
			sb.append("'");
			sb.append(String.valueOf(treeDepartment.getHeadOffice()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("id")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("name")) {
			sb.append("'");
			sb.append(String.valueOf(treeDepartment.getName()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("ord")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("parentId")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("tax")) {
			sb.append("'");
			sb.append(String.valueOf(treeDepartment.getTax()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("treeDepartments")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("type")) {
			sb.append("'");
			sb.append(String.valueOf(treeDepartment.getType()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("typeName")) {
			sb.append("'");
			sb.append(String.valueOf(treeDepartment.getTypeName()));
			sb.append("'");

			return sb.toString();
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

	protected TreeDepartment randomTreeDepartment() throws Exception {
		return new TreeDepartment() {
			{
				address = StringUtil.toLowerCase(RandomTestUtil.randomString());
				alias = StringUtil.toLowerCase(RandomTestUtil.randomString());
				businessName = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				code = StringUtil.toLowerCase(RandomTestUtil.randomString());
				description = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				headOffice = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				id = RandomTestUtil.randomLong();
				name = StringUtil.toLowerCase(RandomTestUtil.randomString());
				ord = RandomTestUtil.randomInt();
				parentId = RandomTestUtil.randomLong();
				tax = StringUtil.toLowerCase(RandomTestUtil.randomString());
				type = StringUtil.toLowerCase(RandomTestUtil.randomString());
				typeName = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
			}
		};
	}

	protected TreeDepartment randomIrrelevantTreeDepartment() throws Exception {
		TreeDepartment randomIrrelevantTreeDepartment = randomTreeDepartment();

		return randomIrrelevantTreeDepartment;
	}

	protected TreeDepartment randomPatchTreeDepartment() throws Exception {
		return randomTreeDepartment();
	}

	protected TreeDepartmentResource treeDepartmentResource;
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
		BaseTreeDepartmentResourceTestCase.class);

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
	private com.poc.home.rest.resource.v1_0.TreeDepartmentResource
		_treeDepartmentResource;

}