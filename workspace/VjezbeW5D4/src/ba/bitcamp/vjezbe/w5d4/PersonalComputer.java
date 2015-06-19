package ba.bitcamp.vjezbe.w5d4;

public abstract class PersonalComputer {

	protected String nameOfOperatingSystem;
	protected int randomAccessMemory;
	protected int computerPrice;

	public PersonalComputer(String nameOfOperatingSystem,
			int randomAccessMemory, int computerPrice) {
		this.nameOfOperatingSystem = nameOfOperatingSystem;
		this.randomAccessMemory = randomAccessMemory;
		this.computerPrice = computerPrice;
	}

	// Getters and Setters
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

	public void printInformation() {
		System.out.println("OS: " + nameOfOperatingSystem + "\n");
		System.out.println("RAM: " + randomAccessMemory + "\n");
		System.out.println("Price: " + computerPrice + "\n");
	}

}
