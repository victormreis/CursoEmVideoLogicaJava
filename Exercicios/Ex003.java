/*
 *  Crie um programa que leia o nome e o salário de um funcionário, mostrando no 
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho
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
