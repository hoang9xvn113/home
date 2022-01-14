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

import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.poc.home.model.HomeEntry;
import com.poc.home.service.base.HomeEntryServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=dg",
		"json.web.service.context.path=HomeEntry"
	},
	service = AopService.class
)
public class HomeEntryServiceImpl extends HomeEntryServiceBaseImpl {
}