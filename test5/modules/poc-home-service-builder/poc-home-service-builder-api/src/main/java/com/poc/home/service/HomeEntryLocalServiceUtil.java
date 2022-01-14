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

package com.poc.home.service;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.poc.home.model.HomeEntry;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HomeEntry. This utility wraps
 * <code>com.poc.home.service.impl.HomeEntryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HomeEntryLocalService
 * @generated
 */
public class HomeEntryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.poc.home.service.impl.HomeEntryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static HomeEntry addHomeEntry(HomeEntry homeEntry) {
		return getService().addHomeEntry(homeEntry);
	}

	/**
	 * Creates a new home entry with the primary key. Does not add the home entry to the database.
	 *
	 * @param homeId the primary key for the new home entry
	 * @return the new home entry
	 */
	public static HomeEntry createHomeEntry(long homeId) {
		return getService().createHomeEntry(homeId);
	}

	public static HomeEntry createHomeEntry(
		String address, int floor, float square, int room, String color,
		String owner,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().createHomeEntry(
			address, floor, square, room, color, owner, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static HomeEntry deleteHomeEntry(HomeEntry homeEntry) {
		return getService().deleteHomeEntry(homeEntry);
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
	public static HomeEntry deleteHomeEntry(long homeId)
		throws PortalException {

		return getService().deleteHomeEntry(homeId);
	}

	public static HomeEntry deleteHomeEntryByHomeId(long homeId)
		throws PortalException {

		return getService().deleteHomeEntryByHomeId(homeId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.poc.home.model.impl.HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.poc.home.model.impl.HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static HomeEntry fetchHomeEntry(long homeId) {
		return getService().fetchHomeEntry(homeId);
	}

	/**
	 * Returns the home entry matching the UUID and group.
	 *
	 * @param uuid the home entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public static HomeEntry fetchHomeEntryByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchHomeEntryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<HomeEntry> getAllHomes() {
		return getService().getAllHomes();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static HomeEntry getHomeByHomeId(long homeId)
		throws PortalException {

		return getService().getHomeByHomeId(homeId);
	}

	/**
	 * Returns a range of all the home entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.poc.home.model.impl.HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @return the range of home entries
	 */
	public static List<HomeEntry> getHomeEntries(int start, int end) {
		return getService().getHomeEntries(start, end);
	}

	/**
	 * Returns all the home entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the home entries
	 * @param companyId the primary key of the company
	 * @return the matching home entries, or an empty list if no matches were found
	 */
	public static List<HomeEntry> getHomeEntriesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getHomeEntriesByUuidAndCompanyId(uuid, companyId);
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
	public static List<HomeEntry> getHomeEntriesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HomeEntry> orderByComparator) {

		return getService().getHomeEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of home entries.
	 *
	 * @return the number of home entries
	 */
	public static int getHomeEntriesCount() {
		return getService().getHomeEntriesCount();
	}

	/**
	 * Returns the home entry with the primary key.
	 *
	 * @param homeId the primary key of the home entry
	 * @return the home entry
	 * @throws PortalException if a home entry with the primary key could not be found
	 */
	public static HomeEntry getHomeEntry(long homeId) throws PortalException {
		return getService().getHomeEntry(homeId);
	}

	/**
	 * Returns the home entry matching the UUID and group.
	 *
	 * @param uuid the home entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching home entry
	 * @throws PortalException if a matching home entry could not be found
	 */
	public static HomeEntry getHomeEntryByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getHomeEntryByUuidAndGroupId(uuid, groupId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static HomeEntry updateHomeEntry(HomeEntry homeEntry) {
		return getService().updateHomeEntry(homeEntry);
	}

	public static HomeEntry updateHomeEntryByHomeId(
			long homeId, String address, int floor, float square, int room,
			String color, String owner,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateHomeEntryByHomeId(
			homeId, address, floor, square, room, color, owner, serviceContext);
	}

	public static HomeEntryLocalService getService() {
		return _service;
	}

	private static volatile HomeEntryLocalService _service;

}