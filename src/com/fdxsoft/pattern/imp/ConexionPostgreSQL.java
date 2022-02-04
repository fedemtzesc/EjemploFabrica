package com.fdxsoft.pattern.imp;

import com.fdxsoft.pattern.IConexion;

public class ConexionPostgreSQL extends ConexionPadre implements IConexion {
	public ConexionPostgreSQL() {
		this.host = "ElephantServer";
		this.puerto = "5432";
		this.usuario = "israsoft";
		this.password = "41414";
	}
	
	@Override
	public void conectar() {
		// TODO Aqui va todo el codigo JDBC
		System.out.println("Conectado a PostgreeSQL!");		
	}
	@Override
	public void desconectar() {
		// TODO Aqui va todo el codigo JDBC
		System.out.println("Desconectado de PostgreSQL!");		
	}	
}
