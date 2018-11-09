package com.s2it.run;

import com.s2it.model.Soma;
import com.s2ti.business.SomaBusiness;
import com.s2ti.business.SomaBusinessImpl;

/**
* Classe de exemplo para criar o valorC
* 
* @author carlos.lima
* @since 07/11/2018	
*/
public class RunApplication {
	
	public static void main(String[] args) throws Exception {
		SomaBusiness somaBusiness = new SomaBusinessImpl();
		Soma soma1 = new Soma();
		soma1.setValorA("2345");
		soma1.setValorB("78");
		
		Soma soma2 = new Soma();
		soma2.setValorA("2345");
		soma2.setValorB("7896599");

		somaBusiness.createValorC(soma1);
		somaBusiness.createValorC(soma2);
		
		System.out.println("Valor de C, soma1: " + somaBusiness.validaValorC(soma1));
		System.out.println("Valor de C, soma2: " + somaBusiness.validaValorC(soma2));
	}

}
