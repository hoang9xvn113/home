package com.poc.home.internal.resource.v1_0_0;

import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.poc.home.dto.v1_0_0.Home;
import com.poc.home.internal.service.HomeService;
import com.poc.home.resource.v1_0_0.HomeResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author hoang
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0_0/home.properties",
	scope = ServiceScope.PROTOTYPE, service = HomeResource.class
)
public class HomeResourceImpl extends BaseHomeResourceImpl {

	@Override
	public Page<Home> getHomes(String search, Filter filter, Pagination pagination, Sort[] sorts) throws Exception {
		return homeService.getAllHomes();
	}

	@Reference
	private HomeService homeService;
}