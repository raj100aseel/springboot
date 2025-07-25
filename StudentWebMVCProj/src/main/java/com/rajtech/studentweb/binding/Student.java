package com.rajtech.studentweb.binding;

import lombok.Data;

@Data
public class Student {
	private Integer studentId;
	private String studentName;
	private String studentEmail;
	private String studentGender;
	private String course;
	private String[] preferredTimings;
	
}
