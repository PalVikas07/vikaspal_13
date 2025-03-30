package com.ty.student.controller;

import com.ty.student.dao.Student_Dao;
import com.ty.student.dto.Student;

public class Student_Controller {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(102);
		student.setName("Vikas");
		student.setMno(87878787);
		student.setAddress("thane");

		Student_Dao dao = new Student_Dao();
//	dao.saveStudent(student);
		// dao.updateStudent(student);
		// dao.findStudent(101);
		dao.deleteStudent(102);
	}
}
