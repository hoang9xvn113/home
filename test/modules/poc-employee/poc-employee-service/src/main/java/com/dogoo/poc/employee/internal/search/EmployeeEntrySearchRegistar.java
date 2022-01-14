package com.dogoo.poc.employee.internal.search;

import com.dogoo.poc.employee.model.EmployeeEntry;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.permission.SearchPermissionFieldContributor;
import com.liferay.portal.search.spi.model.registrar.ModelSearchRegistrarHelper;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;
import com.liferay.portal.search.web.facet.SearchFacet;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = {com.dogoo.poc.employee.internal.search.EmployeeEntrySearchRegistar.class})
public class EmployeeEntrySearchRegistar {

    @Reference(
            target = "(indexer.class.name=com.dogoo.poc.employee.model.EmployeeEntry)"
    )
    protected ModelSummaryContributor modelSummaryContributor;

    protected ModelIndexerWriterContributor modelIndexerWriterContributor;

    private ServiceRegistration<?> _serviceRegistration;

    private ModelSearchRegistrarHelper modelSearchRegistrarHelper;



    @Activate
    protected void active(BundleContext bundleContext) {
        _serviceRegistration = modelSearchRegistrarHelper.register(
                EmployeeEntry.class, bundleContext,
                modelSearchDefinition -> {
                    modelSearchDefinition.setDefaultSelectedFieldNames(
                            Field.COMPANY_ID,
                            Field.ENTRY_CLASS_NAME,
                            Field.ENTRY_CLASS_PK,
                            Field.GROUP_ID,
                            Field.UUID, Field.NAME
                    );

                    modelSearchDefinition.setModelIndexWriteContributor(
                            modelIndexerWriterContributor
                    );

                    modelSearchDefinition.setModelSummaryContributor(
                            modelSummaryContributor
                    );
                }
        );
    }
}
