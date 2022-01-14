package com.poc.home.rest.internal.resource.v1_0;

import com.poc.home.rest.resource.v1_0.TreeDepartmentResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author hoang
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/tree-department.properties",
	scope = ServiceScope.PROTOTYPE, service = TreeDepartmentResource.class
)
public class TreeDepartmentResourceImpl extends BaseTreeDepartmentResourceImpl {
}