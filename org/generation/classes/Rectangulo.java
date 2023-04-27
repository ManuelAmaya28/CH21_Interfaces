package org.generation.classes;

import org.generation.util.Calculable;

public class Rectangulo extends FiguraGeometrica implements Calculable {

	public Rectangulo(String name, double base, double altura, double lado) {
		super(name, base, altura, lado);
	}//constructor

	@Override
	public double calcularArea() {
		
		return getBase()*getAltura();
	}

	@Override
	public double calcularPerimetro() {
		
		return (getBase()*2)+(getAltura()*2);
	}

	@Override
	public String toString() {
		return "Rectangulo [calcularArea()=" + calcularArea() + ", calcularPerimetro()=" + calcularPerimetro()
				+ ", getName()=" + getName() + ", getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}
	
	
	
	
	
	
	
	

}
