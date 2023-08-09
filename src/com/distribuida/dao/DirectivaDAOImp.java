package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.distribuida.entities.Directiva;

@Repository
public class DirectivaDAOImp implements DirectivaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Directiva> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Directiva",Directiva.class).getResultList();
	}

	@Override
	@Transactional
	public Directiva findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Directiva.class,id);
	}

	@Override
	@Transactional
	public void add(Directiva directiva) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(directiva);
	}

	@Override
	@Transactional
	public void up(Directiva directiva) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(directiva);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(id);
	}

	@Override
	public void del(Directiva directiva) {
		// TODO Auto-generated method stub
		
	}


}
