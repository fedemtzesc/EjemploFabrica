package com.fdxsoft.pattern.imp;

//Con esta clase podemos heredar caracteristicas y 
//comportamientos comunes a las clases hijas que la 
//heredan
public class ConexionPadre {
	protected String host;
	protected String puerto;
	protected String usuario;
	protected String password;
	
	public String getParametros() {
		return "\n\tHOST: " + this.host + 
				"\n\tPUERTO: " + this.puerto +
				"\n\tUSER: " + this.usuario + 
				"\n\tPASSWD: " + this.password;
	}
}
