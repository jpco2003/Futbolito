package com.distribuida.principal;

import java.sql.DriverManager;

public class PruebaConexionDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Conexion="jdbc:mysql://192.168.4.199:3306/futbolproyecto"
				+ "";
		String user="Grupito";
		String password="Grupo963.";
		
		try {
			
			System.out.println("-------Estableciendo conexion--------");
			DriverManager.getConnection(Conexion,user,password);
			System.out.println("-------Conexion Establecida--------");

			
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
