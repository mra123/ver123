package POLIGONO;

import java.util.Arrays;

public class Poligono {

	private Punto[] figura=new Punto[4];
	
	public Punto[] getFigura() {
		return figura;
	}

	public void setFigura(Punto[] figura) {
		this.figura = figura;
	}

	public Poligono(Punto[] figura) {

		this.figura = figura;
	}

	@Override
	public String toString() {
		for (int j = 0; j < figura.length; j++) {
			System.out.println(figura[j].toString());		
		}
		return "Poligono [figura=" + Arrays.toString(figura) + "]";
	}
	
	public double perimetro(){
		double per=0;
		for (int i = 0; i < figura.length-1; i++) {
			per+=Math.sqrt((Math.pow((figura[i].getX()-figura[i+1].getX()),2)+Math.pow((figura[i].getY()-figura[i+1].getY()),2)));
		}
		per+=Math.sqrt((Math.pow((figura[figura.length-1].getX()-figura[0].getX()),2)+Math.pow((figura[figura.length-1].getY()-figura[0].getY()),2)));
		return per;
	}
	public void trasladar (double x,double y){
		for (int i = 0; i < figura.length; i++) {
			figura[i].setX(figura[i].getX()+x);
			figura[i].setY(figura[i].getY()+y);
		}
	}
	public int vertices (){
		int ver=0;
		for (int i = 0; i < figura.length; i++){
			if(figura[i]!=null)ver++;
		}
		return ver;
	}

	public void escala (double x,double y){
		for (int i = 0; i < figura.length; i++) {
			figura[i].setX(figura[i].getX()*x);
			figura[i].setY(figura[i].getY()*y);
		}
	}
	
}