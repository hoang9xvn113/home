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
import com.liferay.portal.kernel.json.JSONArray;
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

import com.poc.home.rest.client.dto.v1_0.Department;
import com.poc.home.rest.client.http.HttpInvoker;
import com.poc.home.rest.client.pagination.Page;
import com.poc.home.rest.client.pagination.Pagination;
import com.poc.home.rest.client.resource.v1_0.DepartmentResource;
import com.poc.home.rest.client.serdes.v1_0.DepartmentSerDes;

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
public abstract class BaseDepartmentResourceTestCase {

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

		_departmentResource.setContextCompany(testCompany);

		DepartmentResource.Builder builder = DepartmentResource.builder();

		departmentResource = builder.authentication(
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

		Department department1 = randomDepartment();

		String json = objectMapper.writeValueAsString(department1);

		Department department2 = DepartmentSerDes.toDTO(json);

		Assert.assertTrue(equals(department1, department2));
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

		Department department = randomDepartment();

		String json1 = objectMapper.writeValueAsString(department);
		String json2 = DepartmentSerDes.toJSON(department);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		Department department = randomDepartment();

		department.setAddress(regex);
		department.setAlias(regex);
		department.setBusinessName(regex);
		department.setCode(regex);
		department.setDescription(regex);
		department.setHeadOffice(regex);
		department.setName(regex);
		department.setTax(regex);
		department.setType(regex);
		department.setTypeName(regex);

		String json = DepartmentSerDes.toJSON(department);

		Assert.assertFalse(json.contains(regex));

		department = DepartmentSerDes.toDTO(json);

		Assert.assertEquals(regex, department.getAddress());
		Assert.assertEquals(regex, department.getAlias());
		Assert.assertEquals(regex, department.getBusinessName());
		Assert.assertEquals(regex, department.getCode());
		Assert.assertEquals(regex, department.getDescription());
		Assert.assertEquals(regex, department.getHeadOffice());
		Assert.assertEquals(regex, department.getName());
		Assert.assertEquals(regex, department.getTax());
		Assert.assertEquals(regex, department.getType());
		Assert.assertEquals(regex, department.getTypeName());
	}

	@Test
	public void testDeleteDepartment() throws Exception {
		@SuppressWarnings("PMD.UnusedLocalVariable")
		Department department = testDeleteDepartment_addDepartment();

		assertHttpResponseStatusCode(
			204,
			departmentResource.deleteDepartmentHttpResponse(
				department.getId()));

		assertHttpResponseStatusCode(
			404,
			departmentResource.getDepartmentHttpResponse(department.getId()));

		assertHttpResponseStatusCode(
			404, departmentResource.getDepartmentHttpResponse(0L));
	}

	protected Department testDeleteDepartment_addDepartment() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLDeleteDepartment() throws Exception {
		Department department = testGraphQLDepartment_addDepartment();

		Assert.assertTrue(
			JSONUtil.getValueAsBoolean(
				invokeGraphQLMutation(
					new GraphQLField(
						"deleteDepartment",
						new HashMap<String, Object>() {
							{
								put("departmentId", department.getId());
							}
						})),
				"JSONObject/data", "Object/deleteDepartment"));

		JSONArray errorsJSONArray = JSONUtil.getValueAsJSONArray(
			invokeGraphQLQuery(
				new GraphQLField(
					"department",
					new HashMap<String, Object>() {
						{
							put("departmentId", department.getId());
						}
					},
					new GraphQLField("id"))),
			"JSONArray/errors");

		Assert.assertTrue(errorsJSONArray.length() > 0);
	}

	@Test
	public void testGetDepartment() throws Exception {
		Department postDepartment = testGetDepartment_addDepartment();

		Department getDepartment = departmentResource.getDepartment(
			postDepartment.getId());

		assertEquals(postDepartment, getDepartment);
		assertValid(getDepartment);
	}

	protected Department testGetDepartment_addDepartment() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetDepartment() throws Exception {
		Department department = testGraphQLDepartment_addDepartment();

		Assert.assertTrue(
			equals(
				department,
				DepartmentSerDes.toDTO(
					JSONUtil.getValueAsString(
						invokeGraphQLQuery(
							new GraphQLField(
								"department",
								new HashMap<String, Object>() {
									{
										put("departmentId", department.getId());
									}
								},
								getGraphQLFields())),
						"JSONObject/data", "Object/department"))));
	}

