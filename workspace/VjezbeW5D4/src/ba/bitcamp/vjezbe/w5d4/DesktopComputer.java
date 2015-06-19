package ba.bitcamp.vjezbe.w5d4;

public class DesktopComputer extends StacionaryComputer{

	private int freeSpaceForRAM;
	private boolean isOverclock;
	private boolean hasOpticalDrive;
	
	
	
	public DesktopComputer(String nameOfOperatingSystem,
			int randomAccessMemory, int computerPrice, double processorSpeed,
			int powerSupplyUnit, int hardDiscSpace, int freeSpaceForRAM,
			boolean isOverclock, boolean hasOpticalDrive) {
		super(nameOfOperatingSystem, randomAccessMemory, computerPrice,
				processorSpeed, powerSupplyUnit, hardDiscSpace);
		this.freeSpaceForRAM = freeSpaceForRAM;
		this.isOverclock = isOverclock;
		this.hasOpticalDrive = hasOpticalDrive;
	}
	//Getters and Setters
	public int getFreeSpaceForRAM() {
		return freeSpaceForRAM;
	}
	public void setFreeSpaceForRAM(int freeSpaceForRAM) {
		this.freeSpaceForRAM = freeSpaceForRAM;
	}
	public boolean isOverclock() {
		return isOverclock;
	}
	public void setOverclock(boolean isOverclock) {
		this.isOverclock = isOverclock;
	}
	public boolean isHasOpticalDrive() {
		return hasOpticalDrive;
	}
	public void setHasOpticalDrive(boolean hasOpticalDrive) {
		this.hasOpticalDrive = hasOpticalDrive;
	}
	
	/**
	 * Description of the computer
	 */
	public void printTypeInfo(){
		System.out.println("This type of computer is suitable for massive usage.");
		System.out.println("Main thing at these computers is possibility to configure and adjust as you wish.");
		
	}
	public void printInformation() {
		super.printInformation();
		System.out.println("RAM free space: " + freeSpaceForRAM + "\n");
		System.out.println("Overlock: " + isOverclock + "\n");
		System.out.println("Optical drive: " + hasOpticalDrive + "\n");
	}
}
