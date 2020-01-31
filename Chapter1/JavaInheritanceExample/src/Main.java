
public class Main {

	//this method is the starting point for Java programs
	//the method signature must look exactly like the one below for the program to function
	public static void main(String[] args) {
		//instantiating a new Dog object
		Dog myFirstPet = new Dog();
		myFirstPet.setAnimalName("bull dog");
		myFirstPet.setHasFloppyEars(false);
		myFirstPet.setHairLength(4.5);
		myFirstPet.bark();
		myFirstPet.giveBirth();
		
		//instantiating a new DuckBilledPlatypus object
		DuckBilledPlatypus mySecondPet = new DuckBilledPlatypus();
		mySecondPet.setAnimalName("duck billed platypus");
		mySecondPet.setHairLength(2.25);
		mySecondPet.giveBirth();
	}

}
