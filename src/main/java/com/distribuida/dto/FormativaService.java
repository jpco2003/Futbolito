package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Formativa;

public interface FormativaService {
	
	public List<Formativa> findAll();
	public Formativa findOne (int id);
	public void add (Formativa formativa);
	public void up (Formativa formativa);
	public void del(int id);
	
	public void add(int IdFormativa,String Nombre, String Direccion, String Correo, String Telefono);
	public void up(int IdFormativa,String Nombre, String Direccion, String Correo, String Telefono);
	public void imprimir (List <Formativa> formativas);
	
}
