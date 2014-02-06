package COCHES;

public class Coche {
	
	private String conductor,tipo,color;
	private Punto posicion;
	
	public String getConductor() {
		return conductor;
	}
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Punto getPosicion() {
		return posicion;
	}
	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}
	
	
	@Override
	public String toString() {
		return "Coche [conductor=" + conductor + ", tipo=" + tipo + ", color="
				+ color+" " +posicion.toString()+ "]";
			
	}

	public Coche() {
		
	}	
	public Coche(String conductor, String tipo, String color, Punto posicion) {
		super();
		this.conductor = conductor;
		this.tipo = tipo;
		this.color = color;
		this.posicion = posicion;
	}	
	public double der50 (){
		posicion.setX(posicion.getX()+50); 
		return posicion.getX();
	}
	public double der30 (){
		posicion.setX(posicion.getX()+30); 
		return posicion.getX();
	}
	public double der20 (){
		posicion.setX(posicion.getX()+20); 
		return posicion.getX();
	}
	public double der25 (){
		posicion.setX(posicion.getX()+25); 
		return posicion.getX();
	}
	public double der15 (){
		posicion.setX(posicion.getX()+15); 
		return posicion.getX();
	}
	public double der35 (){
		posicion.setX(posicion.getX()+35); 
		return posicion.getX();
	}
	
	
	
}
