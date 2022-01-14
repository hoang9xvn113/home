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

package com.dogoo.poc.employee.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeEntryService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeEntryService
 * @generated
 */
public class EmployeeEntryServiceWrapper
	implements EmployeeEntryService, ServiceWrapper<EmployeeEntryService> {

	public EmployeeEntryServiceWrapper(
		EmployeeEntryService employeeEntryService) {

		_employeeEntryService = employeeEntryService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _employeeEntryService.getOSGiServiceIdentifier();
	}

	@Override
	public EmployeeEntryService getWrappedService() {
		return _employeeEntryService;
	}

	@Override
	public void setWrappedService(EmployeeEntryService employeeEntryService) {
		_employeeEntryService = employeeEntryService;
	}

	private EmployeeEntryService _employeeEntryService;

}