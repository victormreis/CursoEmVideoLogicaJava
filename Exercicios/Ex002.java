/*
 * Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual � o seu nome? Jo�o da Silva
Ol� Jo�o da Silva, � um prazer te conhecer
 */
package Exercicios;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String nome = "";
		
		System.out.print("Qual � o seu nome: ");
		nome = read.next();
		System.out.println("Ol� "+nome+" � um prazer te conhecer");
		read.close();
	}

}
