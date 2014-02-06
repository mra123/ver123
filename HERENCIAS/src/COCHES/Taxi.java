package COCHES;

public class Taxi extends Coche {
	
	private int plazas;
	public Taxi(String conductor, String tipo, Punto posicion) {
		super(conductor, tipo, "blanco", posicion);
		this.plazas=0;
	}
	public void avanza (){
		if(Math.random()>=0.7)der15() ;
		else der35();
	}
	public Taxi() {
		
	}
	@Override
	public String toString() {
		return "Taxi [plazas=" + plazas + "]" +super.toString();
	}	
	
	
	
	
}
