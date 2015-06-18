package ba.bitcamp.vjezbe.w5d4;

public class Workstation extends StacionaryComputer {

	private int numberOfMonitors;
	private int numberOfProcessingCores;
	private boolean hasECC;

	// Getters and Setters
	public int getNumberOfMonitors() {
		return numberOfMonitors;
	}

	public void setNumberOfMonitors(int numberOfMonitors) {
		this.numberOfMonitors = numberOfMonitors;
	}

	public int getNumberOfProcessingCores() {
		return numberOfProcessingCores;
	}

	public void setNumberOfProcessingCores(int numberOfProcessingCores) {
		this.numberOfProcessingCores = numberOfProcessingCores;
	}

	public boolean isHasECC() {
		return hasECC;
	}

	public void setHasECC(boolean hasECC) {
		this.hasECC = hasECC;
	}

	/**
	 * Description of the computer
	 */
	public void printTypeInfo() {
		System.out
				.println("This type of computers are much powerfull than standard desktop PC-s that are suitable for massive usage.");
		System.out
				.println("Workstations are made for research and science work with plenty of calculations.");

	}
}
