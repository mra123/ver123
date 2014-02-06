package COCHES;

public class Punto {
	
	private double x;
	private double y;
	
	
	public Punto(){
		x=0;// se podria poner this(0.0,0.0);
		y=0;
	}
	public Punto (double x,double y){
		this.x=x;
		this.y=y;
	}
	public double getX (){
		return x;
	}
	public double getY (){
		return y;
	}
	public void setX (double d){
		this.x=d;
	}
	public void setY (double y){
		this.y=y;
	}
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	

}
