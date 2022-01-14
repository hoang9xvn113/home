package com.poc.home.rest.client.dto.v1_0;

import com.poc.home.rest.client.function.UnsafeSupplier;
import com.poc.home.rest.client.serdes.v1_0.TreeDepartmentSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author hoang
 * @generated
 */
@Generated("")
public class TreeDepartment implements Cloneable, Serializable {

	public static TreeDepartment toDTO(String json) {
		return TreeDepartmentSerDes.toDTO(json);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAddress(
		UnsafeSupplier<String, Exception> addressUnsafeSupplier) {

		try {
			address = addressUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String address;

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public void setAlias(
		UnsafeSupplier<String, Exception> aliasUnsafeSupplier) {

		try {
			alias = aliasUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String alias;

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public void setBusinessName(
		UnsafeSupplier<String, Exception> businessNameUnsafeSupplier) {

		try {
			businessName = businessNameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String businessName;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setCode(UnsafeSupplier<String, Exception> codeUnsafeSupplier) {
		try {
			code = codeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String code;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		try {
			description = descriptionUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String description;

	public String getHeadOffice() {
		return headOffice;
	}

	public void setHeadOffice(String headOffice) {
		this.headOffice = headOffice;
	}

	public void setHeadOffice(
		UnsafeSupplier<String, Exception> headOfficeUnsafeSupplier) {

		try {
			headOffice = headOfficeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String headOffice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
		try {
			name = nameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String name;

	public Integer getOrd() {
		return ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

	public void setOrd(UnsafeSupplier<Integer, Exception> ordUnsafeSupplier) {
		try {
			ord = ordUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer ord;

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public void setParentId(
		UnsafeSupplier<Long, Exception> parentIdUnsafeSupplier) {

		try {
			parentId = parentIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long parentId;

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public void setTax(UnsafeSupplier<String, Exception> taxUnsafeSupplier) {
		try {
			tax = taxUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String tax;

	public TreeDepartment[] getTreeDepartments() {
		return treeDepartments;
	}

	public void setTreeDepartments(TreeDepartment[] treeDepartments) {
		this.treeDepartments = treeDepartments;
	}

	public void setTreeDepartments(
		UnsafeSupplier<TreeDepartment[], Exception>
			treeDepartmentsUnsafeSupplier) {

		try {
			treeDepartments = treeDepartmentsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected TreeDepartment[] treeDepartments;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setType(UnsafeSupplier<String, Exception> typeUnsafeSupplier) {
		try {
			type = typeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String type;

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public void setTypeName(
		UnsafeSupplier<String, Exception> typeNameUnsafeSupplier) {

		try {
			typeName = typeNameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String typeName;

	@Override
	public TreeDepartment clone() throws CloneNotSupportedException {
		return (TreeDepartment)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TreeDepartment)) {
			return false;
		}

		TreeDepartment treeDepartment = (TreeDepartment)object;

		return Objects.equals(toString(), treeDepartment.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return TreeDepartmentSerDes.toJSON(this);
	}

}