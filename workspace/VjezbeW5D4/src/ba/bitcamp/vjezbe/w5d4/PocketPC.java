package ba.bitcamp.vjezbe.w5d4;

public class PocketPC extends PortablePC{

	private boolean hasTouchInterface;
	private boolean hasSIMCard;
	private boolean hasMicroSDCard;
	
	
	
	public PocketPC(String nameOfOperatingSystem, int randomAccessMemory,
			int computerPrice, int weight, int monitorSize, boolean hasWiFi,
			boolean hasTouchInterface, boolean hasSIMCard,
			boolean hasMicroSDCard) {
		super(nameOfOperatingSystem, randomAccessMemory, computerPrice, weight,
				monitorSize, hasWiFi);
		this.hasTouchInterface = hasTouchInterface;
		this.hasSIMCard = hasSIMCard;
		this.hasMicroSDCard = hasMicroSDCard;
	}
	//Getters and Setters
	public boolean isHasTouchInterface() {
		return hasTouchInterface;
	}
	public void setHasTouchInterface(boolean hasTouchInterface) {
		this.hasTouchInterface = hasTouchInterface;
	}
	public boolean isHasSIMCard() {
		return hasSIMCard;
	}
	public void setHasSIMCard(boolean hasSIMCard) {
		this.hasSIMCard = hasSIMCard;
	}
	public boolean isHasMicroSDCard() {
		return hasMicroSDCard;
	}
	public void setHasMicroSDCard(boolean hasMicroSDCard) {
		this.hasMicroSDCard = hasMicroSDCard;
	}
	
	/**
	 * Description of the computer
	 */
	public void printTypeInfo(){
		System.out.println("This type of computer is suitable for massive usage, when it comes to portability.");
		System.out.println("Main thing at these computers is portability and funcionality.");
		
	}
	
	public void printInformation() {
		super.printInformation();
		System.out.println("Touch: " + hasTouchInterface + "\n");
		System.out.println("Micro SD: " + hasMicroSDCard + "\n");
		System.out.println("SIM: " + hasSIMCard + "\n");
	}
}
