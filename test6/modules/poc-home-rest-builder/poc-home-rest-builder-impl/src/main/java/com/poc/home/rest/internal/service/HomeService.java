package com.poc.home.rest.internal.service;

import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.util.SearchUtil;
import com.poc.home.model.HomeEntry;
import com.poc.home.rest.dto.v1_0_0.Home;
import com.poc.home.rest.internal.mapper.HomeMapper;
import com.poc.home.service.HomeEntryLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Collections;

@Component(
        immediate = true,
        service = HomeService.class
)
public class HomeService {

    public Page<Home> getAllHomes() {
        return Page.of(
                homeMapper.mapListHomeFromHomeEntries(
                        homeEntryLocalService.getAllHomes()
                )
        );
    }

//    public Page<Home> getHomes(String search, Filter filter,
//                               Pagination pagination, Sort[] sorts,
//                               ServiceContext serviceContext) throws Exception{
//        return SearchUtil.search(
//          Collections.emptyMap(),
//          booleanQuery -> {},
//          filter, HomeEntry.class, search, pagination,
//          queryConfig -> queryConfig.setSelectedFieldNames(Field.ENTRY_CLASS_NAME),searchContext -> searchContext.setCompanyId(serviceContext.getCompanyId()),
//            sorts,
//            document -> homeMapper.mapHomeFromHomeEntry(homeEntryLocalService.getHomeEntry(GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK))))
//        );
//    }

    @Reference
    private HomeMapper homeMapper;

    @Reference
    private HomeEntryLocalService homeEntryLocalService;
}
