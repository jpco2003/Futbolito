package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Patrocinadores;

public interface PatrocinadoresService {
	
	public List<Patrocinadores> findAll();
	public Patrocinadores findOne (int id);
	public void add (Patrocinadores patrocinadores);
	public void up (Patrocinadores patrocinadores);
	public void del(int id);
	
	public void add(int IdPatrocinadores,String Nombre,String Telefono,String Correo,String Pais, int idDirectiva);
	public void up(int IdPatrocinadores,String Nombre,String Telefono,String Correo,String Pais, int idDirectiva);
	
	public void imprimir (List <Patrocinadores> patrocinadoress);
}
