package com.poc.home.internal.search.query.contributor;

import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.search.query.QueryHelper;
import com.liferay.portal.search.spi.model.query.contributor.KeywordQueryContributor;
import com.liferay.portal.search.spi.model.query.contributor.helper.KeywordQueryContributorHelper;
import com.poc.home.constant.IndexerEntry;
import com.poc.home.constant.SearchField;
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
                booleanQuery, searchContext, Field.NAME, true
        );

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, SearchField.ADDRESS, true
        );

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, SearchField.FLOOR, true
        );

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, SearchField.SQUARE, true
        );

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, SearchField.ROOM, true
        );

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, SearchField.COLOR, true
        );

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, SearchField.OWNER, true
        );
    }

    @Reference
    private QueryHelper queryHelper;
}
