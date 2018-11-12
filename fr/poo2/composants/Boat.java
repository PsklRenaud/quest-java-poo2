package fr.poo2.composants;

public class Boat extends Vehicle {
	
    public Boat(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}

	@Override
    public String doStuff() {
        return ("Je suis " + getBrand() +" et je fais glou glou !");
    }

}
