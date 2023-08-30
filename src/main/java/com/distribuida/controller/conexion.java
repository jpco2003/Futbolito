package com.distribuida.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ruta ="jdbc:mysql://localhost:3306/futbolproyecto";
		String user ="root";
		String pass ="root";
		
		try {
			System.out.println("Estableciendo conexion");
			Connection conex = DriverManager.getConnection(ruta,user,pass);
			System.out.println("Conexion establecida");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
