package com.spring.hibernate.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernate.dao.HomeDao;
import com.spring.hibernate.model.Student;
import com.spring.hibernate.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeDao hd;
	
	
	public void saveData(Student s)
	{
		
		hd.saveData(s);
	}


	public int loginCheck(String uname, String password) {
		
		return hd.loginCheck(uname,password);
	}


	@Override
	public List displyAllData() {
		return hd.displayAllData();
		
	}


	@Override
	public int deleteData(int uid) {
		return hd.deleteData(uid);
	}


	@Override
	public Student editData(Student s) {
		 return hd.editData(s);
	}


	@Override
	public void updateData(Student s) {
		  hd.updateData(s);
		
	}

}
