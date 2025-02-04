package com.br.fluxo;

import java.util.Scanner;

import com.br.fluxo.execption.ParametrosInvalidosException;


public class app {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.err.println(exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		if(parametroUm > parametroDois) {
	        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for(int i = 0; i <= contagem; i++) {
			System.out.println("Imprimindo o numero: " + i);
		}
	}	
}	
	
	
	
	
	
	
	
	
	