	@Test
	public void testGraphQLGetDepartmentNotFound() throws Exception {
		Long irrelevantDepartmentId = RandomTestUtil.randomLong();

		Assert.assertEquals(
			"Not Found",
			JSONUtil.getValueAsString(
				invokeGraphQLQuery(
					new GraphQLField(
						"department",
						new HashMap<String, Object>() {
							{
								put("departmentId", irrelevantDepartmentId);
							}
						},
						getGraphQLFields())),
				"JSONArray/errors", "Object/0", "JSONObject/extensions",
				"Object/code"));
	}

	@Test
	public void testPatchDepartment() throws Exception {
		Department postDepartment = testPatchDepartment_addDepartment();

		Department randomPatchDepartment = randomPatchDepartment();

		@SuppressWarnings("PMD.UnusedLocalVariable")
		Department patchDepartment = departmentResource.patchDepartment(
			postDepartment.getId(), randomPatchDepartment);

		Department expectedPatchDepartment = postDepartment.clone();

		_beanUtilsBean.copyProperties(
			expectedPatchDepartment, randomPatchDepartment);

		Department getDepartment = departmentResource.getDepartment(
			patchDepartment.getId());

		assertEquals(expectedPatchDepartment, getDepartment);
		assertValid(getDepartment);
	}

	protected Department testPatchDepartment_addDepartment() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testPutDepartment() throws Exception {
		Department postDepartment = testPutDepartment_addDepartment();

		Department randomDepartment = randomDepartment();

		Department putDepartment = departmentResource.putDepartment(
			postDepartment.getId(), randomDepartment);

		assertEquals(randomDepartment, putDepartment);
		assertValid(putDepartment);

		Department getDepartment = departmentResource.getDepartment(
			putDepartment.getId());

		assertEquals(randomDepartment, getDepartment);
		assertValid(getDepartment);
	}

	protected Department testPutDepartment_addDepartment() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGetDepartments() throws Exception {
		Page<Department> page = departmentResource.getDepartments(
			RandomTestUtil.randomString(), null, Pagination.of(1, 2), null);

		Assert.assertEquals(0, page.getTotalCount());

		Department department1 = testGetDepartments_addDepartment(
			randomDepartment());

		Department department2 = testGetDepartments_addDepartment(
			randomDepartment());

		page = departmentResource.getDepartments(
			null, null, Pagination.of(1, 2), null);

		Assert.assertEquals(2, page.getTotalCount());

		assertEqualsIgnoringOrder(
			Arrays.asList(department1, department2),
			(List<Department>)page.getItems());
		assertValid(page);

		departmentResource.deleteDepartment(department1.getId());

		departmentResource.deleteDepartment(department2.getId());
	}

	@Test
	public void testGetDepartmentsWithFilterDateTimeEquals() throws Exception {
		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.DATE_TIME);

		if (entityFields.isEmpty()) {
			return;
		}

		Department department1 = randomDepartment();

		department1 = testGetDepartments_addDepartment(department1);

