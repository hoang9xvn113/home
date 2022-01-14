package com.dogoo.poc.home.rest.internal.service;

import com.dogoo.poc.home.model.HomeEntry;
import com.dogoo.poc.home.rest.dto.v1_0_0.Home;
import com.dogoo.poc.home.rest.dto.v1_0_0.HomeReq;
import com.dogoo.poc.home.rest.internal.mapper.HomeMapper;
import com.dogoo.poc.home.service.HomeEntryLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.util.SearchUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Collections;

@Component(
        immediate = true,
        service = com.dogoo.poc.home.rest.internal.service.HomeService.class
)
public class HomeService {

    public Home getHomeByHomeId(long homeId) throws PortalException{
        Home home = homeMapper.mapHomeFromHomeEntry(
                homeEntryLocalService.getHomeByHomeId(homeId)
        );

        return home;
    }

    public Home updateHomeByHomeId(long homeId, HomeReq homeReq, ServiceContext serviceContext) throws PortalException {
        Home home = homeMapper.mapHomeFromHomeEntry(
                homeEntryLocalService.updateHomeEntryByHomeId(
                        homeId, homeReq.getAddress(),
                        homeReq.getFloor(), homeReq.getSquare(),
                        homeReq.getRoom(), homeReq.getColor(),
                        homeReq.getOwner(), serviceContext
                )
        );

        return home;
    }

    public Home deleteHomeByHomeId(long homeId) throws PortalException{
        Home home = homeMapper.mapHomeFromHomeEntry(
                homeEntryLocalService.deleteHomeEntry(homeId)
        );

        return home;
    }

    public Home addHome(HomeReq homeReq, ServiceContext serviceContext) {
        Home home = homeMapper.mapHomeFromHomeEntry(
                homeEntryLocalService.createHomeEntry(
                        homeReq.getAddress(), homeReq.getFloor(),
                        homeReq.getSquare(), homeReq.getRoom(),
                        homeReq.getColor(), homeReq.getOwner(),
                        serviceContext
                )
        );

        return home;
    }

    public Page<Home> getHomes(String search, Filter filter,
                               Pagination pagination, Sort[] sorts,
                               ServiceContext serviceContext) throws Exception{
        return SearchUtil.search(
                Collections.emptyMap(),
                booleanQuery -> {
                    // does nothing, we just need the UnsafeConsumer<BooleanQuery, Exception> method
                },
                filter, HomeEntry.class, search, pagination,
                queryConfig -> queryConfig.setSelectedFieldNames(
                        Field.ENTRY_CLASS_PK),
                searchContext -> searchContext.setCompanyId(
                        serviceContext.getCompanyId()),
                sorts,
                document -> homeMapper.mapHomeFromHomeEntry(
                        homeEntryLocalService.getHomeEntry(
                                GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK)))));
    }


    @Reference
    private HomeMapper homeMapper;

    @Reference
    private HomeEntryLocalService homeEntryLocalService;
}
