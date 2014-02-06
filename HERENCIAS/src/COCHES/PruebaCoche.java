package COCHES;

public class PruebaCoche {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CocheDeportivo culebro=new CocheDeportivo("Antonio","Toyota","Negro",new Punto(0,0));
		CocheEconomico toñito=new CocheEconomico("Victor","KIA","Azul",new Punto(0,0));
		Taxi moe=new Taxi("MOE","Ferrari",new Punto(0,0));
		culebro.avanza();
		toñito.avanza();
		moe.avanza();
		System.out.println(moe);
		System.out.println(culebro);
		System.out.println(toñito);
		Coche jorge =null;
		Taxi ivan=new Taxi("César","lechera",new Punto(0,0));
		//System.out.println(jorge); Aqui tenemos un eero pq no visualiza si apunta a null
		//ivan=jorge; Da error porque no todos los Coches son taxi....
		jorge=ivan;// Aqui si podemos porque los Taxis siempre son Coches;
		System.out.println(jorge);
		
		Coche marta=new Coche ("Marta","KIA","Rojo",new Punto(1,2));
		//Taxi mirel= marta; Da error pq coche no siempre es Taxi
		Coche[] taller={moe,culebro,ivan,jorge,toñito};
		for (Coche i:taller){
			System.out.println(i);
			if(i instanceof CocheEconomico) System.out.println("Es un carrazo!!");//averigua cuales con economicos
		}
		
	}

}
