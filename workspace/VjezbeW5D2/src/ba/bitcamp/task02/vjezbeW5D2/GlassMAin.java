package ba.bitcamp.task02.vjezbeW5D2;

public class GlassMAin {

	public static void main(String[] args) {
		
		Glass g1 = new Glass(0.33);
		
		g1.addDrink("Beer", 0.33);
		System.out.println(g1);
		System.out.println();
		System.out.println("GUT! GUT! GUT! GUT!");
		g1.emptyGlass();
		System.out.println();
		System.out.println(g1);
		System.out.println();
		System.out.println("Guest status:");
		System.out.println("Prazna casa na mom stolu.HICKUP! Iz te case ti si pila...IIIIIHUUUUU!");

	}

}
