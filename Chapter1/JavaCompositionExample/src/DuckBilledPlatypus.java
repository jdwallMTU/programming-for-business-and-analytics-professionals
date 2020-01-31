
public class DuckBilledPlatypus implements Birthable, Speakable {

	//these two methos have to be in the class because the class implements the Birthable and Speakable interfaces
	@Override
	public void speak() {
		System.out.println("The platypus says squeak or whatever the platypus says!");
	}

	@Override
	public void giveBirth() {
		System.out.println("The platypus is laying eggs!");
		
	}

}
