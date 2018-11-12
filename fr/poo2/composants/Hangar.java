package fr.poo2.composants;

public class Hangar {

	public static void main(String[] args) {
		Car kevin = new Car("Voiture de dingue",18);
		Boat loic = new Boat("bateau de sa race", 27);
		
		//Ici, j'invoque la methode
		System.out.println(kevin.doStuff());
		System.out.println(loic.doStuff());
		
	}

}
