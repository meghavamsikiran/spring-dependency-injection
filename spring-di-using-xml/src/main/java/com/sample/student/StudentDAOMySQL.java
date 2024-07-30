package com.sample.student;

public class StudentDAOMySQL implements StudentDAO{

	@Override
	public void addStudent() {
		System.out.println("MySQL: Student Record Inserted Successfully");
	}

}
