package com.distribuida.principal;

import java.sql.DriverManager;

public class PruebaConexionDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Conexion="jdbc:mysql://localhost:3306/futbolproyecto";
		String user="root";
		String password="root";
		
		try {
			
			System.out.println("-------Estableciendo conexion--------");
			DriverManager.getConnection(Conexion,user,password);
			System.out.println("-------Conexion Establecida--------");

			
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
