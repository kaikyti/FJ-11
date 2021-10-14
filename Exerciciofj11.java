package com.kaiky.cursojava.aulafj11;

import java.util.Scanner;

public class Exerciciofj11 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello, People");
		
		System.out.println("Entre com seu nome completo:");
		String nomeCompleto = scan.next();
		System.out.println("Seu nome completo é " + nomeCompleto);
		
		System.out.println("Entre com a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade é " + idade);
		
		
		
	}

}
