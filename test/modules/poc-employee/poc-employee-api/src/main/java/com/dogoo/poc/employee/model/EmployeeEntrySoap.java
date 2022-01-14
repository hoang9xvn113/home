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

package com.dogoo.poc.employee.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.dogoo.poc.employee.service.http.EmployeeEntryServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class EmployeeEntrySoap implements Serializable {

	public static EmployeeEntrySoap toSoapModel(EmployeeEntry model) {
		EmployeeEntrySoap soapModel = new EmployeeEntrySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setEmployeeId(model.getEmployeeId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setBirthDay(model.getBirthDay());
		soapModel.setGender(model.getGender());
		soapModel.setAddress(model.getAddress());
		soapModel.setHasAccount(model.isHasAccount());

		return soapModel;
	}

	public static EmployeeEntrySoap[] toSoapModels(EmployeeEntry[] models) {
		EmployeeEntrySoap[] soapModels = new EmployeeEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeEntrySoap[][] toSoapModels(EmployeeEntry[][] models) {
		EmployeeEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeEntrySoap[] toSoapModels(List<EmployeeEntry> models) {
		List<EmployeeEntrySoap> soapModels = new ArrayList<EmployeeEntrySoap>(
			models.size());

		for (EmployeeEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeEntrySoap[soapModels.size()]);
	}

	public EmployeeEntrySoap() {
	}

	public long getPrimaryKey() {
		return _employeeId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Date getBirthDay() {
		return _birthDay;
	}

	public void setBirthDay(Date birthDay) {
		_birthDay = birthDay;
	}

	public int getGender() {
		return _gender;
	}

	public void setGender(int gender) {
		_gender = gender;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public boolean getHasAccount() {
		return _hasAccount;
	}

	public boolean isHasAccount() {
		return _hasAccount;
	}

	public void setHasAccount(boolean hasAccount) {
		_hasAccount = hasAccount;
	}

	private String _uuid;
	private long _employeeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private Date _birthDay;
	private int _gender;
	private String _address;
	private boolean _hasAccount;

}