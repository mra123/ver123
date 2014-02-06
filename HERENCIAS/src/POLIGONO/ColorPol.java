package POLIGONO;

public class ColorPol extends Poligono{

	String color;
	
	public ColorPol(Punto[] figura,String color) {
		super(figura);
		this.color=color;
	}

	@Override
	public String toString() {
		super.toString();
		return "ColorPol [color=" + color + "]";
	}
	

	
	
	
	
}
