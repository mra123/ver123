package CUENTA_ABSTRACTA;

public abstract class Cuenta {

	protected int numeroCuenta;
	private double saldo;
	protected Persona cliente;
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Persona getCliente() {
		return cliente;
	}
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	@Override
	public abstract String toString();
	
	Cuenta(int numeroCuenta, Persona cliente) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = 0;
		this.cliente = cliente;
	}
	public void ingresar (double cantidad){
		saldo+=cantidad;
	}
	abstract public void retirar (double cantidad);
	
	public void actualizarSaldo(){
		System.out.println(saldo);
	}

}
