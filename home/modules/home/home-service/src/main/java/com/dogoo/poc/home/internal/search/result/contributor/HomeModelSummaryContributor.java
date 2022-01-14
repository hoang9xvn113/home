package com.dogoo.poc.home.internal.search.result.contributor;

import com.dogoo.poc.home.constant.IndexerEntry;
import com.dogoo.poc.home.constant.SearchField;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;
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
                document.get(SearchField.ADDRESS),
                document.get(SearchField.SQUARE)
        );

        summary.setMaxContentLength(200);

        return summary;
    }
}
