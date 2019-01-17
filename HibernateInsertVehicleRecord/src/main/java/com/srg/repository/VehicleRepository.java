package com.srg.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.srg.entities.VehicleEntity;
import com.srg.utils.HibernateUtil;

public class VehicleRepository {
	
	public void save(VehicleEntity vehicle) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();

	}
}
