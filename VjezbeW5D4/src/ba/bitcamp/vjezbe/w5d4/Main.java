package ba.bitcamp.vjezbe.w5d4;

public class Main {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		l1.setBatteryCells(2);
		l1.setHasBluetooth(true);
		l1.setHasNumericKeyboard(true);
		l1.setHasWiFi(true);
		l1.setMonitorSize(15);
		l1.setNameOfOperatingSystem("Windows 8");
		l1.setComputerPrice(990);
		l1.setRandomAccessMemory(4);
		l1.setWeight(1);
		
		l1.printTypeInfo();
		
		Workstation w1 = new Workstation();
		w1.setRandomAccessMemory(10);
		w1.setProcessorSpeed(5.2);
		w1.setPowerSupplyUnit(10);
		w1.setNumberOfProcessingCores(5);
		w1.setNumberOfMonitors(2);
		w1.setNameOfOperatingSystem("Lunux Ubuntu");
		w1.setHasECC(true);
		w1.setHardDiscSpace(2);
		w1.setComputerPrice(4500);
		
		
	}

}
