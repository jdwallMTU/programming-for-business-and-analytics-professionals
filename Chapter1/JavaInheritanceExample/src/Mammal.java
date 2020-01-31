//this is an abstract class meaning it cannot be instantiated
public abstract class Mammal {
	//these are the class attributes
	private boolean hasMammaryGlands = true;
	private double hairLength;
	protected String animalName;
	
	//these are getter-setter methods used to get and set the values of the class attributes
	public boolean getHasMammaryGlands() {
		return this.hasMammaryGlands;
	}
	
	public void setHasMammaryGlands(boolean hasMammaryGlands) {
		this.hasMammaryGlands = hasMammaryGlands;
	}
	
	public double getHairLength() {
		return this.hairLength;
	}
	
	public void setHairLength(double hairLength) {
		this.hairLength = hairLength;
	}
	
	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	//this is a class method
	public void giveBirth() {
		System.out.println("The " + this.animalName + " is giving birth to live young");
	}
}
