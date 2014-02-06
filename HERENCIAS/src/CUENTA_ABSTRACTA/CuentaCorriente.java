package CUENTA_ABSTRACTA;

public class CuentaCorriente extends Cuenta implements Comparable{

	private final double interes=0.015f;
	
	CuentaCorriente(int numeroCuenta, Persona cliente) {
		super(numeroCuenta, cliente); 
	}
	
	@Override
	public String toString() {
		return "CuentaCorriente [interes=" + interes + 
				", numeroCuenta="+ numeroCuenta + ", cliente= "+ cliente +"]";
	}

	@Override
	public void retirar(double cantidad) {
		if(getSaldo()>=cantidad) setSaldo(getSaldo()-cantidad);
		else System.out.println("No saques lo que no tienes");
	}
	public double getInteres() {
		return interes;
	}
	public void actualizarSaldo(){
		setSaldo(getSaldo()+(getSaldo()*interes));
	}

	@Override
	public int compareTo(Object o) {
		//int uno= getNumeroCuenta();
		CuentaCorriente p=(CuentaCorriente) o;
		if(numeroCuenta==p.getNumeroCuenta())return 0;
		else return 1;
	}




	
}
