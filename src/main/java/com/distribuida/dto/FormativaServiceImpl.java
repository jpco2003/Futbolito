package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.FormativaDAO;
import com.distribuida.entities.Formativa;

@Service
public class FormativaServiceImpl implements FormativaService{
	
	@Autowired
	private FormativaDAO formativaDAO;
	
	@Override
	public List<Formativa> findAll() {
		// TODO Auto-generated method stub
		return formativaDAO.findAll();
	}

	@Override
	public Formativa findOne(int id) {
		// TODO Auto-generated method stub
		return formativaDAO.findOne(id);
	}

	@Override
	public void add(Formativa formativa) {
		// TODO Auto-generated method stub
		formativaDAO.add(formativa);
		
	}

	@Override
	public void up(Formativa formativa) {
		// TODO Auto-generated method stub
		formativaDAO.up(formativa);
		
	}

	@Override
	public void del(int id) {
		
		formativaDAO.del(findOne(id));
	}


	@Override
	public void add(int IdFormativa,String Nombre, String Direccion, String Correo,String Telefono,String Logo) {
		// TODO Auto-generated method stub
		Formativa formativa = new Formativa(IdFormativa, Nombre, Direccion, Correo, Telefono, Logo);

		formativaDAO.add(formativa);
		
		
	}

	@Override
	public void up(int IdFormativa,String Nombre, String Direccion, String Correo,String Telefono,String Logo) {
		// TODO Auto-generated method stub
		Formativa formativa = new Formativa(IdFormativa, Nombre, Direccion, Correo, Telefono, Logo);

		formativaDAO.up(formativa);
		
		
	}
	@Override
	public void imprimir(List<Formativa> formativas) {
		// TODO Auto-generated method stub
		formativas.forEach(item ->{
			System.out.println (item);
		});
		
	}


}
