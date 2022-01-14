package com.dogoo.poc.employee.internal.search.indexer.contributor;

import com.dogoo.poc.employee.model.EmployeeEntry;
import com.dogoo.poc.employee.service.EmployeeEntryLocalService;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.batch.BatchIndexingActionable;
import com.liferay.portal.search.batch.DynamicQueryBatchIndexingActionableFactory;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.index.contributor.helper.IndexerWriterMode;
import com.liferay.portal.search.spi.model.index.contributor.helper.ModelIndexerWriterDocumentHelper;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        property = "indexer.class.name=com.dogoo.poc.employee.model.EmployeeEntry",
        service = ModelIndexerWriterContributor.class
)
public class EmployeeEntryModelIndexerWriterContributor implements ModelIndexerWriterContributor<EmployeeEntry> {

    @Override
    public void customize(BatchIndexingActionable batchIndexingActionable, ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {
        batchIndexingActionable.setPerformActionMethod((EmployeeEntry employeeEntry) -> {
            Document document = modelIndexerWriterDocumentHelper.getDocument(employeeEntry);

            batchIndexingActionable.addDocuments(document);
        });
    }

    @Override
    public IndexerWriterMode getIndexerWriterMode(EmployeeEntry baseModel) {
        return IndexerWriterMode.UPDATE;
    }

    @Override
    public void modelIndexed(EmployeeEntry baseModel) {
        ModelIndexerWriterContributor.super.modelIndexed(baseModel);
    }

    @Override
    public BatchIndexingActionable getBatchIndexingActionable() {
        return dynamicQueryBatchIndexingActionableFactory.getBatchIndexingActionable(employeeEntryLocalService.getIndexableActionableDynamicQuery());
    }

    @Override
    public long getCompanyId(EmployeeEntry baseModel) {
        return baseModel.getCompanyId();
    }

    @Reference
    private EmployeeEntryLocalService employeeEntryLocalService;

    @Reference
    private DynamicQueryBatchIndexingActionableFactory dynamicQueryBatchIndexingActionableFactory;
}
