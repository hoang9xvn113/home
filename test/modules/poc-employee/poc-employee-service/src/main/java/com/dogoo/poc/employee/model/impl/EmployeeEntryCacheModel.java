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

package com.dogoo.poc.employee.model.impl;

import com.dogoo.poc.employee.model.EmployeeEntry;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeEntryCacheModel
	implements CacheModel<EmployeeEntry>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmployeeEntryCacheModel)) {
			return false;
		}

		EmployeeEntryCacheModel employeeEntryCacheModel =
			(EmployeeEntryCacheModel)object;

		if (employeeId == employeeEntryCacheModel.employeeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, employeeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", employeeId=");
		sb.append(employeeId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", birthDay=");
		sb.append(birthDay);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", address=");
		sb.append(address);
		sb.append(", hasAccount=");
		sb.append(hasAccount);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmployeeEntry toEntityModel() {
		EmployeeEntryImpl employeeEntryImpl = new EmployeeEntryImpl();

		if (uuid == null) {
			employeeEntryImpl.setUuid("");
		}
		else {
			employeeEntryImpl.setUuid(uuid);
		}

		employeeEntryImpl.setEmployeeId(employeeId);
		employeeEntryImpl.setGroupId(groupId);
		employeeEntryImpl.setCompanyId(companyId);
		employeeEntryImpl.setUserId(userId);

		if (userName == null) {
			employeeEntryImpl.setUserName("");
		}
		else {
			employeeEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			employeeEntryImpl.setCreateDate(null);
		}
		else {
			employeeEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeEntryImpl.setModifiedDate(null);
		}
		else {
			employeeEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			employeeEntryImpl.setName("");
		}
		else {
			employeeEntryImpl.setName(name);
		}

		if (birthDay == Long.MIN_VALUE) {
			employeeEntryImpl.setBirthDay(null);
		}
		else {
			employeeEntryImpl.setBirthDay(new Date(birthDay));
		}

		employeeEntryImpl.setGender(gender);

		if (address == null) {
			employeeEntryImpl.setAddress("");
		}
		else {
			employeeEntryImpl.setAddress(address);
		}

		employeeEntryImpl.setHasAccount(hasAccount);

		employeeEntryImpl.resetOriginalValues();

		return employeeEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		employeeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		birthDay = objectInput.readLong();

		gender = objectInput.readInt();
		address = objectInput.readUTF();

		hasAccount = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(employeeId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(birthDay);

		objectOutput.writeInt(gender);

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		objectOutput.writeBoolean(hasAccount);
	}

	public String uuid;
	public long employeeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public long birthDay;
	public int gender;
	public String address;
	public boolean hasAccount;

}