package fr.poo2.composants;

public class Car extends Vehicle {
	
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}

	@Override
    public String doStuff() {
        return ("Je suis " + getBrand() +" et je fais vroum vroum !");
    }

}
