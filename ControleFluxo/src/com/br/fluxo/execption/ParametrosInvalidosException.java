package com.br.fluxo.execption;

public class ParametrosInvalidosException extends Exception {

	private String menssage;
	
	public ParametrosInvalidosException(String menssage) {
		super(menssage);
		this.menssage = menssage;
	}
	
}
	