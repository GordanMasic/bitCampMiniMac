package ba.bitcamp.vjezbe.w5d4;

public class Laptop extends PortablePC{

	private int batteryCells;
	private boolean hasBluetooth;
	private boolean hasNumericKeyboard;
	
	//Getters and Setters
	public int getBatteryCells() {
		return batteryCells;
	}
	public void setBatteryCells(int batteryCells) {
		this.batteryCells = batteryCells;
	}
	public boolean isHasBluetooth() {
		return hasBluetooth;
	}
	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}
	public boolean isHasNumericKeyboard() {
		return hasNumericKeyboard;
	}
	public void setHasNumericKeyboard(boolean hasNumericKeyboard) {
		this.hasNumericKeyboard = hasNumericKeyboard;
	}
	
	/**
	 * Description of the computer
	 */
	public void printTypeInfo(){
		System.out.println("This type of computer is suitable for massive usage, when it comes to portability.");
		System.out.println("Main thing at these computers is portability, connectivity and battery.");
		
	}
	

}
