package Metodo;

import java.util.Scanner;

public class Metodo1 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		//METODO A NO REQUIERE DATOS DE ENTRADA Y NO DEVUELVE VALOR 
		metodoA();
		// METODO B REQUIERE DATOS DE ENTRADA Y NO DEVUELVE VALOR
		metodoB(3.2, 5.0, 8);
		double a=9.3 , b=7.5;
		int c= 5;
		metodoB(a, b, c);
		System.out.print("a = ");
		a = lector.nextDouble();
		System.out.print("b = ");
		b = lector.nextDouble();
		System.out.print("c = ");
		c = lector.nextInt();
		metodoB(a, b, c);
		//METODO C NO REQUIERE DATOS DE ENTRADA Y DEVUELVE UN VALOR DOUBLE
		 double resultado = metodoC();
		 System.out.println("El resultado es = " + resultado);
		 System.out.println("El resultado es = " + metodoC());
		 //METODO D REQUIERE DATOS DE ENTRADA Y DEVUELVE UN VALOR DOUBLE
		 System.out.println("El resultado ahora es = " + metodoD(1.0, 2.0, 5.0, 9));
		 
		
		lector.close();
		

	}
          private static void metodoA() {
	int valorA = 7 , valorB = 8;
	System.out.println("La suma de " +valorA + " y " + valorB + " es " +(valorA+valorB));
	
	
	
}
          private static void metodoB(double varA, double varB, int varC) {
	double resultado = (varA + varB)/(1 + varC);
	System.out.println("El resultado es = " + resultado);
	
	
}
        private static double metodoC () {
        	double varDouble1 = 1.0, varDouble2 = 2.0, varInt1 = 5.0;
        	int  varInt2 = 9;
        	double  resultado = 1 + (varDouble1*varDouble2)-varInt1/varInt2;        			       			        			
        	return resultado;
        	
        }
        private static double metodoD (double varDouble1, double varDouble2, double varInt1, double varInt2) {    	
        	double  resultado = 1 + (varDouble1*varDouble2)-varInt1/varInt2;        			       			        			
        	return resultado;
        }
}
