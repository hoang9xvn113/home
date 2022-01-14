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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EmployeeEntry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeEntry
 * @generated
 */
public class EmployeeEntryWrapper
	extends BaseModelWrapper<EmployeeEntry>
	implements EmployeeEntry, ModelWrapper<EmployeeEntry> {

	public EmployeeEntryWrapper(EmployeeEntry employeeEntry) {
		super(employeeEntry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("birthDay", getBirthDay());
		attributes.put("gender", getGender());
		attributes.put("address", getAddress());
		attributes.put("hasAccount", isHasAccount());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date birthDay = (Date)attributes.get("birthDay");

		if (birthDay != null) {
			setBirthDay(birthDay);
		}

		Integer gender = (Integer)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Boolean hasAccount = (Boolean)attributes.get("hasAccount");

		if (hasAccount != null) {
			setHasAccount(hasAccount);
		}
	}

	@Override
	public EmployeeEntry cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this employee entry.
	 *
	 * @return the address of this employee entry
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the birth day of this employee entry.
	 *
	 * @return the birth day of this employee entry
	 */
	@Override
	public Date getBirthDay() {
		return model.getBirthDay();
	}

	/**
	 * Returns the company ID of this employee entry.
	 *
	 * @return the company ID of this employee entry
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this employee entry.
	 *
	 * @return the create date of this employee entry
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the employee ID of this employee entry.
	 *
	 * @return the employee ID of this employee entry
	 */
	@Override
	public long getEmployeeId() {
		return model.getEmployeeId();
	}

	/**
	 * Returns the gender of this employee entry.
	 *
	 * @return the gender of this employee entry
	 */
	@Override
	public int getGender() {
		return model.getGender();
	}

	/**
	 * Returns the group ID of this employee entry.
	 *
	 * @return the group ID of this employee entry
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the has account of this employee entry.
	 *
	 * @return the has account of this employee entry
	 */
	@Override
	public boolean getHasAccount() {
		return model.getHasAccount();
	}

	/**
	 * Returns the modified date of this employee entry.
	 *
	 * @return the modified date of this employee entry
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this employee entry.
	 *
	 * @return the name of this employee entry
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this employee entry.
	 *
	 * @return the primary key of this employee entry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this employee entry.
	 *
	 * @return the user ID of this employee entry
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this employee entry.
	 *
	 * @return the user name of this employee entry
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this employee entry.
	 *
	 * @return the user uuid of this employee entry
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this employee entry.
	 *
	 * @return the uuid of this employee entry
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this employee entry is has account.
	 *
	 * @return <code>true</code> if this employee entry is has account; <code>false</code> otherwise
	 */
	@Override
	public boolean isHasAccount() {
		return model.isHasAccount();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address of this employee entry.
	 *
	 * @param address the address of this employee entry
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the birth day of this employee entry.
	 *
	 * @param birthDay the birth day of this employee entry
	 */
	@Override
	public void setBirthDay(Date birthDay) {
		model.setBirthDay(birthDay);
	}

	/**
	 * Sets the company ID of this employee entry.
	 *
	 * @param companyId the company ID of this employee entry
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this employee entry.
	 *
	 * @param createDate the create date of this employee entry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the employee ID of this employee entry.
	 *
	 * @param employeeId the employee ID of this employee entry
	 */
	@Override
	public void setEmployeeId(long employeeId) {
		model.setEmployeeId(employeeId);
	}

	/**
	 * Sets the gender of this employee entry.
	 *
	 * @param gender the gender of this employee entry
	 */
	@Override
	public void setGender(int gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the group ID of this employee entry.
	 *
	 * @param groupId the group ID of this employee entry
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets whether this employee entry is has account.
	 *
	 * @param hasAccount the has account of this employee entry
	 */
	@Override
	public void setHasAccount(boolean hasAccount) {
		model.setHasAccount(hasAccount);
	}

	/**
	 * Sets the modified date of this employee entry.
	 *
	 * @param modifiedDate the modified date of this employee entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this employee entry.
	 *
	 * @param name the name of this employee entry
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this employee entry.
	 *
	 * @param primaryKey the primary key of this employee entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this employee entry.
	 *
	 * @param userId the user ID of this employee entry
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this employee entry.
	 *
	 * @param userName the user name of this employee entry
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this employee entry.
	 *
	 * @param userUuid the user uuid of this employee entry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this employee entry.
	 *
	 * @param uuid the uuid of this employee entry
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
	protected EmployeeEntryWrapper wrap(EmployeeEntry employeeEntry) {
		return new EmployeeEntryWrapper(employeeEntry);
	}

}