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

package com.poc.home.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import com.poc.home.model.HomeEntry;
import com.poc.home.service.HomeEntryService;
import com.poc.home.service.HomeEntryServiceUtil;
import com.poc.home.service.persistence.HomeEntryPersistence;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the home entry remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.poc.home.service.impl.HomeEntryServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.poc.home.service.impl.HomeEntryServiceImpl
 * @generated
 */
public abstract class HomeEntryServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, HomeEntryService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>HomeEntryService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>HomeEntryServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			HomeEntryService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		homeEntryService = (HomeEntryService)aopProxy;

		_setServiceUtilService(homeEntryService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return HomeEntryService.class.getName();
	}

	protected Class<?> getModelClass() {
		return HomeEntry.class;
	}

	protected String getModelClassName() {
		return HomeEntry.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = homeEntryPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setServiceUtilService(HomeEntryService homeEntryService) {
		try {
			Field field = HomeEntryServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, homeEntryService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected com.poc.home.service.HomeEntryLocalService homeEntryLocalService;

	protected HomeEntryService homeEntryService;

	@Reference
	protected HomeEntryPersistence homeEntryPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

}