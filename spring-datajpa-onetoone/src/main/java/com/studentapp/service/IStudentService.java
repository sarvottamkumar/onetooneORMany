package com.studentapp.service;

import java.util.List;

import com.studentapp.model.Student;

public interface IStudentService {
	
	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(int studentId);
	Student getById(int studentId);
	List<Student> getAll();
	
	List<Student> getByDepartment(String department);
	List<Student> getByCity(String city);
	List<Student> getByCityAndDepartment(String city,String department);
	List<Student> getByCityState(String city, String state);
	 

}
