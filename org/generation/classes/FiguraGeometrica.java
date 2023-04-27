package org.generation.classes;

public class FiguraGeometrica {
	private String name;
	private double base;
	private double altura;
	private double lado;
	public FiguraGeometrica(String name, double base, double altura, double lado) {
		this.name = name;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}//constructor
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public String toString() {
		return "FiguraGeometrica [name=" + name + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}//toString
	
	
	
}
