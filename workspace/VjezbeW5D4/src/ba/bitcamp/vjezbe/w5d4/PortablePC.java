package ba.bitcamp.vjezbe.w5d4;

public abstract class PortablePC extends PersonalComputer {

	private int weight;
	private int monitorSize;
	private boolean hasWiFi;

	public PortablePC(String nameOfOperatingSystem, int randomAccessMemory,
			int computerPrice, int weight, int monitorSize, boolean hasWiFi) {
		super(nameOfOperatingSystem, randomAccessMemory, computerPrice);
		this.weight = weight;
		this.monitorSize = monitorSize;
		this.hasWiFi = hasWiFi;
	}

	// Getters and Setters
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMonitorSize() {
		return monitorSize;
	}

	public void setMonitorSize(int monitorSize) {
		this.monitorSize = monitorSize;
	}

	public boolean isHasWiFi() {
		return hasWiFi;
	}

	public void setHasWiFi(boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}

	public void printInformation() {
		super.printInformation();
		System.out.println("Weight: " + weight + "\n");
		System.out.println("Monitor size: " + monitorSize + "\n");
		System.out.println("WI-FI: " + hasWiFi + "\n");
	}
}
