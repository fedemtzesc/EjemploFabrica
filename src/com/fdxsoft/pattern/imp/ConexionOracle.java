package com.fdxsoft.pattern.imp;

import com.fdxsoft.pattern.IConexion;

public class ConexionOracle extends ConexionPadre implements IConexion {
	public ConexionOracle() {
		this.host = "ORACLEServer";
		this.puerto = "1521";
		this.usuario = "ivannarizon";
		this.password = "6941";
	}
	
	@Override
	public void conectar() {
		// TODO Aqui va todo el codigo JDBC
		System.out.println("Conectado a Oracle!");		
	}
	@Override
	public void desconectar() {
		// TODO Aqui va todo el codigo JDBC
		System.out.println("Desconectado de Oracle!");		
	}	
}
