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

package com.dogoo.poc.employee.service.persistence;

import com.dogoo.poc.employee.model.EmployeeEntry;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the employee entry service. This utility wraps <code>com.dogoo.poc.employee.service.persistence.impl.EmployeeEntryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeEntryPersistence
 * @generated
 */
public class EmployeeEntryUtil {

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
	public static void clearCache(EmployeeEntry employeeEntry) {
		getPersistence().clearCache(employeeEntry);
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
	public static Map<Serializable, EmployeeEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EmployeeEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmployeeEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmployeeEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EmployeeEntry> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EmployeeEntry update(EmployeeEntry employeeEntry) {
		return getPersistence().update(employeeEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EmployeeEntry update(
		EmployeeEntry employeeEntry, ServiceContext serviceContext) {

		return getPersistence().update(employeeEntry, serviceContext);
	}

	/**
	 * Returns all the employee entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching employee entries
	 */
	public static List<EmployeeEntry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the employee entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @return the range of matching employee entries
	 */
	public static List<EmployeeEntry> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the employee entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee entries
	 */
	public static List<EmployeeEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EmployeeEntry> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employee entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employee entries
	 */
	public static List<EmployeeEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EmployeeEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public static EmployeeEntry findByUuid_First(
			String uuid, OrderByComparator<EmployeeEntry> orderByComparator)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first employee entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public static EmployeeEntry fetchByUuid_First(
		String uuid, OrderByComparator<EmployeeEntry> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last employee entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public static EmployeeEntry findByUuid_Last(
			String uuid, OrderByComparator<EmployeeEntry> orderByComparator)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last employee entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public static EmployeeEntry fetchByUuid_Last(
		String uuid, OrderByComparator<EmployeeEntry> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the employee entries before and after the current employee entry in the ordered set where uuid = &#63;.
	 *
	 * @param employeeId the primary key of the current employee entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee entry
	 * @throws NoSuchEmployeeEntryException if a employee entry with the primary key could not be found
	 */
	public static EmployeeEntry[] findByUuid_PrevAndNext(
			long employeeId, String uuid,
			OrderByComparator<EmployeeEntry> orderByComparator)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().findByUuid_PrevAndNext(
			employeeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the employee entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of employee entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching employee entries
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the employee entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEmployeeEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public static EmployeeEntry findByUUID_G(String uuid, long groupId)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the employee entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public static EmployeeEntry fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the employee entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public static EmployeeEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the employee entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the employee entry that was removed
	 */
	public static EmployeeEntry removeByUUID_G(String uuid, long groupId)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of employee entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching employee entries
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the employee entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching employee entries
	 */
	public static List<EmployeeEntry> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the employee entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @return the range of matching employee entries
	 */
	public static List<EmployeeEntry> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the employee entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee entries
	 */
	public static List<EmployeeEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EmployeeEntry> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employee entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employee entries
	 */
	public static List<EmployeeEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EmployeeEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public static EmployeeEntry findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EmployeeEntry> orderByComparator)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first employee entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public static EmployeeEntry fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EmployeeEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last employee entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public static EmployeeEntry findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EmployeeEntry> orderByComparator)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last employee entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public static EmployeeEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EmployeeEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the employee entries before and after the current employee entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param employeeId the primary key of the current employee entry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee entry
	 * @throws NoSuchEmployeeEntryException if a employee entry with the primary key could not be found
	 */
	public static EmployeeEntry[] findByUuid_C_PrevAndNext(
			long employeeId, String uuid, long companyId,
			OrderByComparator<EmployeeEntry> orderByComparator)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().findByUuid_C_PrevAndNext(
			employeeId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the employee entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of employee entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching employee entries
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the employee entries where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching employee entries
	 */
	public static List<EmployeeEntry> findByname(String name) {
		return getPersistence().findByname(name);
	}

	/**
	 * Returns a range of all the employee entries where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @return the range of matching employee entries
	 */
	public static List<EmployeeEntry> findByname(
		String name, int start, int end) {

		return getPersistence().findByname(name, start, end);
	}

	/**
	 * Returns an ordered range of all the employee entries where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee entries
	 */
	public static List<EmployeeEntry> findByname(
		String name, int start, int end,
		OrderByComparator<EmployeeEntry> orderByComparator) {

		return getPersistence().findByname(name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employee entries where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employee entries
	 */
	public static List<EmployeeEntry> findByname(
		String name, int start, int end,
		OrderByComparator<EmployeeEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByname(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee entry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public static EmployeeEntry findByname_First(
			String name, OrderByComparator<EmployeeEntry> orderByComparator)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().findByname_First(name, orderByComparator);
	}

	/**
	 * Returns the first employee entry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public static EmployeeEntry fetchByname_First(
		String name, OrderByComparator<EmployeeEntry> orderByComparator) {

		return getPersistence().fetchByname_First(name, orderByComparator);
	}

	/**
	 * Returns the last employee entry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public static EmployeeEntry findByname_Last(
			String name, OrderByComparator<EmployeeEntry> orderByComparator)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().findByname_Last(name, orderByComparator);
	}

	/**
	 * Returns the last employee entry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public static EmployeeEntry fetchByname_Last(
		String name, OrderByComparator<EmployeeEntry> orderByComparator) {

		return getPersistence().fetchByname_Last(name, orderByComparator);
	}

	/**
	 * Returns the employee entries before and after the current employee entry in the ordered set where name = &#63;.
	 *
	 * @param employeeId the primary key of the current employee entry
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee entry
	 * @throws NoSuchEmployeeEntryException if a employee entry with the primary key could not be found
	 */
	public static EmployeeEntry[] findByname_PrevAndNext(
			long employeeId, String name,
			OrderByComparator<EmployeeEntry> orderByComparator)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().findByname_PrevAndNext(
			employeeId, name, orderByComparator);
	}

	/**
	 * Removes all the employee entries where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByname(String name) {
		getPersistence().removeByname(name);
	}

	/**
	 * Returns the number of employee entries where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching employee entries
	 */
	public static int countByname(String name) {
		return getPersistence().countByname(name);
	}

	/**
	 * Caches the employee entry in the entity cache if it is enabled.
	 *
	 * @param employeeEntry the employee entry
	 */
	public static void cacheResult(EmployeeEntry employeeEntry) {
		getPersistence().cacheResult(employeeEntry);
	}

	/**
	 * Caches the employee entries in the entity cache if it is enabled.
	 *
	 * @param employeeEntries the employee entries
	 */
	public static void cacheResult(List<EmployeeEntry> employeeEntries) {
		getPersistence().cacheResult(employeeEntries);
	}

	/**
	 * Creates a new employee entry with the primary key. Does not add the employee entry to the database.
	 *
	 * @param employeeId the primary key for the new employee entry
	 * @return the new employee entry
	 */
	public static EmployeeEntry create(long employeeId) {
		return getPersistence().create(employeeId);
	}

	/**
	 * Removes the employee entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeId the primary key of the employee entry
	 * @return the employee entry that was removed
	 * @throws NoSuchEmployeeEntryException if a employee entry with the primary key could not be found
	 */
	public static EmployeeEntry remove(long employeeId)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().remove(employeeId);
	}

	public static EmployeeEntry updateImpl(EmployeeEntry employeeEntry) {
		return getPersistence().updateImpl(employeeEntry);
	}

	/**
	 * Returns the employee entry with the primary key or throws a <code>NoSuchEmployeeEntryException</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the employee entry
	 * @return the employee entry
	 * @throws NoSuchEmployeeEntryException if a employee entry with the primary key could not be found
	 */
	public static EmployeeEntry findByPrimaryKey(long employeeId)
		throws com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException {

		return getPersistence().findByPrimaryKey(employeeId);
	}

	/**
	 * Returns the employee entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the employee entry
	 * @return the employee entry, or <code>null</code> if a employee entry with the primary key could not be found
	 */
	public static EmployeeEntry fetchByPrimaryKey(long employeeId) {
		return getPersistence().fetchByPrimaryKey(employeeId);
	}

	/**
	 * Returns all the employee entries.
	 *
	 * @return the employee entries
	 */
	public static List<EmployeeEntry> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the employee entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @return the range of employee entries
	 */
	public static List<EmployeeEntry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the employee entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee entries
	 */
	public static List<EmployeeEntry> findAll(
		int start, int end,
		OrderByComparator<EmployeeEntry> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employee entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee entries
	 * @param end the upper bound of the range of employee entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of employee entries
	 */
	public static List<EmployeeEntry> findAll(
		int start, int end, OrderByComparator<EmployeeEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the employee entries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of employee entries.
	 *
	 * @return the number of employee entries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EmployeeEntryPersistence getPersistence() {
		return _persistence;
	}

	private static volatile EmployeeEntryPersistence _persistence;

}