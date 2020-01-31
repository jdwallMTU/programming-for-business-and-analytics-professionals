
public class Dog implements Birthable, Speakable {

	//these two methos have to be in the class because the class implements the Birthable and Speakable interfaces
	@Override
	public void speak() {
		System.out.println("The dog says bark!");
	}

	@Override
	public void giveBirth() {
		System.out.println("The dog is giving birth to live young!");
	}

}
