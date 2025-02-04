package com.br.fluxo.execption;

public class ParametrosInvalidosException extends Exception {

	private String menssage;
	
	public ParametrosInvalidosException(String menssage) {
		super("O segundo parâmetro deve ser maior que o primeiro " + menssage);
		this.menssage = menssage;
	}
	
}
	