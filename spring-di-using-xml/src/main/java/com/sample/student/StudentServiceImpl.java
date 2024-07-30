package com.sample.student;

public class StudentServiceImpl {
	
	private StudentDAO studentDao;
	
	
	public StudentServiceImpl() {
		super();
	}

	public StudentServiceImpl(StudentDAO studentDao) {
		super();
		this.studentDao = studentDao;
	}

	public void addRecord() {
		studentDao.addStudent();
	}

	public StudentDAO getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public String toString() {
		return "StudentServiceImpl [studentDao=" + studentDao + "]";
	}
	
	
}
