package com.poc.home.rest.client.serdes.v1_0_0;

import com.poc.home.rest.client.dto.v1_0_0.Home;
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
public class HomeSerDes {

	public static Home toDTO(String json) {
		HomeJSONParser homeJSONParser = new HomeJSONParser();

		return homeJSONParser.parseToDTO(json);
	}

	public static Home[] toDTOs(String json) {
		HomeJSONParser homeJSONParser = new HomeJSONParser();

		return homeJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Home home) {
		if (home == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (home.getAddress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address\": ");

			sb.append("\"");

			sb.append(_escape(home.getAddress()));

			sb.append("\"");
		}

		if (home.getColor() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"color\": ");

			sb.append("\"");

			sb.append(_escape(home.getColor()));

			sb.append("\"");
		}

		if (home.getFloor() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"floor\": ");

			sb.append(home.getFloor());
		}

		if (home.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(home.getId());
		}

		if (home.getOwner() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"owner\": ");

			sb.append("\"");

			sb.append(_escape(home.getOwner()));

			sb.append("\"");
		}

		if (home.getRoom() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"room\": ");

			sb.append(home.getRoom());
		}

		if (home.getSquare() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"square\": ");

			sb.append(home.getSquare());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		HomeJSONParser homeJSONParser = new HomeJSONParser();

		return homeJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Home home) {
		if (home == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (home.getAddress() == null) {
			map.put("address", null);
		}
		else {
			map.put("address", String.valueOf(home.getAddress()));
		}

		if (home.getColor() == null) {
			map.put("color", null);
		}
		else {
			map.put("color", String.valueOf(home.getColor()));
		}

		if (home.getFloor() == null) {
			map.put("floor", null);
		}
		else {
			map.put("floor", String.valueOf(home.getFloor()));
		}

		if (home.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(home.getId()));
		}

		if (home.getOwner() == null) {
			map.put("owner", null);
		}
		else {
			map.put("owner", String.valueOf(home.getOwner()));
		}

		if (home.getRoom() == null) {
			map.put("room", null);
		}
		else {
			map.put("room", String.valueOf(home.getRoom()));
		}

		if (home.getSquare() == null) {
			map.put("square", null);
		}
		else {
			map.put("square", String.valueOf(home.getSquare()));
		}

		return map;
	}

	public static class HomeJSONParser extends BaseJSONParser<Home> {

		@Override
		protected Home createDTO() {
			return new Home();
		}

		@Override
		protected Home[] createDTOArray(int size) {
			return new Home[size];
		}

		@Override
		protected void setField(
			Home home, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "address")) {
				if (jsonParserFieldValue != null) {
					home.setAddress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "color")) {
				if (jsonParserFieldValue != null) {
					home.setColor((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "floor")) {
				if (jsonParserFieldValue != null) {
					home.setFloor(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					home.setId(Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "owner")) {
				if (jsonParserFieldValue != null) {
					home.setOwner((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "room")) {
				if (jsonParserFieldValue != null) {
					home.setRoom(Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "square")) {
				if (jsonParserFieldValue != null) {
					home.setSquare(Float.valueOf((String)jsonParserFieldValue));
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