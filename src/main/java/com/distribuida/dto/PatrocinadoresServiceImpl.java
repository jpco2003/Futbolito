package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.PatrocinadoresDAO;
import com.distribuida.dao.DirectivaDAO;
import com.distribuida.entities.Patrocinadores;
import com.distribuida.entities.Directiva;

@Service
public class PatrocinadoresServiceImpl implements PatrocinadoresService{
	
	@Autowired
	private PatrocinadoresDAO patrocinadoresDAO;
	
	@Autowired
	private DirectivaDAO directivaDAO;
	
	
	@Override
	public List<Patrocinadores> findAll() {
		// TODO Auto-generated method stub
		return patrocinadoresDAO.findAll();
	}

	@Override
	public Patrocinadores findOne(int id) {
		// TODO Auto-generated method stub
		return patrocinadoresDAO.findOne(id);
	}

	@Override
	public void add(Patrocinadores Patrocinadores) {
		// TODO Auto-generated method stub
		patrocinadoresDAO.add(Patrocinadores);
		
	}

	@Override
	public void up(Patrocinadores Patrocinadores) {
		// TODO Auto-generated method stub
		patrocinadoresDAO.up(Patrocinadores);
		
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		patrocinadoresDAO.del(findOne(id));
		
	}

	@Override
	public void add (int IdPatrocinadores,String Nombre,String Telefono,String Correo, String Pais, int idDirectiva) {
		// TODO Auto-generated method stub
		Directiva directiva = directivaDAO.findOne(idDirectiva);
	
		
		Patrocinadores patrocinadores = new Patrocinadores(IdPatrocinadores, Nombre, Telefono, Correo, Pais);

		patrocinadores.setDirectiva(directiva);
		
		patrocinadoresDAO.add(patrocinadores);
		
		
	}

	@Override
	public void up (int IdPatrocinadores,String Nombre,String Telefono,String Correo, String Pais, int idDirectiva) {
		// TODO Auto-generated method stub
		Directiva directiva = directivaDAO.findOne(idDirectiva);
	
		
		Patrocinadores patrocinadores = new Patrocinadores(IdPatrocinadores, Nombre, Telefono, Correo, Pais);

		patrocinadores.setDirectiva(directiva);
		
		patrocinadoresDAO.up(patrocinadores);
		
		
	}
	@Override
	public void imprimir(List<Patrocinadores> Patrocinadoress) {
		// TODO Auto-generated method stub
		Patrocinadoress.forEach(item ->{
			System.out.println (item);
		});
		
	}


}
