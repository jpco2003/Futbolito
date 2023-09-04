package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Formativa;

public interface FormativaDAO {

	public List<Formativa> findAll();
	public Formativa findOne(int id);
	public void add (Formativa formativa);
	void up (Formativa formativa);
	public void del (int id);
	public void del (Formativa formativa);
	
}