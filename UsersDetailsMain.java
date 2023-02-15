package com.edubridge.Main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edubridge.Config.DBConfig;
import com.edubridge.Model.UsersDetails;

public class UsersDetailsMain {

	public  void addUsersDetails(UsersDetails u)
	{
		Session s=DBConfig.getSession();
		Transaction tx=s.beginTransaction();
		
		s.persist(u);
		tx.commit();

	}
	


}
