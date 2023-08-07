package com.spring.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;

import com.spring.hibernate.model.Student;
import com.spring.hibernate.service.HomeService;


@Controller
public class HomeController 
{
	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String preogin()
	{
		return "login";
	}
	
	@RequestMapping("/registration")
	public String preReg()
	{
		return "registration";
	}
	
	@RequestMapping("/reg")
	public String regData(@ModelAttribute Student s)
	{
	
		hs.saveData(s);
		
		return "login";
	}

	@RequestMapping("/login")
	public String loginCheck(@RequestParam("uname") String un,@RequestParam("password") String ps,Model m)
	{
		int i = hs.loginCheck(un,ps);
       
	   List li = hs.displyAllData();
       m.addAttribute("data", li);
      
	       return "success";
        }
	
	  @RequestMapping("/edit")
		public String editData(@ModelAttribute Student s,Model m)
		{
			  Student stud = hs.editData(s);
			  m.addAttribute("data",stud);
			     return "edit";
		}
	
	
	
	  @RequestMapping("/update")
	  public String updateData(@ModelAttribute Student s,Model m)
	  {
		    hs.updateData(s);
			 List li= hs.displyAllData();
	         m.addAttribute("data", li);
		   
		return "success";
		   
	  }
	  
	  @RequestMapping("/delete")
		public String deleteData(@RequestParam("uid") int uid,Model m)
		{
			int i =hs.deleteData(uid);
			
			 List li= hs.displyAllData();
	         m.addAttribute("data", li);
	         
			 return "success";
		}
	}

