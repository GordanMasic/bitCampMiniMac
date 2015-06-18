package ba.bitcamp.vjezbe.w5d4;

public abstract class PersonalComputer {

	private String nameOfOperatingSystem;
	private int randomAccessMemory;
	private int computerPrice;
	
	
	//Getters and Setters
	public String getNameOfOperatingSystem() {
		return nameOfOperatingSystem;
	}
	
	public void setNameOfOperatingSystem(String nameOfOperatingSystem) {
		this.nameOfOperatingSystem = nameOfOperatingSystem;
	}
	
	public int getRandomAccessMemory() {
		return randomAccessMemory;
	}
	
	public void setRandomAccessMemory(int randomAccessMemory) {
		this.randomAccessMemory = randomAccessMemory;
	}
	
	public int getComputerPrice() {
		return computerPrice;
	}
	
	public void setComputerPrice(int personalComputerPrice) {
		this.computerPrice = personalComputerPrice;
	}
	
	
}
