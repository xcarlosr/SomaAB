package com.s2ti.business;

import com.s2it.model.Soma;

/**
 * @author carlos.lima
 * @since 07/11/2018
 */
public interface SomaBusiness {
	
	public void createValorC(Soma soma) throws Exception;
	
	public Long validaValorC(Soma soma) throws Exception;

}
