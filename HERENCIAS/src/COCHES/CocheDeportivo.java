package COCHES;

public class CocheDeportivo extends Coche {

	public CocheDeportivo(String conductor, String tipo, String color,
			Punto posicion) {
		super(conductor, tipo, color, new Punto(0,200));
	}
	public void avanza (){
		if(Math.random()>=0.7)der50() ;
		else der30();
	}
	@Override
	public String toString() {
		return "CocheDeportivo []" +super.toString();
	}
	
}
