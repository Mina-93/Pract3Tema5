package REFACTORIZACION;

import java.util.Scanner;

public class ClaseNoRefactorizada {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] ar = new int[10];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i+1;
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		System.out.println("\nIntroduzca una posicion de un array");
		int posicion = sc.nextInt();
		
		while (posicion < 0 || posicion > ar.length-1) {
			System.out.println("La posicion debe entre cero y nueve");
			posicion = sc.nextInt();
		}
		
		System.out.println("Introduzca un valor para esa posicion");
		int valor =  sc.nextInt();
		
		sc.close();
		
		for (int i = posicion; i < ar.length - 1; i++) {
			int x = ar[i+1];
			ar[i+1] = ar[posicion];
			ar[posicion] = x;
		}
		
		ar[posicion] = valor;
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		
	}

	
}
