package ba.bitcamp.vjezbe.w5d4;

public abstract class StacionaryComputer extends PersonalComputer{

	private double processorSpeed;
	private int powerSupplyUnit;
	private int hardDiscSpace;
	

	//Getters and Setters
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
	
	
}
