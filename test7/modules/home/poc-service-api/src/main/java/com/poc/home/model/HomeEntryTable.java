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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;DG_HomeEntry&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HomeEntry
 * @generated
 */
public class HomeEntryTable extends BaseTable<HomeEntryTable> {

	public static final HomeEntryTable INSTANCE = new HomeEntryTable();

	public final Column<HomeEntryTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HomeEntryTable, Long> homeId = createColumn(
		"homeId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<HomeEntryTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HomeEntryTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HomeEntryTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HomeEntryTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HomeEntryTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HomeEntryTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HomeEntryTable, String> address = createColumn(
		"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HomeEntryTable, Integer> floor = createColumn(
		"floor", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<HomeEntryTable, Float> square = createColumn(
		"square", Float.class, Types.FLOAT, Column.FLAG_DEFAULT);
	public final Column<HomeEntryTable, Integer> room = createColumn(
		"room", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<HomeEntryTable, String> color = createColumn(
		"color", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HomeEntryTable, String> owner = createColumn(
		"owner", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private HomeEntryTable() {
		super("DG_HomeEntry", HomeEntryTable::new);
	}

}