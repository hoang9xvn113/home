package com.dogoo.poc.home.internal.search.indexer.contributor;

import com.dogoo.poc.home.constant.IndexerEntry;
import com.dogoo.poc.home.model.HomeEntry;
import com.dogoo.poc.home.service.HomeEntryLocalService;
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
        property = IndexerEntry.ENTRY,
        service = ModelIndexerWriterContributor.class
)
public class HomeEntryModelIndexerWriterContributor implements ModelIndexerWriterContributor<HomeEntry> {

    @Override
    public IndexerWriterMode getIndexerWriterMode(HomeEntry baseModel) {
        return IndexerWriterMode.UPDATE;
    }

    @Override
    public void modelIndexed(HomeEntry baseModel) {
        ModelIndexerWriterContributor.super.modelIndexed(baseModel);
    }

    @Override
    public void customize(BatchIndexingActionable batchIndexingActionable, ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {
        batchIndexingActionable.setPerformActionMethod((HomeEntry homeEntry) -> {
            Document document = modelIndexerWriterDocumentHelper.getDocument(homeEntry);

            batchIndexingActionable.addDocuments(document);
        });
    }

    @Override
    public BatchIndexingActionable getBatchIndexingActionable() {
        return _dynamicQueryBatchIndexingActionableFactory.getBatchIndexingActionable(homeEntryLocalService.getIndexableActionableDynamicQuery());
    }

    @Override
    public long getCompanyId(HomeEntry baseModel) {
        return baseModel.getCompanyId();
    }

    @Reference
    private DynamicQueryBatchIndexingActionableFactory _dynamicQueryBatchIndexingActionableFactory;

    @Reference
    private HomeEntryLocalService homeEntryLocalService;
}
