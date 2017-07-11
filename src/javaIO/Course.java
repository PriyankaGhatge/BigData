package javaIO;

import java.io.Serializable;
import java.util.List;

public class Course implements Serializable {
	
	String CrsName;
	
	List<Student> StdDetails;
	
	public String getCrsName() {
		return CrsName;
	}
	public void setCrsName(String crsName) {
		CrsName = crsName;
	}
	public List<Student> getStdDetails() {
		return StdDetails;
	}
	public void setStdDetails(List<Student> stdDetails) {
		StdDetails = stdDetails;
	}
	
}
