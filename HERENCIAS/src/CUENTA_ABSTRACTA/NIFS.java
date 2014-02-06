package CUENTA_ABSTRACTA;

	import java.util.*;
	public class NIFS {

		private long DNI;
		private char letra;
		
		public NIFS() {
			DNI = 0;
			letra=' ';
		}
		public NIFS(long dNI) {
			DNI = dNI;
			getLetra(DNI);
		}
		public long getDNI() {
			return DNI;
		}
		public void setDNI(long dNI) {
			DNI = dNI;
			getLetra(DNI);
		}
		public char getLetra (long d){
			char[] let={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
			letra=let[(int) (DNI%23)];
			return letra;
		}
		public void leer (){
			Scanner teclado=new Scanner (System.in);
			System.out.println("Dame DNI: ");
			DNI=teclado.nextLong();
			System.out.println("DNI: "+getLetra(DNI));
		}
		
		
	}


