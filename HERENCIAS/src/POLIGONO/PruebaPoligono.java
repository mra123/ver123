package POLIGONO;

public class PruebaPoligono {


	public static void main(String[] args) {
		
		Punto[] figura={new Punto(1,1),new Punto(1,2),new Punto(2,2),new Punto(2,1)};
		Poligono p1=new Poligono(figura);
		ColorPol olga=new ColorPol(figura,"Rosa");
		
		
		System.out.println(p1);
		System.out.println("El perímetro es "+p1.perimetro()+" metros cuadrados");
		p1.trasladar(2,2);
		System.out.println(p1);
		p1.escala(2,1);
		System.out.println(p1);
	}

}
