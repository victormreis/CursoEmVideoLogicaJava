/*
 *  Desenvolva um algoritmo que leia dois n�meros inteiros e mostre o somat�rio 
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 � igual a 13.
 */
package Exercicios;

import java.util.Scanner;

public class Ex004 {
	public static void main(String[] args) {
		
		int n1,n2, tot;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		n1=read.nextInt();
		System.out.print("Digite outro valor: ");
		n2=read.nextInt();		
		tot = n1 +n2;
		System.out.print("A soma entre "+n1+" "+n2+" � igual a "+tot);
		read.close();
		
	}
	
}
