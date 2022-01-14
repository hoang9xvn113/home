package com.poc.home.rest.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hoang
 * @generated
 */
@Generated("")
@GraphQLName(description = "A very simple department", value = "Department")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Department")
public class Department implements Serializable {

	public static Department toDTO(String json) {
		return ObjectMapperUtil.readValue(Department.class, json);
	}

	@Schema(description = "The department address.")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@JsonIgnore
	public void setAddress(
		UnsafeSupplier<String, Exception> addressUnsafeSupplier) {

		try {
			address = addressUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The department address.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String address;

	@Schema(description = "The department alias.")
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@JsonIgnore
	public void setAlias(
		UnsafeSupplier<String, Exception> aliasUnsafeSupplier) {

		try {
			alias = aliasUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The department alias.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String alias;

	@Schema(description = "The department business name.")
	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	@JsonIgnore
	public void setBusinessName(
		UnsafeSupplier<String, Exception> businessNameUnsafeSupplier) {

		try {
			businessName = businessNameUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The department business name.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String businessName;

	@Schema(description = "The department Code.")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@JsonIgnore
	public void setCode(UnsafeSupplier<String, Exception> codeUnsafeSupplier) {
		try {
			code = codeUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The department Code.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String code;

	@Schema
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonIgnore
	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		try {
			description = descriptionUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String description;

	@Schema(description = "The department headOffice.")
	public String getHeadOffice() {
		return headOffice;
	}

	public void setHeadOffice(String headOffice) {
		this.headOffice = headOffice;
	}

	@JsonIgnore
	public void setHeadOffice(
		UnsafeSupplier<String, Exception> headOfficeUnsafeSupplier) {

		try {
			headOffice = headOfficeUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The department headOffice.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String headOffice;

	@Schema(description = "The department ID.")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The department ID.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long id;

	@Schema(description = "The department Name.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
		try {
			name = nameUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The department Name.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String name;

	@Schema(description = "The department Ord.")
	public Integer getOrd() {
		return ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

	@JsonIgnore
	public void setOrd(UnsafeSupplier<Integer, Exception> ordUnsafeSupplier) {
		try {
			ord = ordUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The department Ord.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer ord;

	@Schema(description = "The department ParentId.")
	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	@JsonIgnore
	public void setParentId(
		UnsafeSupplier<Long, Exception> parentIdUnsafeSupplier) {

		try {
			parentId = parentIdUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The department ParentId.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long parentId;

	@Schema(description = "The department tax.")
	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	@JsonIgnore
	public void setTax(UnsafeSupplier<String, Exception> taxUnsafeSupplier) {
		try {
			tax = taxUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The department tax.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String tax;

	@Schema(description = "The department Type.")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@JsonIgnore
	public void setType(UnsafeSupplier<String, Exception> typeUnsafeSupplier) {
		try {
			type = typeUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The department Type.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String type;

	@Schema(description = "The department Type name.")
	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@JsonIgnore
	public void setTypeName(
		UnsafeSupplier<String, Exception> typeNameUnsafeSupplier) {

		try {
			typeName = typeNameUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The department Type name.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String typeName;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Department)) {
			return false;
		}

		Department department = (Department)object;

		return Objects.equals(toString(), department.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (address != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address\": ");

			sb.append("\"");

			sb.append(_escape(address));

			sb.append("\"");
		}

		if (alias != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"alias\": ");

			sb.append("\"");

			sb.append(_escape(alias));

			sb.append("\"");
		}

		if (businessName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"businessName\": ");

			sb.append("\"");

			sb.append(_escape(businessName));

			sb.append("\"");
		}

		if (code != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"code\": ");

			sb.append("\"");

			sb.append(_escape(code));

			sb.append("\"");
		}

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(description));

			sb.append("\"");
		}

		if (headOffice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"headOffice\": ");

			sb.append("\"");

			sb.append(_escape(headOffice));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(name));

			sb.append("\"");
		}

		if (ord != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ord\": ");

			sb.append(ord);
		}

		if (parentId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parentId\": ");

			sb.append(parentId);
		}

		if (tax != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tax\": ");

			sb.append("\"");

			sb.append(_escape(tax));

			sb.append("\"");
		}

		if (type != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"type\": ");

			sb.append("\"");

			sb.append(_escape(type));

			sb.append("\"");
		}

		if (typeName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"typeName\": ");

			sb.append("\"");

			sb.append(_escape(typeName));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.poc.home.rest.dto.v1_0.Department",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		return string.replaceAll("\"", "\\\\\"");
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
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

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(value);
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}