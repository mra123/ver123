package COCHES;

public class CocheEconomico extends Coche {

	public CocheEconomico(String conductor, String tipo, String color,
			Punto posicion) {
		super(conductor, tipo, color, posicion);
	}
	public void avanza (){
		if(Math.random()>=0.5)der20() ;
		else der25();
	}
	@Override
	public String toString() {
		return "CocheEconomico []" +super.toString();
	}
	

}
