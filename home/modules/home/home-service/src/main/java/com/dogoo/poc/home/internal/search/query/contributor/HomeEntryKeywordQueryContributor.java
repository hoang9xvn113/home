package com.dogoo.poc.home.internal.search.query.contributor;

import com.dogoo.poc.home.constant.IndexerEntry;
import com.dogoo.poc.home.constant.SearchField;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.search.query.QueryHelper;
import com.liferay.portal.search.spi.model.query.contributor.KeywordQueryContributor;
import com.liferay.portal.search.spi.model.query.contributor.helper.KeywordQueryContributorHelper;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        property = IndexerEntry.ENTRY,
        service = KeywordQueryContributor.class
)
public class HomeEntryKeywordQueryContributor implements KeywordQueryContributor {
    @Override
    public void contribute(String keywords, BooleanQuery booleanQuery, KeywordQueryContributorHelper keywordQueryContributorHelper) {
        SearchContext searchContext = keywordQueryContributorHelper.getSearchContext();

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, SearchField.ADDRESS, false
        );

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, SearchField.FLOOR, false
        );

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, SearchField.SQUARE, false
        );

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, SearchField.ROOM, false
        );

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, SearchField.COLOR, false
        );

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, SearchField.OWNER, false
        );
    }

    @Reference
    private QueryHelper queryHelper;
}
