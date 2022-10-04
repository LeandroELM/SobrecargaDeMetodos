package Metodo;

import java.util.Scanner;

public class SobrecargaDeMetodos {
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Calcule el area lateral de un prisma");
		System.out.println("Que datos conoce?");
		System.out.println("0- No conoce ningun dato");
		System.out.println("1- Cantidad de lados");
		System.out.println("2- Cantidad de lados y longitud de los lados");
		System.out.println("3- Cantidad de lados, longitud de los lados, altura");
		System.out.println("4- Salir");
		int op = lector.nextInt();
		
		switch(op) {
		case 0: {
			System.out.println("El area lateral del prisma es " + calcularAreaLeteralPrisma());
			break;
		}
		case 1:{
			System.out.println("Ingrese n = ");
			n = lector.nextInt();
			System.out.println("El area lateral del prismas es " + calcularAreaLeteralPrisma());
			
		}
		}
		
		System.out.println("El area lateral del prisma es "+ calcularAreaLeteralPrisma());
		System.out.println("El area lateral del prisma es "+ calcularAreaLeteralPrisma(5));
		System.out.println("El area lateral del prisma es "+ calcularAreaLeteralPrisma(5,6.1));
		System.out.println("El area lateral del prisma es "+ calcularAreaLeteralPrisma(5,6.1,11.2));
		


	}
	private static double calcularAreaLeteralPrisma() {
		double  l ,h , areaLateral;
		int n;
		System.out.println("Ingrese n = ");
		n = lector.nextInt();
		System.out.println("Ingrese l = ");
		l = lector.nextDouble();
		System.out.println("Ingrese h = ");
		h = lector.nextDouble();
		areaLateral= n * l * h;
		
		return areaLateral;
		
		
	}
	private static double calcularAreaLeteralPrisma(int n) {
		double  l ,h , areaLateral;
		System.out.println("Ingrese l = ");
		l = lector.nextDouble();
		System.out.println("Ingrese h = ");
		h = lector.nextDouble();
		areaLateral= n * l * h;
		
		return areaLateral;
		
		
	}
	private static double calcularAreaLeteralPrisma(int n, double l) {
		double  h , areaLateral;
		System.out.println("Ingrese h = ");
		h = lector.nextDouble();
		areaLateral= n * l * h;
		
		return areaLateral;
		
		
	}
	private static double calcularAreaLeteralPrisma(int n, double l, double h) {
		double areaLateral;
		areaLateral= n * l * h;
		
		return areaLateral;
	}
}
