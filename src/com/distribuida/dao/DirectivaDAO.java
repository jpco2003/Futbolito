package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Directiva;

public interface DirectivaDAO {

	public List<Directiva> findAll();
	public Directiva findOne(int id);
	public void add (Directiva directiva);
	public void up (Directiva directiva);
	public void del (int id);
}