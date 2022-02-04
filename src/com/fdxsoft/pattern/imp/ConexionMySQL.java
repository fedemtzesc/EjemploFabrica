package com.fdxsoft.pattern.imp;

import com.fdxsoft.pattern.IConexion;

public class ConexionMySQL extends ConexionPadre implements IConexion {
	public ConexionMySQL() {
		this.host = "MySQLServer";
		this.puerto = "3306";
		this.usuario = "fdxsoft";
		this.password = "212112";
	}
	
	@Override
	public void conectar() {
		// TODO Aqui va todo el codigo JDBC
		System.out.println("Conectado a MySQL!");		
	}
	@Override
	public void desconectar() {
		// TODO Aqui va todo el codigo JDBC
		System.out.println("Desconectado de MySQL!");		
	}	
}
