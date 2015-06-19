package ba.bitcamp.klase;

public class App {

	public static void getOlderPerson(PersonDetails p1, PersonDetails p2) {
		Integer ageDiff;
		if (p1.yearOfBirth > p2.yearOfBirth) {
			ageDiff = p1.yearOfBirth - p2.yearOfBirth;
			printer(p2, p1, ageDiff);
		} else {
			ageDiff = p2.yearOfBirth - p1.yearOfBirth;
			printer(p1, p2, ageDiff);
		}
	}

	public static void printer(PersonDetails printable1,
			PersonDetails printable2, Integer ageDifference) {

		System.out
				.printf("Osoba %s rodjena %d , koja zivi u %s \nje %d godina starija od %s rodjene %d,\nkoja zivi u %s ",
						printable1.firstName, printable1.yearOfBirth,
						printable1.adress, ageDifference, printable2.firstName,
						printable2.yearOfBirth, printable2.adress);

	}

}
