package ba.bitcamp.creating.bags;


public class Main {

	public static void main(String[] args) {
		

		Bag b = new Bag(40);
		
		System.out.println(b.getMaxCapacity());
		
		b.add(20);
		b.add(30);
		
		System.out.println(b.getFreeSpace());
		
		b.add(20);
		
		System.out.println(b.getFreeSpace());
	}

}
