package com.poc.home.internal.search.result.contributor;

import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;
import com.poc.home.constant.IndexerEntry;
import com.poc.home.constant.SearchField;
import org.osgi.service.component.annotations.Component;

import java.util.Locale;

@Component(
        immediate = true,
        property = IndexerEntry.ENTRY,
        service = ModelSummaryContributor.class
)
public class HomeModelSummaryContributor implements ModelSummaryContributor{

    @Override
    public Summary getSummary(Document document, Locale locale, String snippet) {
        Summary summary = new Summary(
                document.get(SearchField.ROOM),
                document.get(SearchField.ADDRESS)
        );

        summary.setMaxContentLength(200);

        return summary;
    }
}
