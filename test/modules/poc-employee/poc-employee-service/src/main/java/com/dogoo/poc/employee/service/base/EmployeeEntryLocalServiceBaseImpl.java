/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.dogoo.poc.employee.service.base;

import com.dogoo.poc.employee.model.EmployeeEntry;
import com.dogoo.poc.employee.service.EmployeeEntryLocalService;
import com.dogoo.poc.employee.service.EmployeeEntryLocalServiceUtil;
import com.dogoo.poc.employee.service.persistence.EmployeeEntryPersistence;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the employee entry local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.dogoo.poc.employee.service.impl.EmployeeEntryLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.dogoo.poc.employee.service.impl.EmployeeEntryLocalServiceImpl
 * @generated
 */
public abstract class EmployeeEntryLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, EmployeeEntryLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>EmployeeEntryLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>EmployeeEntryLocalServiceUtil</code>.
	 */

	/**
	 * Adds the employee entry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employeeEntry the employee entry
	 * @return the employee entry that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EmployeeEntry addEmployeeEntry(EmployeeEntry employeeEntry) {
		employeeEntry.setNew(true);

		return employeeEntryPersistence.update(employeeEntry);
	}

	/**
	 * Creates a new employee entry with the primary key. Does not add the employee entry to the database.
	 *
	 * @param employeeId the primary key for the new employee entry
	 * @return the new employee entry
	 */
	@Override
	@Transactional(enabled = false)
	public EmployeeEntry createEmployeeEntry(long employeeId) {
		return employeeEntryPersistence.create(employeeId);
	}

	/**
	 * Deletes the employee entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employeeId the primary key of the employee entry
	 * @return the employee entry that was removed
	 * @throws PortalException if a employee entry with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EmployeeEntry deleteEmployeeEntry(long employeeId)
		throws PortalException {

		return employeeEntryPersistence.remove(employeeId);
	}

	/**
	 * Deletes the employee entry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employeeEntry the employee entry
	 * @return the employee entry that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EmployeeEntry deleteEmployeeEntry(EmployeeEntry employeeEntry) {
		return employeeEntryPersistence.remove(employeeEntry);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return employeeEntryPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			EmployeeEntry.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return employeeEntryPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dogoo.poc.employee.model.impl.EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return employeeEntryPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dogoo.poc.employee.model.impl.EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return employeeEntryPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return employeeEntryPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return employeeEntryPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public EmployeeEntry fetchEmployeeEntry(long employeeId) {
		return employeeEntryPersistence.fetchByPrimaryKey(employeeId);
	}

	/**
	 * Returns the employee entry matching the UUID and group.
	 *
	 * @param uuid the employee entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	@Override
	public EmployeeEntry fetchEmployeeEntryByUuidAndGroupId(
		String uuid, long groupId) {

		return employeeEntryPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the employee entry with the primary key.
	 *
	 * @param employeeId the primary key of the employee entry
	 * @return the employee entry
	 * @throws PortalException if a employee entry with the primary key could not be found
	 */
	@Override
	public EmployeeEntry getEmployeeEntry(long employeeId)
		throws PortalException {

		return employeeEntryPersistence.findByPrimaryKey(employeeId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(employeeEntryLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(EmployeeEntry.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("employeeId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			employeeEntryLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(EmployeeEntry.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("employeeId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(employeeEntryLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(EmployeeEntry.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("employeeId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<EmployeeEntry>() {

				@Override
				public void performAction(EmployeeEntry employeeEntry)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, employeeEntry);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(EmployeeEntry.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return employeeEntryPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return employeeEntryLocalService.deleteEmployeeEntry(
			(EmployeeEntry)persistedModel);
	}

	@Override
	public BasePersistence<EmployeeEntry> getBasePersistence() {
		return employeeEntryPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return employeeEntryPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the employee entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the employee entries
	 * @param companyId the primary key of the company
	 * @return the matching employee entries, or an empty list if no matches were found
	 */
	@Override
	public List<EmployeeEntry> getEmployeeEntriesByUuidAndCompanyId(
		String uuid, long companyId) {

		return employeeEntryPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of employee entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the employee entries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching employee entries, or an empty list if no matches were found
	 */
	@Override
	public List<EmployeeEntry> getEmployeeEntriesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EmployeeEntry> orderByComparator) {

		return employeeEntryPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the employee entry matching the UUID and group.
	 *
	 * @param uuid the employee entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching employee entry
	 * @throws PortalException if a matching employee entry could not be found
	 */
	@Override
	public EmployeeEntry getEmployeeEntryByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return employeeEntryPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the employee entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dogoo.poc.employee.model.impl.EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @return the range of employee entries
	 */
	@Override
	public List<EmployeeEntry> getEmployeeEntries(int start, int end) {
		return employeeEntryPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of employee entries.
	 *
	 * @return the number of employee entries
	 */
	@Override
	public int getEmployeeEntriesCount() {
		return employeeEntryPersistence.countAll();
	}

	/**
	 * Updates the employee entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employeeEntry the employee entry
	 * @return the employee entry that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EmployeeEntry updateEmployeeEntry(EmployeeEntry employeeEntry) {
		return employeeEntryPersistence.update(employeeEntry);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			EmployeeEntryLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		employeeEntryLocalService = (EmployeeEntryLocalService)aopProxy;

		_setLocalServiceUtilService(employeeEntryLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return EmployeeEntryLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return EmployeeEntry.class;
	}

	protected String getModelClassName() {
		return EmployeeEntry.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = employeeEntryPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		EmployeeEntryLocalService employeeEntryLocalService) {

		try {
			Field field = EmployeeEntryLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, employeeEntryLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	protected EmployeeEntryLocalService employeeEntryLocalService;

	@Reference
	protected EmployeeEntryPersistence employeeEntryPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

}