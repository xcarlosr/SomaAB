package com.s2ti.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.s2it.model.Soma;
import com.s2ti.business.SomaBusiness;
import com.s2ti.business.SomaBusinessImpl;

/**
 * Classe resposável em testar o valorC
 * 
 * @author carlos.lima
 * @since 07/11/2018	
 */
public class SomaBusinessTest {
	SomaBusiness somaBusiness = new SomaBusinessImpl();
	Soma soma1 = new Soma();
	Soma soma2 = new Soma();

	@Before
	public void setUp() throws Exception {
		soma1.setValorA("2345");
		soma1.setValorB("78");
		soma2.setValorA("2345");
		soma2.setValorB("7896599");
		somaBusiness.createValorC(soma1);
		somaBusiness.createValorC(soma2);
	}

	@Test
	public void testSoma1() throws Exception {
		Long valueExpected = 273845L;
		assertEquals(valueExpected, somaBusiness.validaValorC(this.soma1));
	}
	
	@Test
	public void testSoma2() throws Exception {
		Long valueExpected = -1L;
		assertEquals(valueExpected, somaBusiness.validaValorC(this.soma2));
	}

}
