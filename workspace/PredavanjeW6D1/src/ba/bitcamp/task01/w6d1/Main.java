package ba.bitcamp.task01.w6d1;

public class Main {

	public static void main(String[] args) {

		Foo foo1 = new Foo(1500);
		Foo foo2 = new Foo(110);
		Foo foo3 = new Foo(1600);
		Foo foo4 = new Foo(125);
		Foo foo5 = new Foo(1340);
		Foo foo6 = new Foo(1704);

		Foo[] foos = new Foo[6];
		foos[0] = foo1;
		foos[1] = foo2;
		foos[2] = foo3;
		foos[3] = foo4;
		foos[4] = foo5;
		foos[5] = foo6;

		System.out.println(getMax(foos));
		
		Bar[] barArray = new Bar[3];
		barArray[0] = new Bar("A");
		barArray[1] = new Bar("AB");
		barArray[2] = new Bar("ABC");
	}

	public static Compare getMax(Compare[] foos) {
		Compare max = foos[0];
		for (int i = 1; i < foos.length; i++) {
			if (max.compare(foos[i]) == -1) {
				max = foos[i];
			}
		}
		return max;
	}
	
	

}
