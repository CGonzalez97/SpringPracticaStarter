package com.ntt_data_bootcamp.microservicios;

public class Saludo {
	
private String idioma;
	
	public Saludo(String idioma) {
		this.idioma = idioma;
	}
	
	
	public String mensajeSaludo() {
		String mensaje = "";
		switch (idioma) {
		case "Castellano":
			mensaje = "Hola";
			break;
		
		default:
			mensaje = "Hi all";
			break;
		}
		
		return mensaje;
	}

}
