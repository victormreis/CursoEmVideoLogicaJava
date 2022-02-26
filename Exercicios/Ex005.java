/*
 * Faça um programa que leia as duas notas de um aluno em uma matéria e mostre 
na tela a sua média na disciplina.
Ex: 
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
 */
package Exercicios;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		double n1,n2,media;
		Scanner read = new Scanner(System.in);
		System.out.println("Digite as notas da prova 1 e 2 para calcular a média!");
		System.out.print("Nota 1: ");
		n1 = read.nextDouble();
		System.out.print("Nota 2: ");
		n2 = read.nextDouble();
		media = (n1 + n2) /2 ;
		System.out.println("A média entre "+n1+" e "+n2+" é igual a "+media);
		read.close();
		

	}

}
