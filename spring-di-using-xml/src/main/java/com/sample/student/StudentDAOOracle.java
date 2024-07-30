package com.sample.student;

public class StudentDAOOracle implements StudentDAO {
	
	@Override
	public void addStudent() {
		System.out.println("Oracle: Student Record Inserted Successfully");
	}
}
