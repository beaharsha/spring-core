package com.collectionmerge.beans;

import java.util.List;

public class Course {
	List<String> subjects = null;

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Course [subjects=" + subjects + "]";
	}
	
	

}
