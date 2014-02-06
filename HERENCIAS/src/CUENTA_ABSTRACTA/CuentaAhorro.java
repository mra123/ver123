package CUENTA_ABSTRACTA;

public abstract class CuentaAhorro extends Cuenta {

	protected double salmin;
	protected double intvar;
	
	public CuentaAhorro(int numeroCuenta, Persona cliente, double salmin,
			double intvar) {
		super(numeroCuenta, cliente);
		this.salmin = salmin;
		this.intvar = intvar;
	}
	public double getSalmin() {
		return salmin;
	}
	public void setSalmin(double salmin) {
		this.salmin = salmin;
	}
	public double getIntvar() {
		return intvar;
	}
	public void setIntvar(double intvar) {
		this.intvar = intvar;
	}
	@Override
	public String toString() {
		return "CuentaAhorro [intvar=" + intvar + ", saldo mínimo= "+ salmin +
				", numeroCuenta="+ numeroCuenta + ", cliente= "+ cliente +"]";
	}
	public void retirar(double cantidad) {
		if(getSaldo()>=cantidad & (getSaldo()-cantidad)>=salmin )  setSaldo(getSaldo()-cantidad);
		else System.out.println("No saques lo que no tienes");
	}
	public void actualizarSaldo(){
		setSaldo(getSaldo()+(getSaldo()*intvar));
	}

}