		for (EntityField entityField : entityFields) {
			Page<Department> page = departmentResource.getDepartments(
				null, getFilterString(entityField, "between", department1),
				Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(department1),
				(List<Department>)page.getItems());
		}
	}

	@Test
	public void testGetDepartmentsWithFilterStringEquals() throws Exception {
		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.STRING);

		if (entityFields.isEmpty()) {
			return;
		}

		Department department1 = testGetDepartments_addDepartment(
			randomDepartment());

		@SuppressWarnings("PMD.UnusedLocalVariable")
		Department department2 = testGetDepartments_addDepartment(
			randomDepartment());

		for (EntityField entityField : entityFields) {
			Page<Department> page = departmentResource.getDepartments(
				null, getFilterString(entityField, "eq", department1),
				Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(department1),
				(List<Department>)page.getItems());
		}
	}

	@Test
	public void testGetDepartmentsWithPagination() throws Exception {
		Department department1 = testGetDepartments_addDepartment(
			randomDepartment());

		Department department2 = testGetDepartments_addDepartment(
			randomDepartment());

		Department department3 = testGetDepartments_addDepartment(
			randomDepartment());

		Page<Department> page1 = departmentResource.getDepartments(
			null, null, Pagination.of(1, 2), null);

		List<Department> departments1 = (List<Department>)page1.getItems();

		Assert.assertEquals(departments1.toString(), 2, departments1.size());

		Page<Department> page2 = departmentResource.getDepartments(
			null, null, Pagination.of(2, 2), null);

		Assert.assertEquals(3, page2.getTotalCount());

		List<Department> departments2 = (List<Department>)page2.getItems();

		Assert.assertEquals(departments2.toString(), 1, departments2.size());

		Page<Department> page3 = departmentResource.getDepartments(
			null, null, Pagination.of(1, 3), null);

		assertEqualsIgnoringOrder(
			Arrays.asList(department1, department2, department3),
			(List<Department>)page3.getItems());
	}

	@Test
	public void testGetDepartmentsWithSortDateTime() throws Exception {
		testGetDepartmentsWithSort(
			EntityField.Type.DATE_TIME,
			(entityField, department1, department2) -> {
				BeanUtils.setProperty(
					department1, entityField.getName(),
					DateUtils.addMinutes(new Date(), -2));
			});
	}

	@Test
	public void testGetDepartmentsWithSortInteger() throws Exception {
		testGetDepartmentsWithSort(
			EntityField.Type.INTEGER,
			(entityField, department1, department2) -> {
				BeanUtils.setProperty(department1, entityField.getName(), 0);
				BeanUtils.setProperty(department2, entityField.getName(), 1);
			});
	}

	@Test
	public void testGetDepartmentsWithSortString() throws Exception {
		testGetDepartmentsWithSort(
			EntityField.Type.STRING,
			(entityField, department1, department2) -> {
				Class<?> clazz = department1.getClass();

				String entityFieldName = entityField.getName();

				Method method = clazz.getMethod(
					"get" + StringUtil.upperCaseFirstLetter(entityFieldName));

				Class<?> returnType = method.getReturnType();

				if (returnType.isAssignableFrom(Map.class)) {
					BeanUtils.setProperty(
						department1, entityFieldName,
						Collections.singletonMap("Aaa", "Aaa"));
					BeanUtils.setProperty(
						department2, entityFieldName,
						Collections.singletonMap("Bbb", "Bbb"));
				}
				else if (entityFieldName.contains("email")) {
					BeanUtils.setProperty(
						department1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
					BeanUtils.setProperty(
						department2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
				}
				else {
					BeanUtils.setProperty(
						department1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
					BeanUtils.setProperty(
						department2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
				}
			});
	}

	protected void testGetDepartmentsWithSort(
			EntityField.Type type,
			UnsafeTriConsumer<EntityField, Department, Department, Exception>
				unsafeTriConsumer)
		throws Exception {

		List<EntityField> entityFields = getEntityFields(type);

		if (entityFields.isEmpty()) {
			return;
		}

		Department department1 = randomDepartment();
		Department department2 = randomDepartment();

		for (EntityField entityField : entityFields) {
			unsafeTriConsumer.accept(entityField, department1, department2);
		}

		department1 = testGetDepartments_addDepartment(department1);

		department2 = testGetDepartments_addDepartment(department2);

		for (EntityField entityField : entityFields) {
			Page<Department> ascPage = departmentResource.getDepartments(
				null, null, Pagination.of(1, 2),
				entityField.getName() + ":asc");

			assertEquals(
				Arrays.asList(department1, department2),
				(List<Department>)ascPage.getItems());

			Page<Department> descPage = departmentResource.getDepartments(
				null, null, Pagination.of(1, 2),
				entityField.getName() + ":desc");

			assertEquals(
				Arrays.asList(department2, department1),
				(List<Department>)descPage.getItems());
		}
	}

	protected Department testGetDepartments_addDepartment(Department department)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetDepartments() throws Exception {
		GraphQLField graphQLField = new GraphQLField(
			"departments",
			new HashMap<String, Object>() {
				{
					put("page", 1);
					put("pageSize", 2);
				}
			},
			new GraphQLField("items", getGraphQLFields()),
			new GraphQLField("page"), new GraphQLField("totalCount"));

		JSONObject departmentsJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/departments");

		Assert.assertEquals(0, departmentsJSONObject.get("totalCount"));

		Department department1 = testGraphQLDepartment_addDepartment();
		Department department2 = testGraphQLDepartment_addDepartment();

		departmentsJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/departments");

		Assert.assertEquals(2, departmentsJSONObject.get("totalCount"));

		assertEqualsIgnoringOrder(
			Arrays.asList(department1, department2),
			Arrays.asList(
				DepartmentSerDes.toDTOs(
					departmentsJSONObject.getString("items"))));
	}

	@Test
	public void testAddDepartment() throws Exception {
		Department randomDepartment = randomDepartment();

		Department postDepartment = testAddDepartment_addDepartment(
			randomDepartment);

		assertEquals(randomDepartment, postDepartment);
		assertValid(postDepartment);
	}

	protected Department testAddDepartment_addDepartment(Department department)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Rule
	public SearchTestRule searchTestRule = new SearchTestRule();

	protected Department testGraphQLDepartment_addDepartment()
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
		Department department1, Department department2) {

		Assert.assertTrue(
			department1 + " does not equal " + department2,
			equals(department1, department2));
	}

	protected void assertEquals(
		List<Department> departments1, List<Department> departments2) {

		Assert.assertEquals(departments1.size(), departments2.size());

		for (int i = 0; i < departments1.size(); i++) {
			Department department1 = departments1.get(i);
			Department department2 = departments2.get(i);

			assertEquals(department1, department2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<Department> departments1, List<Department> departments2) {

		Assert.assertEquals(departments1.size(), departments2.size());

		for (Department department1 : departments1) {
			boolean contains = false;

			for (Department department2 : departments2) {
				if (equals(department1, department2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				departments2 + " does not contain " + department1, contains);
		}
	}

	protected void assertValid(Department department) throws Exception {
		boolean valid = true;

		if (department.getId() == null) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("address", additionalAssertFieldName)) {
				if (department.getAddress() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("alias", additionalAssertFieldName)) {
				if (department.getAlias() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("businessName", additionalAssertFieldName)) {
				if (department.getBusinessName() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("code", additionalAssertFieldName)) {
				if (department.getCode() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("description", additionalAssertFieldName)) {
				if (department.getDescription() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("headOffice", additionalAssertFieldName)) {
				if (department.getHeadOffice() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (department.getName() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("ord", additionalAssertFieldName)) {
				if (department.getOrd() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("parentId", additionalAssertFieldName)) {
				if (department.getParentId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("tax", additionalAssertFieldName)) {
				if (department.getTax() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("type", additionalAssertFieldName)) {
				if (department.getType() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("typeName", additionalAssertFieldName)) {
				if (department.getTypeName() == null) {
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

	protected void assertValid(Page<Department> page) {
		boolean valid = false;

		java.util.Collection<Department> departments = page.getItems();

		int size = departments.size();

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
					com.poc.home.rest.dto.v1_0.Department.class)) {

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

	protected boolean equals(Department department1, Department department2) {
		if (department1 == department2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("address", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getAddress(), department2.getAddress())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("alias", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getAlias(), department2.getAlias())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("businessName", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getBusinessName(),
						department2.getBusinessName())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("code", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getCode(), department2.getCode())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("description", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getDescription(),
						department2.getDescription())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("headOffice", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getHeadOffice(),
						department2.getHeadOffice())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getId(), department2.getId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getName(), department2.getName())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("ord", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getOrd(), department2.getOrd())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("parentId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getParentId(), department2.getParentId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("tax", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getTax(), department2.getTax())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("type", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getType(), department2.getType())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("typeName", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						department1.getTypeName(), department2.getTypeName())) {

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

		if (!(_departmentResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_departmentResource;

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
		EntityField entityField, String operator, Department department) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("address")) {
			sb.append("'");
			sb.append(String.valueOf(department.getAddress()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("alias")) {
			sb.append("'");
			sb.append(String.valueOf(department.getAlias()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("businessName")) {
			sb.append("'");
			sb.append(String.valueOf(department.getBusinessName()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("code")) {
			sb.append("'");
			sb.append(String.valueOf(department.getCode()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("description")) {
			sb.append("'");
			sb.append(String.valueOf(department.getDescription()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("headOffice")) {
			sb.append("'");
			sb.append(String.valueOf(department.getHeadOffice()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("id")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("name")) {
			sb.append("'");
			sb.append(String.valueOf(department.getName()));
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
			sb.append(String.valueOf(department.getTax()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("type")) {
			sb.append("'");
			sb.append(String.valueOf(department.getType()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("typeName")) {
			sb.append("'");
			sb.append(String.valueOf(department.getTypeName()));
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

	protected Department randomDepartment() throws Exception {
		return new Department() {
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

	protected Department randomIrrelevantDepartment() throws Exception {
		Department randomIrrelevantDepartment = randomDepartment();

		return randomIrrelevantDepartment;
	}

	protected Department randomPatchDepartment() throws Exception {
		return randomDepartment();
	}

	protected DepartmentResource departmentResource;
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
		BaseDepartmentResourceTestCase.class);

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
	private com.poc.home.rest.resource.v1_0.DepartmentResource
		_departmentResource;

}