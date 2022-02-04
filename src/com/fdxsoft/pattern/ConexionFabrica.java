package com.fdxsoft.pattern;

import com.fdxsoft.pattern.imp.ConexionMSSQL;
import com.fdxsoft.pattern.imp.ConexionMySQL;
import com.fdxsoft.pattern.imp.ConexionOracle;
import com.fdxsoft.pattern.imp.ConexionPostgreSQL;

public class ConexionFabrica {
	public IConexion getConexion(String motor) throws Exception {
		if(motor==null) {
			throw new Exception("Tiene que especificar un motor de conexion!");
		}
		switch(motor.toUpperCase()) {
		case "MYSQL":
			return new ConexionMySQL();
		case "ORACLE":
			return new ConexionOracle();
		case "POSGRESQL":
			return new ConexionPostgreSQL();
		case "MSSQL":
			return new ConexionMSSQL();
		default:
			throw new Exception("*** Motor de Base de Datos '"+motor+"' es Invalido!");
		}
	}
}
