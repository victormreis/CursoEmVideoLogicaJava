/*
 * Fa�a um programa que leia um n�mero inteiro e mostre o seu antecessor e seu 
sucessor.
Ex: 
Digite um n�mero: 9
O antecessor de 9 � 8
O sucessor de 9 � 10
 */
package Exercicios;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		int numero;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		numero = read.nextInt();
		System.out.println("O antecessor de " + numero +" � "+(numero -1));
		System.out.println("O sucessor de " + numero +" � "+(numero +1));
		read.close();
		

	}

}
