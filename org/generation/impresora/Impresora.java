package org.generation.impresora;


import org.generation.util.Calculable;

public class Impresora {
	public static void imprimirCalculo(Calculable t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de [" + t.getName() + "] es: " + t.calcularArea() + "\n" + "|El perímetro de ["
				+ t.getName() + "] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}// imprimirCalculo
}// class Impresora