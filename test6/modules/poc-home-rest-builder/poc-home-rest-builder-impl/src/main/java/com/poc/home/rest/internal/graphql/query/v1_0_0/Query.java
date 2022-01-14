package com.poc.home.rest.internal.graphql.query.v1_0_0;

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

import com.poc.home.rest.dto.v1_0_0.Home;
import com.poc.home.rest.resource.v1_0_0.HomeResource;

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

	public static void setHomeResourceComponentServiceObjects(
		ComponentServiceObjects<HomeResource>
			homeResourceComponentServiceObjects) {

		_homeResourceComponentServiceObjects =
			homeResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {homes(filter: ___, page: ___, pageSize: ___, search: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public HomePage homes(
			@GraphQLName("search") String search,
			@GraphQLName("filter") String filterString,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_homeResourceComponentServiceObjects,
			this::_populateResourceContext,
			homeResource -> new HomePage(
				homeResource.getHomes(
					search, _filterBiFunction.apply(homeResource, filterString),
					Pagination.of(page, pageSize),
					_sortsBiFunction.apply(homeResource, sortsString))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {homeByHomeId(homeId: ___){id, address, floor, square, room, color, owner}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public Home homeByHomeId(@GraphQLName("homeId") Long homeId)
		throws Exception {

		return _applyComponentServiceObjects(
			_homeResourceComponentServiceObjects,
			this::_populateResourceContext,
			homeResource -> homeResource.getHomeByHomeId(homeId));
	}

	@GraphQLName("HomePage")
	public class HomePage {

		public HomePage(Page homePage) {
			actions = homePage.getActions();

			items = homePage.getItems();
			lastPage = homePage.getLastPage();
			page = homePage.getPage();
			pageSize = homePage.getPageSize();
			totalCount = homePage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<Home> items;

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

	private void _populateResourceContext(HomeResource homeResource)
		throws Exception {

		homeResource.setContextAcceptLanguage(_acceptLanguage);
		homeResource.setContextCompany(_company);
		homeResource.setContextHttpServletRequest(_httpServletRequest);
		homeResource.setContextHttpServletResponse(_httpServletResponse);
		homeResource.setContextUriInfo(_uriInfo);
		homeResource.setContextUser(_user);
		homeResource.setGroupLocalService(_groupLocalService);
		homeResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<HomeResource>
		_homeResourceComponentServiceObjects;

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