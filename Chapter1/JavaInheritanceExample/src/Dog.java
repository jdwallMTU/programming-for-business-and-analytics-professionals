
public class Dog extends Mammal {
	//this is a class attribute that the parent class (i.e., Mammal) does not have
	private boolean hasFloppyEars = true;

	//getter-setter methods for the class attribute above
	public boolean getHasFloppyEars() {
		return this.hasFloppyEars;
	}

	public void setHasFloppyEars(boolean hasFloppyEars) {
		this.hasFloppyEars = hasFloppyEars;
	}
	
	//this is a method unique to the Dog class
	public void bark() {
		System.out.println("The dog says woof");
	}
}
