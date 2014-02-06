package CUENTA_ABSTRACTA;

public class PruebaCuenta {

	
	public static void main(String[] args) {
		
		CuentaCorriente Antonio=new CuentaCorriente(111,new Persona("Antonio","Cahchas",new NIFS(02445566) ,28) );
		//CuentaAhorro Jorge=new CuentaAhorro ( );
		CuentaCorriente Jorge=new CuentaCorriente(111,new Persona("Antonio","Cahchas",new NIFS(02445566) ,28) );
		CuentaCorriente Victor=new CuentaCorriente(222,new Persona("Antonio","Cahchas",new NIFS(02445566) ,28) );
		System.out.println(Antonio.compareTo(Jorge));
		System.out.println(Antonio.compareTo(Victor));

		
	}

}
