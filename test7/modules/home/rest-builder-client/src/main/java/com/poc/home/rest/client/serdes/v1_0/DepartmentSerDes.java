package com.poc.home.rest.client.serdes.v1_0;

import com.poc.home.rest.client.dto.v1_0.Department;
import com.poc.home.rest.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author hoang
 * @generated
 */
@Generated("")
public class DepartmentSerDes {

	public static Department toDTO(String json) {
		DepartmentJSONParser departmentJSONParser = new DepartmentJSONParser();

		return departmentJSONParser.parseToDTO(json);
	}

	public static Department[] toDTOs(String json) {
		DepartmentJSONParser departmentJSONParser = new DepartmentJSONParser();

		return departmentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Department department) {
		if (department == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (department.getAddress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address\": ");

			sb.append("\"");

			sb.append(_escape(department.getAddress()));

			sb.append("\"");
		}

		if (department.getAlias() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"alias\": ");

			sb.append("\"");

			sb.append(_escape(department.getAlias()));

			sb.append("\"");
		}

		if (department.getBusinessName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"businessName\": ");

			sb.append("\"");

			sb.append(_escape(department.getBusinessName()));

			sb.append("\"");
		}

		if (department.getCode() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"code\": ");

			sb.append("\"");

			sb.append(_escape(department.getCode()));

			sb.append("\"");
		}

		if (department.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(department.getDescription()));

			sb.append("\"");
		}

		if (department.getHeadOffice() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"headOffice\": ");

			sb.append("\"");

			sb.append(_escape(department.getHeadOffice()));

			sb.append("\"");
		}

		if (department.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(department.getId());
		}

		if (department.getName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(department.getName()));

			sb.append("\"");
		}

		if (department.getOrd() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ord\": ");

			sb.append(department.getOrd());
		}

		if (department.getParentId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentId\": ");

			sb.append(department.getParentId());
		}

		if (department.getTax() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tax\": ");

			sb.append("\"");

			sb.append(_escape(department.getTax()));

			sb.append("\"");
		}

		if (department.getType() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"type\": ");

			sb.append("\"");

			sb.append(_escape(department.getType()));

			sb.append("\"");
		}

		if (department.getTypeName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"typeName\": ");

			sb.append("\"");

			sb.append(_escape(department.getTypeName()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		DepartmentJSONParser departmentJSONParser = new DepartmentJSONParser();

		return departmentJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Department department) {
		if (department == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (department.getAddress() == null) {
			map.put("address", null);
		}
		else {
			map.put("address", String.valueOf(department.getAddress()));
		}

		if (department.getAlias() == null) {
			map.put("alias", null);
		}
		else {
			map.put("alias", String.valueOf(department.getAlias()));
		}

		if (department.getBusinessName() == null) {
			map.put("businessName", null);
		}
		else {
			map.put(
				"businessName", String.valueOf(department.getBusinessName()));
		}

		if (department.getCode() == null) {
			map.put("code", null);
		}
		else {
			map.put("code", String.valueOf(department.getCode()));
		}

		if (department.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put("description", String.valueOf(department.getDescription()));
		}

		if (department.getHeadOffice() == null) {
			map.put("headOffice", null);
		}
		else {
			map.put("headOffice", String.valueOf(department.getHeadOffice()));
		}

		if (department.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(department.getId()));
		}

		if (department.getName() == null) {
			map.put("name", null);
		}
		else {
			map.put("name", String.valueOf(department.getName()));
		}

		if (department.getOrd() == null) {
			map.put("ord", null);
		}
		else {
			map.put("ord", String.valueOf(department.getOrd()));
		}

		if (department.getParentId() == null) {
			map.put("parentId", null);
		}
		else {
			map.put("parentId", String.valueOf(department.getParentId()));
		}

		if (department.getTax() == null) {
			map.put("tax", null);
		}
		else {
			map.put("tax", String.valueOf(department.getTax()));
		}

		if (department.getType() == null) {
			map.put("type", null);
		}
		else {
			map.put("type", String.valueOf(department.getType()));
		}

		if (department.getTypeName() == null) {
			map.put("typeName", null);
		}
		else {
			map.put("typeName", String.valueOf(department.getTypeName()));
		}

		return map;
	}

	public static class DepartmentJSONParser
		extends BaseJSONParser<Department> {

		@Override
		protected Department createDTO() {
			return new Department();
		}

		@Override
		protected Department[] createDTOArray(int size) {
			return new Department[size];
		}

		@Override
		protected void setField(
			Department department, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "address")) {
				if (jsonParserFieldValue != null) {
					department.setAddress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "alias")) {
				if (jsonParserFieldValue != null) {
					department.setAlias((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "businessName")) {
				if (jsonParserFieldValue != null) {
					department.setBusinessName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "code")) {
				if (jsonParserFieldValue != null) {
					department.setCode((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					department.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "headOffice")) {
				if (jsonParserFieldValue != null) {
					department.setHeadOffice((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					department.setId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					department.setName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "ord")) {
				if (jsonParserFieldValue != null) {
					department.setOrd(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "parentId")) {
				if (jsonParserFieldValue != null) {
					department.setParentId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "tax")) {
				if (jsonParserFieldValue != null) {
					department.setTax((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "type")) {
				if (jsonParserFieldValue != null) {
					department.setType((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "typeName")) {
				if (jsonParserFieldValue != null) {
					department.setTypeName((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}