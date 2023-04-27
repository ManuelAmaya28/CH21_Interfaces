import org.generation.classes.Cuadrado;
import org.generation.classes.Rectangulo;
import org.generation.classes.Triangulo;
import org.generation.impresora.Impresora;


public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		
		Cuadrado c1 = new Cuadrado("Bob Esponja", 0, 0, 5);
		
		Rectangulo r1 = new Rectangulo("Campo Futbol", 100, 50, 0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas

		
		Impresora.imprimirCalculo(t1);
		Impresora.imprimirCalculo(t2);
		
		Impresora.imprimirCalculo(c1);
		
		Impresora.imprimirCalculo(r1);
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main
	
}//class testFiguras