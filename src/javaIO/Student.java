package javaIO;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String StdName;
	
	private int StdAge;

	public String getStdName() {
		return StdName;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	public int getStdAge() {
		return StdAge;
	}
	public void setStdAge(int stdAge) {
		StdAge = stdAge;
	}
}
