package com.dogoo.poc.employee.internal.search.indexer.contributor;

import com.dogoo.poc.employee.model.EmployeeEntry;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true,
        property = "indexer.class.name=com.dogoo.poc.employee.model.EmployeeEntry"
)
public class EmployeeEntryModelDocumentContributor implements ModelDocumentContributor<EmployeeEntry> {

    @Override
    public void contribute(Document document, EmployeeEntry baseModel) {
        document.addText(Field.NAME, baseModel.getName());


    }
}
