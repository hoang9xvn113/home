package com.poc.home.rest.internal.graphql.query.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import com.poc.home.rest.dto.v1_0.Department;
import com.poc.home.rest.dto.v1_0.TreeDepartment;
import com.poc.home.rest.resource.v1_0.DepartmentResource;
import com.poc.home.rest.resource.v1_0.TreeDepartmentResource;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author hoang
 * @generated
 */
@Generated("")
public class Query {

	public static void setDepartmentResourceComponentServiceObjects(
		ComponentServiceObjects<DepartmentResource>
			departmentResourceComponentServiceObjects) {

		_departmentResourceComponentServiceObjects =
			departmentResourceComponentServiceObjects;
	}

	public static void setTreeDepartmentResourceComponentServiceObjects(
		ComponentServiceObjects<TreeDepartmentResource>
			treeDepartmentResourceComponentServiceObjects) {

		_treeDepartmentResourceComponentServiceObjects =
			treeDepartmentResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {department(departmentId: ___){id, name, code, parentId, businessName, ord, typeName, type, tax, address, headOffice, alias, description}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public Department department(@GraphQLName("departmentId") Long departmentId)
		throws Exception {

		return _applyComponentServiceObjects(
			_departmentResourceComponentServiceObjects,
			this::_populateResourceContext,
			departmentResource -> departmentResource.getDepartment(
				departmentId));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {departments(filter: ___, page: ___, pageSize: ___, search: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(
		description = "Retrieves the departments. Results can be paginated, filtered, searched, and sorted."
	)
	public DepartmentPage departments(
			@GraphQLName("search") String search,
			@GraphQLName("filter") String filterString,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_departmentResourceComponentServiceObjects,
			this::_populateResourceContext,
			departmentResource -> new DepartmentPage(
				departmentResource.getDepartments(
					search,
					_filterBiFunction.apply(departmentResource, filterString),
					Pagination.of(page, pageSize),
					_sortsBiFunction.apply(departmentResource, sortsString))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {treeDepartments(filter: ___, page: ___, pageSize: ___, search: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(
		description = "Retrieves the departments. Results can be paginated, filtered, searched, and sorted."
	)
	public TreeDepartmentPage treeDepartments(
			@GraphQLName("search") String search,
			@GraphQLName("filter") String filterString,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_treeDepartmentResourceComponentServiceObjects,
			this::_populateResourceContext,
			treeDepartmentResource -> new TreeDepartmentPage(
				treeDepartmentResource.getTreeDepartments(
					search,
					_filterBiFunction.apply(
						treeDepartmentResource, filterString),
					Pagination.of(page, pageSize),
					_sortsBiFunction.apply(
						treeDepartmentResource, sortsString))));
	}

	@GraphQLName("DepartmentPage")
	public class DepartmentPage {

		public DepartmentPage(Page departmentPage) {
			actions = departmentPage.getActions();

			items = departmentPage.getItems();
			lastPage = departmentPage.getLastPage();
			page = departmentPage.getPage();
			pageSize = departmentPage.getPageSize();
			totalCount = departmentPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<Department> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("TreeDepartmentPage")
	public class TreeDepartmentPage {

		public TreeDepartmentPage(Page treeDepartmentPage) {
			actions = treeDepartmentPage.getActions();

			items = treeDepartmentPage.getItems();
			lastPage = treeDepartmentPage.getLastPage();
			page = treeDepartmentPage.getPage();
			pageSize = treeDepartmentPage.getPageSize();
			totalCount = treeDepartmentPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<TreeDepartment> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(DepartmentResource departmentResource)
		throws Exception {

		departmentResource.setContextAcceptLanguage(_acceptLanguage);
		departmentResource.setContextCompany(_company);
		departmentResource.setContextHttpServletRequest(_httpServletRequest);
		departmentResource.setContextHttpServletResponse(_httpServletResponse);
		departmentResource.setContextUriInfo(_uriInfo);
		departmentResource.setContextUser(_user);
		departmentResource.setGroupLocalService(_groupLocalService);
		departmentResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			TreeDepartmentResource treeDepartmentResource)
		throws Exception {

		treeDepartmentResource.setContextAcceptLanguage(_acceptLanguage);
		treeDepartmentResource.setContextCompany(_company);
		treeDepartmentResource.setContextHttpServletRequest(
			_httpServletRequest);
		treeDepartmentResource.setContextHttpServletResponse(
			_httpServletResponse);
		treeDepartmentResource.setContextUriInfo(_uriInfo);
		treeDepartmentResource.setContextUser(_user);
		treeDepartmentResource.setGroupLocalService(_groupLocalService);
		treeDepartmentResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<DepartmentResource>
		_departmentResourceComponentServiceObjects;
	private static ComponentServiceObjects<TreeDepartmentResource>
		_treeDepartmentResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}