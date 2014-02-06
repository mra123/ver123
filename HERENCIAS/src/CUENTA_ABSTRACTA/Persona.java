package CUENTA_ABSTRACTA;

public class Persona implements Comparable {

	protected String nombre, apellidos;
	protected NIFS nif;
	protected int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public NIFS getNif() {
		return nif;
	}
	public void setNif(NIFS nif) {
		this.nif = nif;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos
				+ ", nif=" + nif + ", edad=" + edad + "]";
	}
	public Persona(String nombre, String apellidos, NIFS nif, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.edad = edad;
	}
	@Override
	public int compareTo(Object o) {
		Persona p=(Persona) o;
		if 
		return 0;
	}

}
