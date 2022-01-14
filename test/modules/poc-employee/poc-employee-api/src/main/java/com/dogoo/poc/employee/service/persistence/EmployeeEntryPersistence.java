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

import com.dogoo.poc.employee.exception.NoSuchEmployeeEntryException;
import com.dogoo.poc.employee.model.EmployeeEntry;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the employee entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeEntryUtil
 * @generated
 */
@ProviderType
public interface EmployeeEntryPersistence
	extends BasePersistence<EmployeeEntry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeEntryUtil} to access the employee entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the employee entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching employee entries
	 */
	public java.util.List<EmployeeEntry> findByUuid(String uuid);

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
	public java.util.List<EmployeeEntry> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<EmployeeEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator);

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
	public java.util.List<EmployeeEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first employee entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public EmployeeEntry findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
				orderByComparator)
		throws NoSuchEmployeeEntryException;

	/**
	 * Returns the first employee entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public EmployeeEntry fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator);

	/**
	 * Returns the last employee entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public EmployeeEntry findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
				orderByComparator)
		throws NoSuchEmployeeEntryException;

	/**
	 * Returns the last employee entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public EmployeeEntry fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator);

	/**
	 * Returns the employee entries before and after the current employee entry in the ordered set where uuid = &#63;.
	 *
	 * @param employeeId the primary key of the current employee entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee entry
	 * @throws NoSuchEmployeeEntryException if a employee entry with the primary key could not be found
	 */
	public EmployeeEntry[] findByUuid_PrevAndNext(
			long employeeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
				orderByComparator)
		throws NoSuchEmployeeEntryException;

	/**
	 * Removes all the employee entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of employee entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching employee entries
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the employee entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEmployeeEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public EmployeeEntry findByUUID_G(String uuid, long groupId)
		throws NoSuchEmployeeEntryException;

	/**
	 * Returns the employee entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public EmployeeEntry fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the employee entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public EmployeeEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the employee entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the employee entry that was removed
	 */
	public EmployeeEntry removeByUUID_G(String uuid, long groupId)
		throws NoSuchEmployeeEntryException;

	/**
	 * Returns the number of employee entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching employee entries
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the employee entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching employee entries
	 */
	public java.util.List<EmployeeEntry> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<EmployeeEntry> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<EmployeeEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator);

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
	public java.util.List<EmployeeEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first employee entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public EmployeeEntry findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
				orderByComparator)
		throws NoSuchEmployeeEntryException;

	/**
	 * Returns the first employee entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public EmployeeEntry fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator);

	/**
	 * Returns the last employee entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public EmployeeEntry findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
				orderByComparator)
		throws NoSuchEmployeeEntryException;

	/**
	 * Returns the last employee entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public EmployeeEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator);

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
	public EmployeeEntry[] findByUuid_C_PrevAndNext(
			long employeeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
				orderByComparator)
		throws NoSuchEmployeeEntryException;

	/**
	 * Removes all the employee entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of employee entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching employee entries
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the employee entries where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching employee entries
	 */
	public java.util.List<EmployeeEntry> findByname(String name);

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
	public java.util.List<EmployeeEntry> findByname(
		String name, int start, int end);

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
	public java.util.List<EmployeeEntry> findByname(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator);

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
	public java.util.List<EmployeeEntry> findByname(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first employee entry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public EmployeeEntry findByname_First(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
				orderByComparator)
		throws NoSuchEmployeeEntryException;

	/**
	 * Returns the first employee entry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public EmployeeEntry fetchByname_First(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator);

	/**
	 * Returns the last employee entry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee entry
	 * @throws NoSuchEmployeeEntryException if a matching employee entry could not be found
	 */
	public EmployeeEntry findByname_Last(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
				orderByComparator)
		throws NoSuchEmployeeEntryException;

	/**
	 * Returns the last employee entry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee entry, or <code>null</code> if a matching employee entry could not be found
	 */
	public EmployeeEntry fetchByname_Last(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator);

	/**
	 * Returns the employee entries before and after the current employee entry in the ordered set where name = &#63;.
	 *
	 * @param employeeId the primary key of the current employee entry
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee entry
	 * @throws NoSuchEmployeeEntryException if a employee entry with the primary key could not be found
	 */
	public EmployeeEntry[] findByname_PrevAndNext(
			long employeeId, String name,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
				orderByComparator)
		throws NoSuchEmployeeEntryException;

	/**
	 * Removes all the employee entries where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByname(String name);

	/**
	 * Returns the number of employee entries where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching employee entries
	 */
	public int countByname(String name);

	/**
	 * Caches the employee entry in the entity cache if it is enabled.
	 *
	 * @param employeeEntry the employee entry
	 */
	public void cacheResult(EmployeeEntry employeeEntry);

	/**
	 * Caches the employee entries in the entity cache if it is enabled.
	 *
	 * @param employeeEntries the employee entries
	 */
	public void cacheResult(java.util.List<EmployeeEntry> employeeEntries);

	/**
	 * Creates a new employee entry with the primary key. Does not add the employee entry to the database.
	 *
	 * @param employeeId the primary key for the new employee entry
	 * @return the new employee entry
	 */
	public EmployeeEntry create(long employeeId);

	/**
	 * Removes the employee entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeId the primary key of the employee entry
	 * @return the employee entry that was removed
	 * @throws NoSuchEmployeeEntryException if a employee entry with the primary key could not be found
	 */
	public EmployeeEntry remove(long employeeId)
		throws NoSuchEmployeeEntryException;

	public EmployeeEntry updateImpl(EmployeeEntry employeeEntry);

	/**
	 * Returns the employee entry with the primary key or throws a <code>NoSuchEmployeeEntryException</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the employee entry
	 * @return the employee entry
	 * @throws NoSuchEmployeeEntryException if a employee entry with the primary key could not be found
	 */
	public EmployeeEntry findByPrimaryKey(long employeeId)
		throws NoSuchEmployeeEntryException;

	/**
	 * Returns the employee entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the employee entry
	 * @return the employee entry, or <code>null</code> if a employee entry with the primary key could not be found
	 */
	public EmployeeEntry fetchByPrimaryKey(long employeeId);

	/**
	 * Returns all the employee entries.
	 *
	 * @return the employee entries
	 */
	public java.util.List<EmployeeEntry> findAll();

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
	public java.util.List<EmployeeEntry> findAll(int start, int end);

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
	public java.util.List<EmployeeEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator);

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
	public java.util.List<EmployeeEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the employee entries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of employee entries.
	 *
	 * @return the number of employee entries
	 */
	public int countAll();

}