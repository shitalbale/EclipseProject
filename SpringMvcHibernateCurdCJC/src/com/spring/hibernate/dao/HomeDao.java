package com.spring.hibernate.dao;

import java.util.List;

import com.spring.hibernate.model.Student;

public interface HomeDao 
{

	public void saveData(Student s);
	public int loginCheck(String uname,String password);
	public List displayAllData();
	
	public Student editData(Student s);
	
	public void updateData(Student s);
	
	public int deleteData(int uid);
}

