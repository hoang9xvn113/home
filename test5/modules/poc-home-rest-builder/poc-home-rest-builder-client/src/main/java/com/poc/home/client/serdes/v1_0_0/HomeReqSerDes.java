package com.poc.home.client.serdes.v1_0_0;

import com.poc.home.client.dto.v1_0_0.HomeReq;
import com.poc.home.client.json.BaseJSONParser;

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
public class HomeReqSerDes {

	public static HomeReq toDTO(String json) {
		HomeReqJSONParser homeReqJSONParser = new HomeReqJSONParser();

		return homeReqJSONParser.parseToDTO(json);
	}

	public static HomeReq[] toDTOs(String json) {
		HomeReqJSONParser homeReqJSONParser = new HomeReqJSONParser();

		return homeReqJSONParser.parseToDTOs(json);
	}

	public static String toJSON(HomeReq homeReq) {
		if (homeReq == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (homeReq.getAddress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address\": ");

			sb.append("\"");

			sb.append(_escape(homeReq.getAddress()));

			sb.append("\"");
		}

		if (homeReq.getColor() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"color\": ");

			sb.append("\"");

			sb.append(_escape(homeReq.getColor()));

			sb.append("\"");
		}

		if (homeReq.getFloor() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"floor\": ");

			sb.append(homeReq.getFloor());
		}

		if (homeReq.getOwner() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"owner\": ");

			sb.append("\"");

			sb.append(_escape(homeReq.getOwner()));

			sb.append("\"");
		}

		if (homeReq.getRoom() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"room\": ");

			sb.append(homeReq.getRoom());
		}

		if (homeReq.getSquare() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"square\": ");

			sb.append(homeReq.getSquare());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		HomeReqJSONParser homeReqJSONParser = new HomeReqJSONParser();

		return homeReqJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(HomeReq homeReq) {
		if (homeReq == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (homeReq.getAddress() == null) {
			map.put("address", null);
		}
		else {
			map.put("address", String.valueOf(homeReq.getAddress()));
		}

		if (homeReq.getColor() == null) {
			map.put("color", null);
		}
		else {
			map.put("color", String.valueOf(homeReq.getColor()));
		}

		if (homeReq.getFloor() == null) {
			map.put("floor", null);
		}
		else {
			map.put("floor", String.valueOf(homeReq.getFloor()));
		}

		if (homeReq.getOwner() == null) {
			map.put("owner", null);
		}
		else {
			map.put("owner", String.valueOf(homeReq.getOwner()));
		}

		if (homeReq.getRoom() == null) {
			map.put("room", null);
		}
		else {
			map.put("room", String.valueOf(homeReq.getRoom()));
		}

		if (homeReq.getSquare() == null) {
			map.put("square", null);
		}
		else {
			map.put("square", String.valueOf(homeReq.getSquare()));
		}

		return map;
	}

	public static class HomeReqJSONParser extends BaseJSONParser<HomeReq> {

		@Override
		protected HomeReq createDTO() {
			return new HomeReq();
		}

		@Override
		protected HomeReq[] createDTOArray(int size) {
			return new HomeReq[size];
		}

		@Override
		protected void setField(
			HomeReq homeReq, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "address")) {
				if (jsonParserFieldValue != null) {
					homeReq.setAddress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "color")) {
				if (jsonParserFieldValue != null) {
					homeReq.setColor((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "floor")) {
				if (jsonParserFieldValue != null) {
					homeReq.setFloor(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "owner")) {
				if (jsonParserFieldValue != null) {
					homeReq.setOwner((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "room")) {
				if (jsonParserFieldValue != null) {
					homeReq.setRoom(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "square")) {
				if (jsonParserFieldValue != null) {
					homeReq.setSquare(
						Float.valueOf((String)jsonParserFieldValue));
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