package com.poc.home.client.dto.v1_0_0;

import com.poc.home.client.function.UnsafeSupplier;
import com.poc.home.client.serdes.v1_0_0.HomeSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author hoang
 * @generated
 */
@Generated("")
public class Home implements Cloneable, Serializable {

	public static Home toDTO(String json) {
		return HomeSerDes.toDTO(json);
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setColor(
		UnsafeSupplier<String, Exception> colorUnsafeSupplier) {

		try {
			color = colorUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String color;

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public void setFloor(
		UnsafeSupplier<Integer, Exception> floorUnsafeSupplier) {

		try {
			floor = floorUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer floor;

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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setOwner(
		UnsafeSupplier<String, Exception> ownerUnsafeSupplier) {

		try {
			owner = ownerUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String owner;

	public Integer getRoom() {
		return room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public void setRoom(UnsafeSupplier<Integer, Exception> roomUnsafeSupplier) {
		try {
			room = roomUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer room;

	public Float getSquare() {
		return square;
	}

	public void setSquare(Float square) {
		this.square = square;
	}

	public void setSquare(
		UnsafeSupplier<Float, Exception> squareUnsafeSupplier) {

		try {
			square = squareUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Float square;

	@Override
	public Home clone() throws CloneNotSupportedException {
		return (Home)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Home)) {
			return false;
		}

		Home home = (Home)object;

		return Objects.equals(toString(), home.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return HomeSerDes.toJSON(this);
	}

}