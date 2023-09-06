package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.distribuida.dao.FormativaDAO;
import com.distribuida.dao.DirectivaDAO;
import com.distribuida.entities.Directiva;
import com.distribuida.entities.Formativa;

@Service
public class DirectivaServiceImpl implements DirectivaService{
	
	@Autowired
	private DirectivaDAO directivaDAO;
	
	@Autowired
	private FormativaDAO formativaDAO;
	
	
	@Override
	public List<Directiva> findAll() {
		// TODO Auto-generated method stub
		return directivaDAO.findAll();
	}

	@Override
	public Directiva findOne(int id) {
		// TODO Auto-generated method stub
		return directivaDAO.findOne(id);
	}

	@Override
	public void add(Directiva Directiva) {
		// TODO Auto-generated method stub
		directivaDAO.add(Directiva);
		
	}

	@Override
	public void up(Directiva Directiva) {
		// TODO Auto-generated method stub
		directivaDAO.up(Directiva);
		
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		directivaDAO.del(findOne(id));
		
	}

	@Override
	public void add(int IdDirectiva,String Nombre, String Apellido, String Cargo, String Correo,String Telefono,String Direccion, int idFormativa) {
		// TODO Auto-generated method stub
		Formativa formativa = formativaDAO.findOne(idFormativa);
	
		
		Directiva directiva = new Directiva(IdDirectiva, Nombre, Apellido, Cargo, Correo, Telefono, Direccion);

		directiva.setFormativa(formativa);
		
		directivaDAO.add(directiva);
		
		
	}

	@Override
	public void up(int IdDirectiva,String Nombre, String Apellido, String Cargo, String Correo,String Telefono,String Direccion, int idFormativa) {
		// TODO Auto-generated method stub
		Formativa formativa = formativaDAO.findOne(idFormativa);
	
		
		Directiva directiva = new Directiva(IdDirectiva, Nombre, Apellido, Cargo, Correo, Telefono, Direccion);

		directiva.setFormativa(formativa);
		
		directivaDAO.up(directiva);
		
		
	}
	@Override
	public void imprimir(List<Directiva> directivas) {
		// TODO Auto-generated method stub
		directivas.forEach(item ->{
			System.out.println (item);
		});
		
	}
	


	@Override
	public List<Formativa> findAllF() {
		// TODO Auto-generated method stub
		return formativaDAO.findAll();
	}


}
