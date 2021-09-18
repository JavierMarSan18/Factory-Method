package org.formacion.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLavadora {

	LavadoraFabrica fabrica = new LavadoraFabrica();
	
	@Test
	public void test_carga_frontal() {
		//implementar factory method
		Lavadora lavadora = fabrica.getLavadora("frontal");
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {
		//implementar factory method
		Lavadora lavadora = fabrica.getLavadora("superior");
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
