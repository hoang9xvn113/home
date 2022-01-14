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

package com.dogoo.poc.employee.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeEntryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeEntryLocalService
 * @generated
 */
public class EmployeeEntryLocalServiceWrapper
	implements EmployeeEntryLocalService,
			   ServiceWrapper<EmployeeEntryLocalService> {

	public EmployeeEntryLocalServiceWrapper(
		EmployeeEntryLocalService employeeEntryLocalService) {

		_employeeEntryLocalService = employeeEntryLocalService;
	}

	@Override
	public com.dogoo.poc.employee.model.EmployeeEntry addEmployee(
		String name, java.util.Date birthDay, int gender, String address,
		boolean hasAccount,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _employeeEntryLocalService.addEmployee(
			name, birthDay, gender, address, hasAccount, serviceContext);
	}

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
	@Override
	public com.dogoo.poc.employee.model.EmployeeEntry addEmployeeEntry(
		com.dogoo.poc.employee.model.EmployeeEntry employeeEntry) {

		return _employeeEntryLocalService.addEmployeeEntry(employeeEntry);
	}

	/**
	 * Creates a new employee entry with the primary key. Does not add the employee entry to the database.
	 *
	 * @param employeeId the primary key for the new employee entry
	 * @return the new employee entry
	 */
	@Override
	public com.dogoo.poc.employee.model.EmployeeEntry createEmployeeEntry(
		long employeeId) {

		return _employeeEntryLocalService.createEmployeeEntry(employeeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeEntryLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.dogoo.poc.employee.model.EmployeeEntry deleteEmployeeEntry(
		com.dogoo.poc.employee.model.EmployeeEntry employeeEntry) {

		return _employeeEntryLocalService.deleteEmployeeEntry(employeeEntry);
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
	@Override
	public com.dogoo.poc.employee.model.EmployeeEntry deleteEmployeeEntry(
			long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeEntryLocalService.deleteEmployeeEntry(employeeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeEntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _employeeEntryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _employeeEntryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employeeEntryLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _employeeEntryLocalService.dynamicQuery(dynamicQuery);
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _employeeEntryLocalService.dynamicQuery(
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _employeeEntryLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _employeeEntryLocalService.dynamicQueryCount(dynamicQuery);
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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _employeeEntryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dogoo.poc.employee.model.EmployeeEntry fetchEmployeeEntry(
		long employeeId) {

		return _employeeEntryLocalService.fetchEmployeeEntry(employeeId);
	}

	/**
	 * Returns the employee entry matching the UUID and group.
	 *
	 * @param uuid the employee entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	@Override
	public com.dogoo.poc.employee.model.EmployeeEntry
		fetchEmployeeEntryByUuidAndGroupId(String uuid, long groupId) {

		return _employeeEntryLocalService.fetchEmployeeEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _employeeEntryLocalService.getActionableDynamicQuery();
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
	public java.util.List<com.dogoo.poc.employee.model.EmployeeEntry>
		getEmployeeEntries(int start, int end) {

		return _employeeEntryLocalService.getEmployeeEntries(start, end);
	}

	/**
	 * Returns all the employee entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the employee entries
	 * @param companyId the primary key of the company
	 * @return the matching employee entries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dogoo.poc.employee.model.EmployeeEntry>
		getEmployeeEntriesByUuidAndCompanyId(String uuid, long companyId) {

		return _employeeEntryLocalService.getEmployeeEntriesByUuidAndCompanyId(
			uuid, companyId);
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
	public java.util.List<com.dogoo.poc.employee.model.EmployeeEntry>
		getEmployeeEntriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dogoo.poc.employee.model.EmployeeEntry>
					orderByComparator) {

		return _employeeEntryLocalService.getEmployeeEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of employee entries.
	 *
	 * @return the number of employee entries
	 */
	@Override
	public int getEmployeeEntriesCount() {
		return _employeeEntryLocalService.getEmployeeEntriesCount();
	}

	/**
	 * Returns the employee entry with the primary key.
	 *
	 * @param employeeId the primary key of the employee entry
	 * @return the employee entry
	 * @throws PortalException if a employee entry with the primary key could not be found
	 */
	@Override
	public com.dogoo.poc.employee.model.EmployeeEntry getEmployeeEntry(
			long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeEntryLocalService.getEmployeeEntry(employeeId);
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
	public com.dogoo.poc.employee.model.EmployeeEntry
			getEmployeeEntryByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeEntryLocalService.getEmployeeEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _employeeEntryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _employeeEntryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _employeeEntryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeEntryLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.dogoo.poc.employee.model.EmployeeEntry updateEmployeeEntry(
		com.dogoo.poc.employee.model.EmployeeEntry employeeEntry) {

		return _employeeEntryLocalService.updateEmployeeEntry(employeeEntry);
	}

	@Override
	public EmployeeEntryLocalService getWrappedService() {
		return _employeeEntryLocalService;
	}

	@Override
	public void setWrappedService(
		EmployeeEntryLocalService employeeEntryLocalService) {

		_employeeEntryLocalService = employeeEntryLocalService;
	}

	private EmployeeEntryLocalService _employeeEntryLocalService;

}