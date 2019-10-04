package com.beanscope.beans;

public class Car {
	private int engineId;
	private String name;
	private String model;
	private String fualType;
	private int manufactoryYear;
	public int getEngineId() {
		return engineId;
	}
	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFualType() {
		return fualType;
	}
	public void setFualType(String fualType) {
		this.fualType = fualType;
	}
	public int getManufactoryYear() {
		return manufactoryYear;
	}
	public void setManufactoryYear(int manufactoryYear) {
		this.manufactoryYear = manufactoryYear;
	}
	@Override
	public String toString() {
		return "Car [engineId=" + engineId + ", name=" + name + ", model=" + model + ", fualType=" + fualType
				+ ", manufactoryYear=" + manufactoryYear + "]";
	}
	
	
}
