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

package com.poc.home.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.poc.home.model.HomeEntry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HomeEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HomeEntryCacheModel
	implements CacheModel<HomeEntry>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HomeEntryCacheModel)) {
			return false;
		}

		HomeEntryCacheModel homeEntryCacheModel = (HomeEntryCacheModel)object;

		if (homeId == homeEntryCacheModel.homeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, homeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", homeId=");
		sb.append(homeId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", address=");
		sb.append(address);
		sb.append(", floor=");
		sb.append(floor);
		sb.append(", square=");
		sb.append(square);
		sb.append(", room=");
		sb.append(room);
		sb.append(", color=");
		sb.append(color);
		sb.append(", owner=");
		sb.append(owner);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HomeEntry toEntityModel() {
		HomeEntryImpl homeEntryImpl = new HomeEntryImpl();

		if (uuid == null) {
			homeEntryImpl.setUuid("");
		}
		else {
			homeEntryImpl.setUuid(uuid);
		}

		homeEntryImpl.setHomeId(homeId);
		homeEntryImpl.setGroupId(groupId);
		homeEntryImpl.setCompanyId(companyId);
		homeEntryImpl.setUserId(userId);

		if (userName == null) {
			homeEntryImpl.setUserName("");
		}
		else {
			homeEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			homeEntryImpl.setCreateDate(null);
		}
		else {
			homeEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			homeEntryImpl.setModifiedDate(null);
		}
		else {
			homeEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (address == null) {
			homeEntryImpl.setAddress("");
		}
		else {
			homeEntryImpl.setAddress(address);
		}

		homeEntryImpl.setFloor(floor);
		homeEntryImpl.setSquare(square);
		homeEntryImpl.setRoom(room);

		if (color == null) {
			homeEntryImpl.setColor("");
		}
		else {
			homeEntryImpl.setColor(color);
		}

		if (owner == null) {
			homeEntryImpl.setOwner("");
		}
		else {
			homeEntryImpl.setOwner(owner);
		}

		homeEntryImpl.resetOriginalValues();

		return homeEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		homeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		address = objectInput.readUTF();

		floor = objectInput.readInt();

		square = objectInput.readFloat();

		room = objectInput.readInt();
		color = objectInput.readUTF();
		owner = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(homeId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		objectOutput.writeInt(floor);

		objectOutput.writeFloat(square);

		objectOutput.writeInt(room);

		if (color == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(color);
		}

		if (owner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(owner);
		}
	}

	public String uuid;
	public long homeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String address;
	public int floor;
	public float square;
	public int room;
	public String color;
	public String owner;

}