package ba.bitcamp.vjezbe.w5d4;

public abstract class StacionaryComputer extends PersonalComputer {

	protected double processorSpeed;
	protected int powerSupplyUnit;
	protected int hardDiscSpace;

	public StacionaryComputer(String nameOfOperatingSystem,
			int randomAccessMemory, int computerPrice, double processorSpeed,
			int powerSupplyUnit, int hardDiscSpace) {
		super(nameOfOperatingSystem, randomAccessMemory, computerPrice);
		this.processorSpeed = processorSpeed;
		this.powerSupplyUnit = powerSupplyUnit;
		this.hardDiscSpace = hardDiscSpace;
	}

	// Getters and Setters
	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(double d) {
		this.processorSpeed = d;
	}

	public int getPowerSupplyUnit() {
		return powerSupplyUnit;
	}

	public void setPowerSupplyUnit(int powerSupplyUnit) {
		this.powerSupplyUnit = powerSupplyUnit;
	}

	public int getHardDiscSpace() {
		return hardDiscSpace;
	}

	public void setHardDiscSpace(int hardDiscSpace) {
		this.hardDiscSpace = hardDiscSpace;
	}

	public void printInformation() {
		super.printInformation();
		System.out.println("CPU speed: " + processorSpeed + "\n");
		System.out.println("PSU: " + powerSupplyUnit + "\n");
		System.out.println("HD Space: " + hardDiscSpace + "\n");
	}
}
