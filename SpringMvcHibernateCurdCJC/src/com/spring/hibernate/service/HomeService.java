package com.spring.hibernate.service;

import java.util.List;

import com.spring.hibernate.model.Student;
public interface HomeService 
{

	public void saveData(Student s);
	public int loginCheck(String uname,String password);
	
	public List displyAllData();

	public int deleteData(int uid);

	public Student editData(Student s);

	public void updateData(Student s);

	
}
