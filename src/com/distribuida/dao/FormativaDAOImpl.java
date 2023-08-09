package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.distribuida.entities.Formativa;

@Repository
public class FormativaDAOImpl implements FormativaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Formativa> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Formativa",Formativa.class).getResultList();
	}

	@Override
	@Transactional
	public Formativa findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Formativa.class,id);
	}

	@Override
	@Transactional
	public void add(Formativa formativa) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(formativa);
	}

	@Override
	@Transactional
	public void up(Formativa formativa) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(formativa);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(id);
	}

	@Override
	public void del(Formativa formativa) {
		// TODO Auto-generated method stub
		
	}

	

}
