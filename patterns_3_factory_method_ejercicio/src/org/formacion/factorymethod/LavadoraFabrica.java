package org.formacion.factorymethod;

public class LavadoraFabrica {
	
	public Lavadora getLavadora(String tipo) {
		
		if(tipo == "frontal") {
			return new LavadoraCargaFrontal();
		}
		else if(tipo == "superior") {
			return new LavadoraCargaSuperior();
		}
		else {
			return null;
		}
	}
}
