package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Directiva;

public interface DirectivaService {
	
	public List<Directiva> findAll();
	public Directiva findOne (int id);
	public void add (Directiva directiva);
	public void up (Directiva directiva);
	public void del(int id);
	
	public void add(int IdDirectiva,String Nombre, String Apellido, String Cargo, String Correo,String Telefono,String Direccion);
	public void up(int IdDirectiva,String Nombre, String Apellido, String Cargo, String Correo,String Telefono,String Direccion);
	
	public void imprimir (List <Directiva> directivas);
}
