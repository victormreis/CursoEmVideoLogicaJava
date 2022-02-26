/*
 *  Desenvolva um programa que leia uma distância em metros e mostre os valores 
relativos em outras medidas.
Ex: 
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km 
1.8572Hm 
18.572Dam
1857.2dm  
18572.0cm  
185720.0mm 

 */
package Exercicios;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		double metros;
		Scanner read = new Scanner(System.in);
		System.out.println("Digite uma distância em metros: ");
		metros = read.nextDouble();
		System.out.println("A distancia de "+metros+" Corresponde a: ");
		System.out.println((metros/1000) + " Km");
		System.out.println((metros/100) + " Hm");
		System.out.println((metros/10) + " Dam");
		System.out.println((metros*10) + " Dm");
		System.out.println((metros*100) + " Cm");
		System.out.println((metros*1000) + " mm");
		read.close();
		

	}

}
