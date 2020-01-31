
public class DuckBilledPlatypus extends Mammal {
	//this is a class attribute that the parent class (i.e., Mammal) does not have
	private boolean hasPoisonGlands = true;

	//getter-setter methods for the class attribute above
	public boolean isHasPoisonGlands() {
		return hasPoisonGlands;
	}

	public void setHasPoisonGlands(boolean hasPoisonGlands) {
		this.hasPoisonGlands = hasPoisonGlands;
	}
	
	@Override
	public void giveBirth() {
		System.out.println("The " + this.animalName + " is laying eggs");
	}
}
