package com.poc.home.internal.search.indexer.contributor;

import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.poc.home.constant.IndexerEntry;
import com.poc.home.constant.SearchField;
import com.poc.home.model.HomeEntry;
import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true,
        property = IndexerEntry.ENTRY,
        service = ModelDocumentContributor.class
)
public class HomeEntryModelDocumentContributor implements ModelDocumentContributor<HomeEntry> {
    @Override
    public void contribute(Document document, HomeEntry baseModel) {
        document.addText(SearchField.ADDRESS, baseModel.getAddress());
        document.addNumber(SearchField.FLOOR, baseModel.getFloor());
        document.addNumber(SearchField.SQUARE, baseModel.getSquare());
        document.addNumber(SearchField.ROOM, baseModel.getRoom());
        document.addText(SearchField.COLOR, baseModel.getColor());
        document.addText(SearchField.OWNER, baseModel.getOwner());
    }
}
