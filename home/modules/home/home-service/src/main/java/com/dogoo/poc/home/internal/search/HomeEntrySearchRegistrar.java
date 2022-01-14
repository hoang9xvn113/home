package com.dogoo.poc.home.internal.search;

import com.dogoo.poc.home.constant.IndexerEntry;
import com.dogoo.poc.home.constant.SearchField;
import com.dogoo.poc.home.model.HomeEntry;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.registrar.ModelSearchRegistrarHelper;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        service = {com.dogoo.poc.home.internal.search.HomeEntrySearchRegistrar.class}
)
public class HomeEntrySearchRegistrar {

    @Activate
    protected void activate(BundleContext bundleContext) {
        _serviceRegistration = modelSearchRegistrarHelper.register(
                HomeEntry.class, bundleContext,
                modelSearchDefinition -> {
                    modelSearchDefinition.setDefaultSelectedFieldNames(
                            Field.COMPANY_ID, Field.ENTRY_CLASS_PK,
                            Field.ENTRY_CLASS_NAME, Field.GROUP_ID,
                            Field.UUID , SearchField.ADDRESS,
                            SearchField.COLOR, SearchField.FLOOR,
                            SearchField.OWNER, SearchField.ROOM,
                            SearchField.SQUARE
                    );

                    modelSearchDefinition.setModelSummaryContributor(modelSummaryContributor);
                    modelSearchDefinition.setModelIndexWriteContributor(modelIndexerWriterContributor);
                }
        );
    }

    @Deactivate
    protected void deactivate() {
        _serviceRegistration.unregister();
    }


    @Reference(
            target = IndexerEntry.ENTRY_FULL
    )
    ModelSummaryContributor modelSummaryContributor;

    @Reference(
            target = IndexerEntry.ENTRY_FULL
    )
    ModelIndexerWriterContributor modelIndexerWriterContributor;

    @Reference
    ModelSearchRegistrarHelper modelSearchRegistrarHelper;

    private ServiceRegistration<?> _serviceRegistration;
}
