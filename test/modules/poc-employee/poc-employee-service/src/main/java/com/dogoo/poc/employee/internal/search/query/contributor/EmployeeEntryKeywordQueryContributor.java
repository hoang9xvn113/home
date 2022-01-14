package com.dogoo.poc.employee.internal.search.query.contributor;

import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.search.query.QueryHelper;
import com.liferay.portal.search.spi.model.permission.SearchPermissionFieldContributor;
import com.liferay.portal.search.spi.model.query.contributor.KeywordQueryContributor;
import com.liferay.portal.search.spi.model.query.contributor.helper.KeywordQueryContributorHelper;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true,
        property = "indexer.class.name=com.dogoo.poc.employee.model.EmployeeEntry"
)
public class EmployeeEntryKeywordQueryContributor implements KeywordQueryContributor {

    @Reference
    protected QueryHelper queryHelper;

    @Override
    public void contribute(String keywords, BooleanQuery booleanQuery, KeywordQueryContributorHelper keywordQueryContributorHelper) {
        SearchContext searchContext =
                keywordQueryContributorHelper.getSearchContext();

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, Field.NAME, true
        );
    }
}
