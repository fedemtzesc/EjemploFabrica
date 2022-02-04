package com.fdxsoft.pattern.imp;

import com.fdxsoft.pattern.IConexion;

public class ConexionMSSQL extends ConexionPadre implements IConexion {
	public ConexionMSSQL() {
		this.host = "SQLServer";
		this.puerto = "1433";
		this.usuario = "sa";
		this.password = "1001001";
	}
	
	@Override
	public void conectar() {
		// TODO Aqui va todo el codigo JDBC
		System.out.println("Conectado a MS SQL Server!");		
	}
	@Override
	public void desconectar() {
		// TODO Aqui va todo el codigo JDBC
		System.out.println("Desconectado de MS SQL Server!");		
	}	
}
