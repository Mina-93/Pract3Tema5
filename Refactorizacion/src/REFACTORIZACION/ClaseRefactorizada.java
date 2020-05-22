package REFACTORIZACION;

import java.util.Scanner;

public class ClaseRefactorizada {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int valor;
		int posicion;
		
		int[] ar = new int[10];
		
		rellenarArray(ar);
		escribirArray(ar);
		
		System.out.println("\nIntroduzca una posicion de un array");
		posicion = sc.nextInt();
		
		while (posicion < 0 || posicion > ar.length-1) {
			System.out.println("La posicion debe entre cero y nueve");
			posicion = sc.nextInt();
		}
		
		System.out.println("Introduzca un valor para esa posicion");
		valor = sc.nextInt();
		
		sc.close();
		
		cambiarNumero(ar, posicion, valor);
		
		
	}

	public static void cambiarNumero(int[] ar, int posicion, int valor) {
		for (int i = posicion; i < ar.length - 1; i++) {
			int x = ar[i+1];
			ar[i+1] = ar[posicion];
			ar[posicion] = x;
		}
		
		ar[posicion] = valor;
		
		escribirArray(ar);
	}

	public static void escribirArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	public static void rellenarArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i+1;
		}
	}

	
	

}
