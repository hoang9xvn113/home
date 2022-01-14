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

package com.poc.home.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.poc.home.model.HomeEntry;
import com.poc.home.service.base.HomeEntryLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.poc.home.model.HomeEntry",
	service = AopService.class
)
public class HomeEntryLocalServiceImpl extends HomeEntryLocalServiceBaseImpl {
	@SystemEvent(type = SystemEventConstants.TYPE_DEFAULT)
	public List<HomeEntry> getAllHomes() {
		return getHomeEntries(0, getHomeEntriesCount());
	}

	@SystemEvent(type = SystemEventConstants.TYPE_DEFAULT)
	public HomeEntry getHomeByHomeId(long homeId) throws PortalException {
		return getHomeEntry(homeId);
	}

	@SystemEvent(type = SystemEventConstants.TYPE_DEFAULT)
	@Indexable(type = IndexableType.REINDEX)
	public HomeEntry createHomeEntry(String address, int floor, float square,
								int room, String color, String owner,
								ServiceContext serviceContext) {

		HomeEntry homeEntry = createHomeEntry(counterLocalService.increment(HomeEntry.class.getName()));

		Date current = new Date();

		updateModifierAudit(homeEntry, current, serviceContext);

		homeEntry.setGroupId(serviceContext.getScopeGroupId());
		homeEntry.setCompanyId(serviceContext.getCompanyId());
		homeEntry.setModifiedDate(serviceContext.getModifiedDate(current));
		homeEntry.setCreateDate(serviceContext.getCreateDate(current));

		homeEntry.setAddress(address);
		homeEntry.setFloor(floor);
		homeEntry.setSquare(square);
		homeEntry.setRoom(room);
		homeEntry.setColor(color);
		homeEntry.setOwner(owner);

		return addHomeEntry(homeEntry);

	}

	@SystemEvent(type = SystemEventConstants.TYPE_DEFAULT)
	@Indexable(type = IndexableType.REINDEX)
	public HomeEntry updateHomeEntryByHomeId(long homeId, String address, int floor,
										float square, int room, String color,
										String owner, ServiceContext serviceContext) throws PortalException{

		HomeEntry homeEntry = getHomeEntry(homeId);

		Date current = new Date();

		updateModifierAudit(homeEntry, current, serviceContext);

		homeEntry.setAddress(address);
		homeEntry.setFloor(floor);
		homeEntry.setSquare(square);
		homeEntry.setRoom(room);
		homeEntry.setColor(color);
		homeEntry.setOwner(owner);

		return updateHomeEntry(homeEntry);
	}

	@SystemEvent(type = SystemEventConstants.TYPE_DELETE)
	@Indexable(type = IndexableType.DELETE)
	public HomeEntry deleteHomeEntryByHomeId(long homeId) throws PortalException{
		HomeEntry homeEntry = getHomeEntry(homeId);

		return deleteHomeEntry(homeEntry);
	}


	private void updateModifierAudit(HomeEntry homeEntry, Date current, ServiceContext serviceContext) {

		User user = userLocalService.fetchUser(serviceContext.getUserId());

		if (user != null) {
			homeEntry.setUserName(user.getFullName());
			homeEntry.setUserUuid(user.getUserUuid());
		}

		homeEntry.setModifiedDate(serviceContext.getModifiedDate(current));
		homeEntry.setUserId(serviceContext.getUserId());
	}

}