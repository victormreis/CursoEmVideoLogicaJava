/*
 *  Crie um algoritmo que leia um n�mero real e mostre na tela o seu dobro e a 
sua ter�a parte.
Ex: 
Digite um n�mero: 3.5
O dobro de 3.5 � 7.0
A ter�a parte de 3.5 � 1.16666
 */
package Exercicios;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		
		double num;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		num = read.nextDouble();
		System.out.println("O dobro de "+num+" � "+(num *2));
		System.out.println("A ter�a parte de "+num+" � "+(num /3));
		
		
		read.close();
		

	}

}
