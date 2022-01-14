package com.poc.home.rest.client.dto.v1_0_0;

import com.poc.home.rest.client.function.UnsafeSupplier;
import com.poc.home.rest.client.serdes.v1_0_0.ErrorSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author hoang
 * @generated
 */
@Generated("")
public class Error implements Cloneable, Serializable {

	public static Error toDTO(String json) {
		return ErrorSerDes.toDTO(json);
	}

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

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	public void setDeveloperMessage(
		UnsafeSupplier<String, Exception> developerMessageUnsafeSupplier) {

		try {
			developerMessage = developerMessageUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String developerMessage;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setMessage(
		UnsafeSupplier<String, Exception> messageUnsafeSupplier) {

		try {
			message = messageUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String message;

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public void setStatus(
		UnsafeSupplier<Long, Exception> statusUnsafeSupplier) {

		try {
			status = statusUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long status;

	@Override
	public Error clone() throws CloneNotSupportedException {
		return (Error)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Error)) {
			return false;
		}

		Error error = (Error)object;

		return Objects.equals(toString(), error.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ErrorSerDes.toJSON(this);
	}

}