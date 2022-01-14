package com.poc.home.rest.client.serdes.v1_0;

import com.poc.home.rest.client.dto.v1_0.TreeDepartment;
import com.poc.home.rest.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author hoang
 * @generated
 */
@Generated("")
public class TreeDepartmentSerDes {

	public static TreeDepartment toDTO(String json) {
		TreeDepartmentJSONParser treeDepartmentJSONParser =
			new TreeDepartmentJSONParser();

		return treeDepartmentJSONParser.parseToDTO(json);
	}

	public static TreeDepartment[] toDTOs(String json) {
		TreeDepartmentJSONParser treeDepartmentJSONParser =
			new TreeDepartmentJSONParser();

		return treeDepartmentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(TreeDepartment treeDepartment) {
		if (treeDepartment == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (treeDepartment.getAddress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address\": ");

			sb.append("\"");

			sb.append(_escape(treeDepartment.getAddress()));

			sb.append("\"");
		}

		if (treeDepartment.getAlias() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"alias\": ");

			sb.append("\"");

			sb.append(_escape(treeDepartment.getAlias()));

			sb.append("\"");
		}

		if (treeDepartment.getBusinessName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"businessName\": ");

			sb.append("\"");

			sb.append(_escape(treeDepartment.getBusinessName()));

			sb.append("\"");
		}

		if (treeDepartment.getCode() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"code\": ");

			sb.append("\"");

			sb.append(_escape(treeDepartment.getCode()));

			sb.append("\"");
		}

		if (treeDepartment.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(treeDepartment.getDescription()));

			sb.append("\"");
		}

		if (treeDepartment.getHeadOffice() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"headOffice\": ");

			sb.append("\"");

			sb.append(_escape(treeDepartment.getHeadOffice()));

			sb.append("\"");
		}

		if (treeDepartment.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(treeDepartment.getId());
		}

		if (treeDepartment.getName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(treeDepartment.getName()));

			sb.append("\"");
		}

		if (treeDepartment.getOrd() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ord\": ");

			sb.append(treeDepartment.getOrd());
		}

		if (treeDepartment.getParentId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentId\": ");

			sb.append(treeDepartment.getParentId());
		}

		if (treeDepartment.getTax() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tax\": ");

			sb.append("\"");

			sb.append(_escape(treeDepartment.getTax()));

			sb.append("\"");
		}

		if (treeDepartment.getTreeDepartments() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"treeDepartments\": ");

			sb.append("[");

			for (int i = 0; i < treeDepartment.getTreeDepartments().length;
				 i++) {

				sb.append(
					String.valueOf(treeDepartment.getTreeDepartments()[i]));

				if ((i + 1) < treeDepartment.getTreeDepartments().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (treeDepartment.getType() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"type\": ");

			sb.append("\"");

			sb.append(_escape(treeDepartment.getType()));

			sb.append("\"");
		}

		if (treeDepartment.getTypeName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"typeName\": ");

			sb.append("\"");

			sb.append(_escape(treeDepartment.getTypeName()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		TreeDepartmentJSONParser treeDepartmentJSONParser =
			new TreeDepartmentJSONParser();

		return treeDepartmentJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(TreeDepartment treeDepartment) {
		if (treeDepartment == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (treeDepartment.getAddress() == null) {
			map.put("address", null);
		}
		else {
			map.put("address", String.valueOf(treeDepartment.getAddress()));
		}

		if (treeDepartment.getAlias() == null) {
			map.put("alias", null);
		}
		else {
			map.put("alias", String.valueOf(treeDepartment.getAlias()));
		}

		if (treeDepartment.getBusinessName() == null) {
			map.put("businessName", null);
		}
		else {
			map.put(
				"businessName",
				String.valueOf(treeDepartment.getBusinessName()));
		}

		if (treeDepartment.getCode() == null) {
			map.put("code", null);
		}
		else {
			map.put("code", String.valueOf(treeDepartment.getCode()));
		}

		if (treeDepartment.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put(
				"description", String.valueOf(treeDepartment.getDescription()));
		}

		if (treeDepartment.getHeadOffice() == null) {
			map.put("headOffice", null);
		}
		else {
			map.put(
				"headOffice", String.valueOf(treeDepartment.getHeadOffice()));
		}

		if (treeDepartment.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(treeDepartment.getId()));
		}

		if (treeDepartment.getName() == null) {
			map.put("name", null);
		}
		else {
			map.put("name", String.valueOf(treeDepartment.getName()));
		}

		if (treeDepartment.getOrd() == null) {
			map.put("ord", null);
		}
		else {
			map.put("ord", String.valueOf(treeDepartment.getOrd()));
		}

		if (treeDepartment.getParentId() == null) {
			map.put("parentId", null);
		}
		else {
			map.put("parentId", String.valueOf(treeDepartment.getParentId()));
		}

		if (treeDepartment.getTax() == null) {
			map.put("tax", null);
		}
		else {
			map.put("tax", String.valueOf(treeDepartment.getTax()));
		}

		if (treeDepartment.getTreeDepartments() == null) {
			map.put("treeDepartments", null);
		}
		else {
			map.put(
				"treeDepartments",
				String.valueOf(treeDepartment.getTreeDepartments()));
		}

		if (treeDepartment.getType() == null) {
			map.put("type", null);
		}
		else {
			map.put("type", String.valueOf(treeDepartment.getType()));
		}

		if (treeDepartment.getTypeName() == null) {
			map.put("typeName", null);
		}
		else {
			map.put("typeName", String.valueOf(treeDepartment.getTypeName()));
		}

		return map;
	}

	public static class TreeDepartmentJSONParser
		extends BaseJSONParser<TreeDepartment> {

		@Override
		protected TreeDepartment createDTO() {
			return new TreeDepartment();
		}

		@Override
		protected TreeDepartment[] createDTOArray(int size) {
			return new TreeDepartment[size];
		}

		@Override
		protected void setField(
			TreeDepartment treeDepartment, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "address")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setAddress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "alias")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setAlias((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "businessName")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setBusinessName(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "code")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setCode((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "headOffice")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setHeadOffice((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "ord")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setOrd(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "parentId")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setParentId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "tax")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setTax((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "treeDepartments")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setTreeDepartments(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> TreeDepartmentSerDes.toDTO((String)object)
						).toArray(
							size -> new TreeDepartment[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "type")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setType((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "typeName")) {
				if (jsonParserFieldValue != null) {
					treeDepartment.setTypeName((String)jsonParserFieldValue);
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