package com.spring.hibernate.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.hibernate.dao.HomeDao;
import com.spring.hibernate.model.Student;

@Repository
public class HomeDaoImpl implements HomeDao 
{
	
	@Autowired
	private SessionFactory sf;

	public void saveData(Student s)
	{
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	session.save(s);
    tx.commit();		
	session.close();	
	}

	public int loginCheck(String un, String ps) 
	{
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		
		String hql = "from Student where uname ='"+un+"' and password='"+ps+"'";
		
	    Query<Student>  query    =   session.createQuery(hql);
	          
	                 Student s   =   query.getSingleResult();
	       tx.commit();
	       session.close();
	       return 1;
	}

	@Override
	public List displayAllData() {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		String hql = "from Student";
		   Query<Student>  query=   session.createQuery(hql);
		   List      list=        query.getResultList();
		          tx.commit();
		           session.close();
		             return list;
	}

	@Override
	public Student editData(Student s) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Student st =  session.get(Student.class, s.getUid());
		       
		       tx.commit();
			    session.close();
			    return st;
	}

	@Override
	public void updateData(Student s) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		 Student st =  session.get(Student.class, s.getUid());
         st.setName(s.getName());
         st.setMobileno(s.getMobileno());
         st.setPassword(s.getPassword());
         st.setUname(s.getUname());
         session.update(st);
         tx.commit();
         session.close();
		
	}

	@Override
	public int deleteData(int uid) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		String hql ="delete from Student Where uid = '"+uid+"'";
		
		Query<Student>  query = session.createQuery(hql);
		  int i = query.executeUpdate();
		  tx.commit();
		    session.close();
		    return i;
	}

	
	
	
	
}
