package ba.bitcamp.vjezbe.w5d4;

public class DesktopComputer extends StacionaryComputer{

	private int freeSpaceForRAM;
	private boolean isOverclock;
	private boolean hasOpticalDrive;
	
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
}
