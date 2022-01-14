package com.dogoo.poc.employee.internal.search.result.contributor;

import com.liferay.portal.kernel.search.*;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;
import org.osgi.service.component.annotations.Component;

import java.util.Locale;

@Component(
        immediate = true,
        property = "indexer.class.name=com.dogoo.poc.employee.model.EmployeeEntry",
        service = ModelSummaryContributor.class
)
public class EmployeeModelSummaryContributor implements ModelSummaryContributor {

    @Override
    public Summary getSummary(Document document, Locale locale, String snippet) {

        Summary summary = new Summary(
                document.get(Field.NAME), document.get("asd")
        );

        summary.setMaxContentLength(200);

        return summary;
    }
}
