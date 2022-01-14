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

package com.dogoo.poc.home.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.dogoo.poc.home.service.http.HomeEntryServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class HomeEntrySoap implements Serializable {

	public static HomeEntrySoap toSoapModel(HomeEntry model) {
		HomeEntrySoap soapModel = new HomeEntrySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setHomeId(model.getHomeId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setAddress(model.getAddress());
		soapModel.setFloor(model.getFloor());
		soapModel.setSquare(model.getSquare());
		soapModel.setRoom(model.getRoom());
		soapModel.setColor(model.getColor());
		soapModel.setOwner(model.getOwner());

		return soapModel;
	}

	public static HomeEntrySoap[] toSoapModels(HomeEntry[] models) {
		HomeEntrySoap[] soapModels = new HomeEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HomeEntrySoap[][] toSoapModels(HomeEntry[][] models) {
		HomeEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HomeEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new HomeEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HomeEntrySoap[] toSoapModels(List<HomeEntry> models) {
		List<HomeEntrySoap> soapModels = new ArrayList<HomeEntrySoap>(
			models.size());

		for (HomeEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HomeEntrySoap[soapModels.size()]);
	}

	public HomeEntrySoap() {
	}

	public long getPrimaryKey() {
		return _homeId;
	}

	public void setPrimaryKey(long pk) {
		setHomeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getHomeId() {
		return _homeId;
	}

	public void setHomeId(long homeId) {
		_homeId = homeId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public int getFloor() {
		return _floor;
	}

	public void setFloor(int floor) {
		_floor = floor;
	}

	public float getSquare() {
		return _square;
	}

	public void setSquare(float square) {
		_square = square;
	}

	public int getRoom() {
		return _room;
	}

	public void setRoom(int room) {
		_room = room;
	}

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		_color = color;
	}

	public String getOwner() {
		return _owner;
	}

	public void setOwner(String owner) {
		_owner = owner;
	}

	private String _uuid;
	private long _homeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _address;
	private int _floor;
	private float _square;
	private int _room;
	private String _color;
	private String _owner;

}