package com.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.model.Student;
import com.studentapp.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	IStudentRepository studentRepository;

	@Override
	public void addStudent(Student student) {
		
		studentRepository.save(student);
		
		
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);
		
	}

	@Override
	public Student getById(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getByDepartment(String department) {
		
		return studentRepository.findStudsByDept(department);
	}

	@Override
	public List<Student> getByCity(String city) {
		// TODO Auto-generated method stub
		return studentRepository.findStudsByCity(city);
	}

	@Override
	public List<Student> getByCityAndDepartment(String city, String department) {
		// TODO Auto-generated method stub
		return studentRepository.findByCityDept(city, department);
	}

	@Override
	public List<Student> getByCityState(String city, String state) {
		// TODO Auto-generated method stub
		return studentRepository.findByCityState(city, state);
	}

}
