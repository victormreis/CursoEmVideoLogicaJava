/*
 *  Crie um programa que leia o nome e o sal�rio de um funcion�rio, mostrando no 
final uma mensagem.
Ex:
Nome do Funcion�rio: Maria do Carmo
Sal�rio: 1850,45
O funcion�rio Maria do Carmo tem um sal�rio de R$1850,45 em Junho
 */
package Exercicios;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		
		String nome;
		double salario;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Nome do(a) funcionario: ");
		nome = read.nextLine();
		System.out.print("Salario: ");		
		salario = read.nextDouble();
		System.out.println("O funcionario(a) "+nome+ " tem um salario de R$ " +salario + " em Fevereiro");
		read.close();
	}
	

}
