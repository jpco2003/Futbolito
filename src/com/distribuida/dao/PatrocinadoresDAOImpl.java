package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.distribuida.entities.Patrocinadores;

@Repository
public class PatrocinadoresDAOImpl implements PatrocinadoresDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Patrocinadores> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Patrocinadores",Patrocinadores.class).getResultList();
	}

	@Override
	@Transactional
	public Patrocinadores findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Patrocinadores.class,id);
	}

	@Override
	@Transactional
	public void add(Patrocinadores patrocinadores) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(patrocinadores);
	}

	@Override
	@Transactional
	public void up(Patrocinadores patrocinadores) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(patrocinadores);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(id);
	}

}
