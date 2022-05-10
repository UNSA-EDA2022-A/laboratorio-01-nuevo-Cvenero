package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {

		int salto = 50;
		int cont = 1;
		for (int i = 0; i < 7; i++) {
			if (salto <= a[i]) {
				if (salto == a[6]) {
					break;
				}
				salto = 50;
				salto += a[i - 1];
				i--;
				cont++;
			}

		}
		return cont;
	}
}
