package ba.bitcamp.task03.vjezbeW5D2;

public class PrinterNetwork {
	
	private Printer[] printers;
	
	
	public PrinterNetwork(Printer[] printers) {
		this.printers = printers;
	}


	public void coordinatePrint(int num){
		for (int i = 0; i < printers.length; i++) {
			printers[i].print(num);
			num -= printers[i].getNumberOfPrintedPaper();
		}
	}
}
