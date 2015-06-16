package ba.bitcamp.task03.vjezbeW5D2;

public class PrinterMain {

	public static void main(String[] args) {
		
//		System.out.println("Make printer!");
//		System.out.println();
		Printer p1 = new Printer("HP space shuttle");
//		System.out.println(p1);
		p1.addMaxInk();
//		p1.addPaper(10);
//		System.out.println();
//		System.out.println(p1);
//		System.out.println();
//		System.out.println("Print me 10 pages!");
//		System.out.println();
//		p1.print(10);
//		System.out.println(Printer.getPrintedPaper());
//		System.out.println("Print some more!");
//		System.out.println(p1);
		p1.addPaper(50);
//		p1.print(20);
//		System.out.println(Printer.getPrintedPaper());
//		System.out.println(p1.getNumberOfPrintedPaper());
		
		Printer p2 = new Printer("HP mini");
		p2.addMaxInk();
		p2.addPaper(100);
		
		Printer[] printers= new Printer[2];
		printers[0] = p1;
		printers[1] = p2;
		PrinterNetwork pn1 = new PrinterNetwork(printers);
		pn1.coordinatePrint(45);
		
		System.out.println(p1.getNumberOfPrintedPaper() + "\n" + p2.getNumberOfPrintedPaper());
	}

	
}
