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

package com.poc.home.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HomeEntry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HomeEntry
 * @generated
 */
public class HomeEntryWrapper
	extends BaseModelWrapper<HomeEntry>
	implements HomeEntry, ModelWrapper<HomeEntry> {

	public HomeEntryWrapper(HomeEntry homeEntry) {
		super(homeEntry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("homeId", getHomeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("address", getAddress());
		attributes.put("floor", getFloor());
		attributes.put("square", getSquare());
		attributes.put("room", getRoom());
		attributes.put("color", getColor());
		attributes.put("owner", getOwner());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long homeId = (Long)attributes.get("homeId");

		if (homeId != null) {
			setHomeId(homeId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Integer floor = (Integer)attributes.get("floor");

		if (floor != null) {
			setFloor(floor);
		}

		Float square = (Float)attributes.get("square");

		if (square != null) {
			setSquare(square);
		}

		Integer room = (Integer)attributes.get("room");

		if (room != null) {
			setRoom(room);
		}

		String color = (String)attributes.get("color");

		if (color != null) {
			setColor(color);
		}

		String owner = (String)attributes.get("owner");

		if (owner != null) {
			setOwner(owner);
		}
	}

	@Override
	public HomeEntry cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this home entry.
	 *
	 * @return the address of this home entry
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the color of this home entry.
	 *
	 * @return the color of this home entry
	 */
	@Override
	public String getColor() {
		return model.getColor();
	}

	/**
	 * Returns the company ID of this home entry.
	 *
	 * @return the company ID of this home entry
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this home entry.
	 *
	 * @return the create date of this home entry
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the floor of this home entry.
	 *
	 * @return the floor of this home entry
	 */
	@Override
	public int getFloor() {
		return model.getFloor();
	}

	/**
	 * Returns the group ID of this home entry.
	 *
	 * @return the group ID of this home entry
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the home ID of this home entry.
	 *
	 * @return the home ID of this home entry
	 */
	@Override
	public long getHomeId() {
		return model.getHomeId();
	}

	/**
	 * Returns the modified date of this home entry.
	 *
	 * @return the modified date of this home entry
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the owner of this home entry.
	 *
	 * @return the owner of this home entry
	 */
	@Override
	public String getOwner() {
		return model.getOwner();
	}

	/**
	 * Returns the primary key of this home entry.
	 *
	 * @return the primary key of this home entry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the room of this home entry.
	 *
	 * @return the room of this home entry
	 */
	@Override
	public int getRoom() {
		return model.getRoom();
	}

	/**
	 * Returns the square of this home entry.
	 *
	 * @return the square of this home entry
	 */
	@Override
	public float getSquare() {
		return model.getSquare();
	}

	/**
	 * Returns the user ID of this home entry.
	 *
	 * @return the user ID of this home entry
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this home entry.
	 *
	 * @return the user name of this home entry
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this home entry.
	 *
	 * @return the user uuid of this home entry
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this home entry.
	 *
	 * @return the uuid of this home entry
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address of this home entry.
	 *
	 * @param address the address of this home entry
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the color of this home entry.
	 *
	 * @param color the color of this home entry
	 */
	@Override
	public void setColor(String color) {
		model.setColor(color);
	}

	/**
	 * Sets the company ID of this home entry.
	 *
	 * @param companyId the company ID of this home entry
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this home entry.
	 *
	 * @param createDate the create date of this home entry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the floor of this home entry.
	 *
	 * @param floor the floor of this home entry
	 */
	@Override
	public void setFloor(int floor) {
		model.setFloor(floor);
	}

	/**
	 * Sets the group ID of this home entry.
	 *
	 * @param groupId the group ID of this home entry
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the home ID of this home entry.
	 *
	 * @param homeId the home ID of this home entry
	 */
	@Override
	public void setHomeId(long homeId) {
		model.setHomeId(homeId);
	}

	/**
	 * Sets the modified date of this home entry.
	 *
	 * @param modifiedDate the modified date of this home entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the owner of this home entry.
	 *
	 * @param owner the owner of this home entry
	 */
	@Override
	public void setOwner(String owner) {
		model.setOwner(owner);
	}

	/**
	 * Sets the primary key of this home entry.
	 *
	 * @param primaryKey the primary key of this home entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the room of this home entry.
	 *
	 * @param room the room of this home entry
	 */
	@Override
	public void setRoom(int room) {
		model.setRoom(room);
	}

	/**
	 * Sets the square of this home entry.
	 *
	 * @param square the square of this home entry
	 */
	@Override
	public void setSquare(float square) {
		model.setSquare(square);
	}

	/**
	 * Sets the user ID of this home entry.
	 *
	 * @param userId the user ID of this home entry
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this home entry.
	 *
	 * @param userName the user name of this home entry
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this home entry.
	 *
	 * @param userUuid the user uuid of this home entry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this home entry.
	 *
	 * @param uuid the uuid of this home entry
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected HomeEntryWrapper wrap(HomeEntry homeEntry) {
		return new HomeEntryWrapper(homeEntry);
	}

}