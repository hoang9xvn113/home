package com.poc.home.rest.internal.graphql.servlet.v1_0_0;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import com.poc.home.rest.internal.graphql.mutation.v1_0_0.Mutation;
import com.poc.home.rest.internal.graphql.query.v1_0_0.Query;
import com.poc.home.rest.resource.v1_0_0.HomeResource;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author hoang
 * @generated
 */
@Component(immediate = true, service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setHomeResourceComponentServiceObjects(
			_homeResourceComponentServiceObjects);

		Query.setHomeResourceComponentServiceObjects(
			_homeResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/poc-home-rest-builder-graphql/v1_0_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<HomeResource>
		_homeResourceComponentServiceObjects;

}