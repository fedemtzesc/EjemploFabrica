package com.fdxsoft.main;

import com.fdxsoft.pattern.ConexionFabrica;
import com.fdxsoft.pattern.IConexion;

public class App {
	public static void main(String[] args) {
		//Instanciamos primero la fabrica de conexiones
		ConexionFabrica cf = new ConexionFabrica();
		
		
		try {
			//Ahora le vamos solicitando cada uno de los tipos de conexion disponibles
			
			IConexion cx1 = cf.getConexion("MSSQL");
			cx1.conectar();
			cx1.desconectar();
			
			IConexion cx2 = cf.getConexion("MYSQL");
			cx2.conectar();
			cx2.desconectar();

			IConexion cx3 = cf.getConexion("posgresql");
			cx3.conectar();
			cx3.desconectar();
			
			IConexion cx4 = cf.getConexion("oRACLE");
			cx4.conectar();
			cx4.desconectar();
			/*
			IConexion cx5 = cf.getConexion(null);
			cx5.conectar();
			cx5.desconectar();
			 */
			IConexion cx6 = cf.getConexion("orata");
			cx6.conectar();
			cx6.desconectar();
		}catch(Exception e) {
			System.out.println("\n\n\tERROR:\n\t-----------------------------------------\n\t" + e.getMessage());
		}
	}
	
}
