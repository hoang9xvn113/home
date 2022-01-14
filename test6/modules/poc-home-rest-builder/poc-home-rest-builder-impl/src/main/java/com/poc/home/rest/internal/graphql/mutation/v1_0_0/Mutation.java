package com.poc.home.rest.internal.graphql.mutation.v1_0_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import com.poc.home.rest.dto.v1_0_0.Home;
import com.poc.home.rest.dto.v1_0_0.HomeReq;
import com.poc.home.rest.resource.v1_0_0.HomeResource;

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
public class Mutation {

	public static void setHomeResourceComponentServiceObjects(
		ComponentServiceObjects<HomeResource>
			homeResourceComponentServiceObjects) {

		_homeResourceComponentServiceObjects =
			homeResourceComponentServiceObjects;
	}

	@GraphQLField
	public Home addHome(@GraphQLName("homeReq") HomeReq homeReq)
		throws Exception {

		return _applyComponentServiceObjects(
			_homeResourceComponentServiceObjects,
			this::_populateResourceContext,
			homeResource -> homeResource.addHome(homeReq));
	}

	@GraphQLField
	public boolean deleteHomeByHomeId(@GraphQLName("homeId") Long homeId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_homeResourceComponentServiceObjects,
			this::_populateResourceContext,
			homeResource -> homeResource.deleteHomeByHomeId(homeId));

		return true;
	}

	@GraphQLField
	public Home updateHomeByHomeId(
			@GraphQLName("homeId") Long homeId,
			@GraphQLName("homeReq") HomeReq homeReq)
		throws Exception {

		return _applyComponentServiceObjects(
			_homeResourceComponentServiceObjects,
			this::_populateResourceContext,
			homeResource -> homeResource.updateHomeByHomeId(homeId, homeReq));
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

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
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
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}