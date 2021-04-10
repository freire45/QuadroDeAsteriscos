package br.com.erickfreire.quadrodeasteriscos;

import java.util.Scanner;

/**
 * Programa em Java que desenha um quadrado de asteriscos de acordo com o valor digitado pelo usuário
 * @author Erick Freire
 * @version 1 - Criado em 10-04-2021 as 17:58
 */

public class QuadroDeAsteriscos {
	public static void main(String[] args) {
		int numero = 0;
		int contador = 1;
		int contador2 = 1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que desenha um quadrado");
		
		System.out.print("Informe o tamanho do quadrado: ");
		numero = entrada.nextInt();
		
		while(numero < 1){
			System.out.print("O valor deve ser positivo maior do que 0, digite novamente: ");
			numero = entrada.nextInt();
		}
		System.out.println();
		while(contador <= numero){
			 
			while(contador2 <= numero) {
				System.out.print("*");
				contador2++;
			}
			
            contador2 = 1;
			System.out.println();
			contador++;
		}
	}

}
