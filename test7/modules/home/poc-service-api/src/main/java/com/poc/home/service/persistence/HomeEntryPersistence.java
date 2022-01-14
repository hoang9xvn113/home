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

package com.poc.home.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.poc.home.exception.NoSuchHomeEntryException;
import com.poc.home.model.HomeEntry;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the home entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HomeEntryUtil
 * @generated
 */
@ProviderType
public interface HomeEntryPersistence extends BasePersistence<HomeEntry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HomeEntryUtil} to access the home entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the home entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching home entries
	 */
	public java.util.List<HomeEntry> findByUuid(String uuid);

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
	public java.util.List<HomeEntry> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<HomeEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator);

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
	public java.util.List<HomeEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first home entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public HomeEntry findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
				orderByComparator)
		throws NoSuchHomeEntryException;

	/**
	 * Returns the first home entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public HomeEntry fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator);

	/**
	 * Returns the last home entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public HomeEntry findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
				orderByComparator)
		throws NoSuchHomeEntryException;

	/**
	 * Returns the last home entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public HomeEntry fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator);

	/**
	 * Returns the home entries before and after the current home entry in the ordered set where uuid = &#63;.
	 *
	 * @param homeId the primary key of the current home entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next home entry
	 * @throws NoSuchHomeEntryException if a home entry with the primary key could not be found
	 */
	public HomeEntry[] findByUuid_PrevAndNext(
			long homeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
				orderByComparator)
		throws NoSuchHomeEntryException;

	/**
	 * Removes all the home entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of home entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching home entries
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the home entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHomeEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public HomeEntry findByUUID_G(String uuid, long groupId)
		throws NoSuchHomeEntryException;

	/**
	 * Returns the home entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public HomeEntry fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the home entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public HomeEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the home entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the home entry that was removed
	 */
	public HomeEntry removeByUUID_G(String uuid, long groupId)
		throws NoSuchHomeEntryException;

	/**
	 * Returns the number of home entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching home entries
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the home entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching home entries
	 */
	public java.util.List<HomeEntry> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<HomeEntry> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<HomeEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator);

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
	public java.util.List<HomeEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first home entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public HomeEntry findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
				orderByComparator)
		throws NoSuchHomeEntryException;

	/**
	 * Returns the first home entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public HomeEntry fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator);

	/**
	 * Returns the last home entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public HomeEntry findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
				orderByComparator)
		throws NoSuchHomeEntryException;

	/**
	 * Returns the last home entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public HomeEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator);

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
	public HomeEntry[] findByUuid_C_PrevAndNext(
			long homeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
				orderByComparator)
		throws NoSuchHomeEntryException;

	/**
	 * Removes all the home entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of home entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching home entries
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the home entries where address = &#63;.
	 *
	 * @param address the address
	 * @return the matching home entries
	 */
	public java.util.List<HomeEntry> findByAddress(String address);

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
	public java.util.List<HomeEntry> findByAddress(
		String address, int start, int end);

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
	public java.util.List<HomeEntry> findByAddress(
		String address, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator);

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
	public java.util.List<HomeEntry> findByAddress(
		String address, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first home entry in the ordered set where address = &#63;.
	 *
	 * @param address the address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public HomeEntry findByAddress_First(
			String address,
			com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
				orderByComparator)
		throws NoSuchHomeEntryException;

	/**
	 * Returns the first home entry in the ordered set where address = &#63;.
	 *
	 * @param address the address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public HomeEntry fetchByAddress_First(
		String address,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator);

	/**
	 * Returns the last home entry in the ordered set where address = &#63;.
	 *
	 * @param address the address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching home entry
	 * @throws NoSuchHomeEntryException if a matching home entry could not be found
	 */
	public HomeEntry findByAddress_Last(
			String address,
			com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
				orderByComparator)
		throws NoSuchHomeEntryException;

	/**
	 * Returns the last home entry in the ordered set where address = &#63;.
	 *
	 * @param address the address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching home entry, or <code>null</code> if a matching home entry could not be found
	 */
	public HomeEntry fetchByAddress_Last(
		String address,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator);

	/**
	 * Returns the home entries before and after the current home entry in the ordered set where address = &#63;.
	 *
	 * @param homeId the primary key of the current home entry
	 * @param address the address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next home entry
	 * @throws NoSuchHomeEntryException if a home entry with the primary key could not be found
	 */
	public HomeEntry[] findByAddress_PrevAndNext(
			long homeId, String address,
			com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
				orderByComparator)
		throws NoSuchHomeEntryException;

	/**
	 * Removes all the home entries where address = &#63; from the database.
	 *
	 * @param address the address
	 */
	public void removeByAddress(String address);

	/**
	 * Returns the number of home entries where address = &#63;.
	 *
	 * @param address the address
	 * @return the number of matching home entries
	 */
	public int countByAddress(String address);

	/**
	 * Caches the home entry in the entity cache if it is enabled.
	 *
	 * @param homeEntry the home entry
	 */
	public void cacheResult(HomeEntry homeEntry);

	/**
	 * Caches the home entries in the entity cache if it is enabled.
	 *
	 * @param homeEntries the home entries
	 */
	public void cacheResult(java.util.List<HomeEntry> homeEntries);

	/**
	 * Creates a new home entry with the primary key. Does not add the home entry to the database.
	 *
	 * @param homeId the primary key for the new home entry
	 * @return the new home entry
	 */
	public HomeEntry create(long homeId);

	/**
	 * Removes the home entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param homeId the primary key of the home entry
	 * @return the home entry that was removed
	 * @throws NoSuchHomeEntryException if a home entry with the primary key could not be found
	 */
	public HomeEntry remove(long homeId) throws NoSuchHomeEntryException;

	public HomeEntry updateImpl(HomeEntry homeEntry);

	/**
	 * Returns the home entry with the primary key or throws a <code>NoSuchHomeEntryException</code> if it could not be found.
	 *
	 * @param homeId the primary key of the home entry
	 * @return the home entry
	 * @throws NoSuchHomeEntryException if a home entry with the primary key could not be found
	 */
	public HomeEntry findByPrimaryKey(long homeId)
		throws NoSuchHomeEntryException;

	/**
	 * Returns the home entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param homeId the primary key of the home entry
	 * @return the home entry, or <code>null</code> if a home entry with the primary key could not be found
	 */
	public HomeEntry fetchByPrimaryKey(long homeId);

	/**
	 * Returns all the home entries.
	 *
	 * @return the home entries
	 */
	public java.util.List<HomeEntry> findAll();

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
	public java.util.List<HomeEntry> findAll(int start, int end);

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
	public java.util.List<HomeEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator);

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
	public java.util.List<HomeEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HomeEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the home entries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of home entries.
	 *
	 * @return the number of home entries
	 */
	public int countAll();

}