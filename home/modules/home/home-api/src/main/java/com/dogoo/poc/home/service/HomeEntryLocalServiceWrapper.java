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

package com.dogoo.poc.home.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HomeEntryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HomeEntryLocalService
 * @generated
 */
public class HomeEntryLocalServiceWrapper
	implements HomeEntryLocalService, ServiceWrapper<HomeEntryLocalService> {

	public HomeEntryLocalServiceWrapper(
		HomeEntryLocalService homeEntryLocalService) {

		_homeEntryLocalService = homeEntryLocalService;
	}

	/**
	 * Adds the home entry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HomeEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param homeEntry the home entry
	 * @return the home entry that was added
	 */
	@Override
	public com.dogoo.poc.home.model.HomeEntry addHomeEntry(
		com.dogoo.poc.home.model.HomeEntry homeEntry) {

		return _homeEntryLocalService.addHomeEntry(homeEntry);
	}

	/**
	 * Creates a new home entry with the primary key. Does not add the home entry to the database.
	 *
	 * @param homeId the primary key for the new home entry
	 * @return the new home entry
	 */
	@Override
	public com.dogoo.poc.home.model.HomeEntry createHomeEntry(long homeId) {
		return _homeEntryLocalService.createHomeEntry(homeId);
	}

	@Override
	public com.dogoo.poc.home.model.HomeEntry createHomeEntry(
		String address, int floor, float square, int room, String color,
		String owner,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _homeEntryLocalService.createHomeEntry(
			address, floor, square, room, color, owner, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _homeEntryLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the home entry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HomeEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param homeEntry the home entry
	 * @return the home entry that was removed
	 */
	@Override
	public com.dogoo.poc.home.model.HomeEntry deleteHomeEntry(
		com.dogoo.poc.home.model.HomeEntry homeEntry) {

		return _homeEntryLocalService.deleteHomeEntry(homeEntry);
	}

	/**
	 * Deletes the home entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HomeEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param homeId the primary key of the home entry
	 * @return the home entry that was removed
	 * @throws PortalException if a home entry with the primary key could not be found
	 */
	@Override
	public com.dogoo.poc.home.model.HomeEntry deleteHomeEntry(long homeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _homeEntryLocalService.deleteHomeEntry(homeId);
	}

	@Override
	public com.dogoo.poc.home.model.HomeEntry deleteHomeEntryByHomeId(
			long homeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _homeEntryLocalService.deleteHomeEntryByHomeId(homeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _homeEntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _homeEntryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _homeEntryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _homeEntryLocalService.dynamicQuery();
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

		return _homeEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dogoo.poc.home.model.impl.HomeEntryModelImpl</code>.
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

		return _homeEntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dogoo.poc.home.model.impl.HomeEntryModelImpl</code>.
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

		return _homeEntryLocalService.dynamicQuery(
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

		return _homeEntryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _homeEntryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dogoo.poc.home.model.HomeEntry fetchHomeEntry(long homeId) {
		return _homeEntryLocalService.fetchHomeEntry(homeId);
	}

	/**
	 * Returns the home entry matching the UUID and group.
	 *
	 * @param uuid the home entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	@Override
	public com.dogoo.poc.home.model.HomeEntry fetchHomeEntryByUuidAndGroupId(
		String uuid, long groupId) {

		return _homeEntryLocalService.fetchHomeEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _homeEntryLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.dogoo.poc.home.model.HomeEntry> getAllHomes() {
		return _homeEntryLocalService.getAllHomes();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _homeEntryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.dogoo.poc.home.model.HomeEntry getHomeByHomeId(long homeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _homeEntryLocalService.getHomeByHomeId(homeId);
	}

	/**
	 * Returns a range of all the home entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dogoo.poc.home.model.impl.HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @return the range of home entries
	 */
	@Override
	public java.util.List<com.dogoo.poc.home.model.HomeEntry> getHomeEntries(
		int start, int end) {

		return _homeEntryLocalService.getHomeEntries(start, end);
	}

	/**
	 * Returns all the home entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the home entries
	 * @param companyId the primary key of the company
	 * @return the matching home entries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dogoo.poc.home.model.HomeEntry>
		getHomeEntriesByUuidAndCompanyId(String uuid, long companyId) {

		return _homeEntryLocalService.getHomeEntriesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of home entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the home entries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching home entries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dogoo.poc.home.model.HomeEntry>
		getHomeEntriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dogoo.poc.home.model.HomeEntry> orderByComparator) {

		return _homeEntryLocalService.getHomeEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of home entries.
	 *
	 * @return the number of home entries
	 */
	@Override
	public int getHomeEntriesCount() {
		return _homeEntryLocalService.getHomeEntriesCount();
	}

	/**
	 * Returns the home entry with the primary key.
	 *
	 * @param homeId the primary key of the home entry
	 * @return the home entry
	 * @throws PortalException if a home entry with the primary key could not be found
	 */
	@Override
	public com.dogoo.poc.home.model.HomeEntry getHomeEntry(long homeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _homeEntryLocalService.getHomeEntry(homeId);
	}

	/**
	 * Returns the home entry matching the UUID and group.
	 *
	 * @param uuid the home entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching home entry
	 * @throws PortalException if a matching home entry could not be found
	 */
	@Override
	public com.dogoo.poc.home.model.HomeEntry getHomeEntryByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _homeEntryLocalService.getHomeEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _homeEntryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _homeEntryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _homeEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the home entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HomeEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param homeEntry the home entry
	 * @return the home entry that was updated
	 */
	@Override
	public com.dogoo.poc.home.model.HomeEntry updateHomeEntry(
		com.dogoo.poc.home.model.HomeEntry homeEntry) {

		return _homeEntryLocalService.updateHomeEntry(homeEntry);
	}

	@Override
	public com.dogoo.poc.home.model.HomeEntry updateHomeEntryByHomeId(
			long homeId, String address, int floor, float square, int room,
			String color, String owner,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _homeEntryLocalService.updateHomeEntryByHomeId(
			homeId, address, floor, square, room, color, owner, serviceContext);
	}

	@Override
	public HomeEntryLocalService getWrappedService() {
		return _homeEntryLocalService;
	}

	@Override
	public void setWrappedService(HomeEntryLocalService homeEntryLocalService) {
		_homeEntryLocalService = homeEntryLocalService;
	}

	private HomeEntryLocalService _homeEntryLocalService;

}