package com.dogoo.poc.home.rest.internal.resource.v1_0_0;

import com.dogoo.poc.home.rest.dto.v1_0_0.Home;
import com.dogoo.poc.home.rest.dto.v1_0_0.HomeReq;
import com.dogoo.poc.home.rest.internal.odata.v1_0_0.HomeEntityIndexModel;
import com.dogoo.poc.home.rest.internal.service.HomeService;
import com.dogoo.poc.home.rest.internal.validator.HomeValidator;
import com.dogoo.poc.home.rest.resource.v1_0_0.HomeResource;

import com.dogoo.poc.home.service.HomeEntryLocalService;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import javax.ws.rs.core.MultivaluedMap;

/**
 * @author hoang
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0_0/home.properties",
	scope = ServiceScope.PROTOTYPE, service = HomeResource.class
)
public class HomeResourceImpl extends BaseHomeResourceImpl {

	private HomeEntityIndexModel homeEntityIndexModel = new HomeEntityIndexModel();

	@Override
	public EntityModel getEntityModel(MultivaluedMap multivaluedMap) throws Exception {
		return homeEntityIndexModel;
	}

	@Override
	public Page<Home> getHomes(String search, Filter filter, Pagination pagination, Sort[] sorts) throws Exception {
		homeValidator.validatorForSearch(pagination);
		return homeService.getHomes(search, filter, pagination, sorts, getServiceContext());
	}

	@Override
	public Home addHome(HomeReq homeReq) throws Exception {
		homeValidator.validatorForAddHome(homeReq);
		return homeService.addHome(homeReq, getServiceContext());
	}

	@Override
	public void deleteHomeByHomeId(Long homeId) throws Exception {
		homeService.deleteHomeByHomeId(homeId);
	}

	@Override
	public Home getHomeByHomeId(Long homeId) throws Exception {
		return homeService.getHomeByHomeId(homeId);
	}

	@Override
	public Home updateHomeByHomeId(Long homeId, HomeReq homeReq) throws Exception {
		homeValidator.validatorForUpdateHome(homeId, homeReq);
		return homeService.updateHomeByHomeId(homeId, homeReq, getServiceContext());
	}

	private ServiceContext getServiceContext() {
		ServiceContext serviceContext = new ServiceContext();

		serviceContext.setCompanyId(contextCompany.getCompanyId());
		serviceContext.setUserId(contextUser.getUserId());
		serviceContext.setScopeGroupId(contextUser.getGroupId());

		return serviceContext;
	}

	@Reference
	private HomeService homeService;

	@Reference
	private HomeValidator homeValidator;

}
