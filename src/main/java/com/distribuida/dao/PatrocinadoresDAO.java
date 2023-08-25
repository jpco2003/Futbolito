package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Patrocinadores;

public interface PatrocinadoresDAO {
	public List<Patrocinadores> findAll();
	public Patrocinadores findOne(int id);
	public void add (Patrocinadores patrocinadores);
	public void up (Patrocinadores patrocinadores);
	public void del (int id);
	public void del (Patrocinadores patrocinadores);
}
