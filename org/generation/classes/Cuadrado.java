package org.generation.classes;

import org.generation.util.Calculable;

public class Cuadrado extends FiguraGeometrica implements Calculable{

	public Cuadrado(String name, double base, double altura, double lado) {
		super(name, base, altura, lado);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public double calcularArea() {
		return getLado()*getLado();
	}

	@Override
	public double calcularPerimetro() {
		return getLado()*4;
	}


	@Override
	public String toString() {
		return "Cuadrado [calcularArea()=" + calcularArea() + ", calcularPerimetro()=" + calcularPerimetro()
				+ ", getName()=" + getName() + ", getLado()=" + getLado() + "]";
	}

	


	
	
}//class Cuadrado
