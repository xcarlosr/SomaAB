package com.s2ti.business;

import com.s2it.model.Soma;

/**
 * @author carlos.lima
 * @since 07/11/2018
 */
public class SomaBusinessImpl implements SomaBusiness {
	Long maxValor = 1000000L;
	
	@Override
	public void createValorC(Soma soma) throws Exception {
		if(soma.getValorA() != null && soma.getValorB() != null) {
			int maxValor = soma.getValorA().length() < soma.getValorB().length() ? 
					soma.getValorB().length() : soma.getValorA().length(); 
			for(int i = 0; i <= maxValor - 1; i++ ) {
				if(soma.getValorA().length() > i) {
					soma.setValorC(soma.getValorC() + soma.getValorA().substring(i, i+1));
				}
				if (soma.getValorB().length() > i) {
					soma.setValorC(soma.getValorC() + soma.getValorB().substring(i, i+1));
				}
			}
		}
	}

	@Override
	public Long validaValorC(Soma soma) throws Exception {
		return new Long(soma.getValorC()) > this.maxValor ? -1L : new Long(soma.getValorC());
	}
	
	
}
