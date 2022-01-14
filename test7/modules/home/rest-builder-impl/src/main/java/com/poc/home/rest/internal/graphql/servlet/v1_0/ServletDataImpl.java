package com.poc.home.rest.internal.graphql.servlet.v1_0;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import com.poc.home.rest.internal.graphql.mutation.v1_0.Mutation;
import com.poc.home.rest.internal.graphql.query.v1_0.Query;
import com.poc.home.rest.resource.v1_0.DepartmentResource;
import com.poc.home.rest.resource.v1_0.TreeDepartmentResource;

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
		Mutation.setDepartmentResourceComponentServiceObjects(
			_departmentResourceComponentServiceObjects);

		Query.setDepartmentResourceComponentServiceObjects(
			_departmentResourceComponentServiceObjects);
		Query.setTreeDepartmentResourceComponentServiceObjects(
			_treeDepartmentResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/rest-builder-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<DepartmentResource>
		_departmentResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<TreeDepartmentResource>
		_treeDepartmentResourceComponentServiceObjects;

}