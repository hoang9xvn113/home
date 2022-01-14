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

package com.dogoo.poc.home.service.persistence;

import com.dogoo.poc.home.model.HomeEntry;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the home entry service. This utility wraps <code>com.dogoo.poc.home.service.persistence.impl.HomeEntryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HomeEntryPersistence
 * @generated
 */
public class HomeEntryUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(HomeEntry homeEntry) {
		getPersistence().clearCache(homeEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, HomeEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HomeEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HomeEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HomeEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HomeEntry> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HomeEntry update(HomeEntry homeEntry) {
		return getPersistence().update(homeEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HomeEntry update(
		HomeEntry homeEntry, ServiceContext serviceContext) {

		return getPersistence().update(homeEntry, serviceContext);
	}

	/**
	 * Returns all the home entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching home entries
	 */
	public static List<HomeEntry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the home entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @return the range of matching home entries
	 */
	public static List<HomeEntry> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the home entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching home entries
	 */
	public static List<HomeEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HomeEntry> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the home entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching home entries
	 */
	public static List<HomeEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HomeEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first home entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public static HomeEntry findByUuid_First(
			String uuid, OrderByComparator<HomeEntry> orderByComparator)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first home entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public static HomeEntry fetchByUuid_First(
		String uuid, OrderByComparator<HomeEntry> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last home entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public static HomeEntry findByUuid_Last(
			String uuid, OrderByComparator<HomeEntry> orderByComparator)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last home entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public static HomeEntry fetchByUuid_Last(
		String uuid, OrderByComparator<HomeEntry> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the home entries before and after the current home entry in the ordered set where uuid = &#63;.
	 *
	 * @param homeId the primary key of the current home entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next home entry
	 * @throws NoSuchHomeEntryException if a home entry with the primary key could not be found
	 */
	public static HomeEntry[] findByUuid_PrevAndNext(
			long homeId, String uuid,
			OrderByComparator<HomeEntry> orderByComparator)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().findByUuid_PrevAndNext(
			homeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the home entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of home entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching home entries
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the home entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHomeEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public static HomeEntry findByUUID_G(String uuid, long groupId)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the home entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public static HomeEntry fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the home entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public static HomeEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the home entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the home entry that was removed
	 */
	public static HomeEntry removeByUUID_G(String uuid, long groupId)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of home entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching home entries
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the home entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching home entries
	 */
	public static List<HomeEntry> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the home entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @return the range of matching home entries
	 */
	public static List<HomeEntry> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the home entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching home entries
	 */
	public static List<HomeEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HomeEntry> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the home entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching home entries
	 */
	public static List<HomeEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HomeEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first home entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public static HomeEntry findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<HomeEntry> orderByComparator)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first home entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public static HomeEntry fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<HomeEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last home entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public static HomeEntry findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<HomeEntry> orderByComparator)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last home entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public static HomeEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<HomeEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the home entries before and after the current home entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param homeId the primary key of the current home entry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next home entry
	 * @throws NoSuchHomeEntryException if a home entry with the primary key could not be found
	 */
	public static HomeEntry[] findByUuid_C_PrevAndNext(
			long homeId, String uuid, long companyId,
			OrderByComparator<HomeEntry> orderByComparator)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().findByUuid_C_PrevAndNext(
			homeId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the home entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of home entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching home entries
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the home entries where address = &#63;.
	 *
	 * @param address the address
	 * @return the matching home entries
	 */
	public static List<HomeEntry> findByAddress(String address) {
		return getPersistence().findByAddress(address);
	}

	/**
	 * Returns a range of all the home entries where address = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param address the address
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @return the range of matching home entries
	 */
	public static List<HomeEntry> findByAddress(
		String address, int start, int end) {

		return getPersistence().findByAddress(address, start, end);
	}

	/**
	 * Returns an ordered range of all the home entries where address = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param address the address
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching home entries
	 */
	public static List<HomeEntry> findByAddress(
		String address, int start, int end,
		OrderByComparator<HomeEntry> orderByComparator) {

		return getPersistence().findByAddress(
			address, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the home entries where address = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param address the address
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching home entries
	 */
	public static List<HomeEntry> findByAddress(
		String address, int start, int end,
		OrderByComparator<HomeEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByAddress(
			address, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first home entry in the ordered set where address = &#63;.
	 *
	 * @param address the address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public static HomeEntry findByAddress_First(
			String address, OrderByComparator<HomeEntry> orderByComparator)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().findByAddress_First(address, orderByComparator);
	}

	/**
	 * Returns the first home entry in the ordered set where address = &#63;.
	 *
	 * @param address the address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public static HomeEntry fetchByAddress_First(
		String address, OrderByComparator<HomeEntry> orderByComparator) {

		return getPersistence().fetchByAddress_First(
			address, orderByComparator);
	}

	/**
	 * Returns the last home entry in the ordered set where address = &#63;.
	 *
	 * @param address the address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public static HomeEntry findByAddress_Last(
			String address, OrderByComparator<HomeEntry> orderByComparator)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().findByAddress_Last(address, orderByComparator);
	}

	/**
	 * Returns the last home entry in the ordered set where address = &#63;.
	 *
	 * @param address the address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public static HomeEntry fetchByAddress_Last(
		String address, OrderByComparator<HomeEntry> orderByComparator) {

		return getPersistence().fetchByAddress_Last(address, orderByComparator);
	}

	/**
	 * Returns the home entries before and after the current home entry in the ordered set where address = &#63;.
	 *
	 * @param homeId the primary key of the current home entry
	 * @param address the address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next home entry
	 * @throws NoSuchHomeEntryException if a home entry with the primary key could not be found
	 */
	public static HomeEntry[] findByAddress_PrevAndNext(
			long homeId, String address,
			OrderByComparator<HomeEntry> orderByComparator)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().findByAddress_PrevAndNext(
			homeId, address, orderByComparator);
	}

	/**
	 * Removes all the home entries where address = &#63; from the database.
	 *
	 * @param address the address
	 */
	public static void removeByAddress(String address) {
		getPersistence().removeByAddress(address);
	}

	/**
	 * Returns the number of home entries where address = &#63;.
	 *
	 * @param address the address
	 * @return the number of matching home entries
	 */
	public static int countByAddress(String address) {
		return getPersistence().countByAddress(address);
	}

	/**
	 * Caches the home entry in the entity cache if it is enabled.
	 *
	 * @param homeEntry the home entry
	 */
	public static void cacheResult(HomeEntry homeEntry) {
		getPersistence().cacheResult(homeEntry);
	}

	/**
	 * Caches the home entries in the entity cache if it is enabled.
	 *
	 * @param homeEntries the home entries
	 */
	public static void cacheResult(List<HomeEntry> homeEntries) {
		getPersistence().cacheResult(homeEntries);
	}

	/**
	 * Creates a new home entry with the primary key. Does not add the home entry to the database.
	 *
	 * @param homeId the primary key for the new home entry
	 * @return the new home entry
	 */
	public static HomeEntry create(long homeId) {
		return getPersistence().create(homeId);
	}

	/**
	 * Removes the home entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param homeId the primary key of the home entry
	 * @return the home entry that was removed
	 * @throws NoSuchHomeEntryException if a home entry with the primary key could not be found
	 */
	public static HomeEntry remove(long homeId)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().remove(homeId);
	}

	public static HomeEntry updateImpl(HomeEntry homeEntry) {
		return getPersistence().updateImpl(homeEntry);
	}

	/**
	 * Returns the home entry with the primary key or throws a <code>NoSuchHomeEntryException</code> if it could not be found.
	 *
	 * @param homeId the primary key of the home entry
	 * @return the home entry
	 * @throws NoSuchHomeEntryException if a home entry with the primary key could not be found
	 */
	public static HomeEntry findByPrimaryKey(long homeId)
		throws com.dogoo.poc.home.exception.NoSuchHomeEntryException {

		return getPersistence().findByPrimaryKey(homeId);
	}

	/**
	 * Returns the home entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param homeId the primary key of the home entry
	 * @return the home entry, or <code>null</code> if a home entry with the primary key could not be found
	 */
	public static HomeEntry fetchByPrimaryKey(long homeId) {
		return getPersistence().fetchByPrimaryKey(homeId);
	}

	/**
	 * Returns all the home entries.
	 *
	 * @return the home entries
	 */
	public static List<HomeEntry> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the home entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @return the range of home entries
	 */
	public static List<HomeEntry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the home entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of home entries
	 */
	public static List<HomeEntry> findAll(
		int start, int end, OrderByComparator<HomeEntry> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the home entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HomeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of home entries
	 * @param end the upper bound of the range of home entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of home entries
	 */
	public static List<HomeEntry> findAll(
		int start, int end, OrderByComparator<HomeEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the home entries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of home entries.
	 *
	 * @return the number of home entries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HomeEntryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HomeEntryPersistence, HomeEntryPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(HomeEntryPersistence.class);

		ServiceTracker<HomeEntryPersistence, HomeEntryPersistence>
			serviceTracker =
				new ServiceTracker<HomeEntryPersistence, HomeEntryPersistence>(
					bundle.getBundleContext(), HomeEntryPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}