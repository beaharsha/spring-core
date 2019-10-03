package com.alias.beans;

public class Robot {
	
	private int id;
	private String name;
	private String type;
	
	public Robot(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
	

}
