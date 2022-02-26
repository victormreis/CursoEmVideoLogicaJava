/*
 * Faça um programa que leia um número inteiro e mostre o seu antecessor e seu 
sucessor.
Ex: 
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
 */
package Exercicios;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		int numero;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um número: ");
		numero = read.nextInt();
		System.out.println("O antecessor de " + numero +" é "+(numero -1));
		System.out.println("O sucessor de " + numero +" é "+(numero +1));
		read.close();
		

	}

}
