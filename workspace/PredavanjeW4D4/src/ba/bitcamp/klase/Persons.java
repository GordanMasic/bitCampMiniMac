package ba.bitcamp.klase;

public class Persons {

	/*
	 * Listing arrays as a date structures
	 */

	public static void main(String[] args) {
//		String[] person1 = { "Tarik", "Celik", "1986", "Jadranska 9",
//				"A16FOOA", "tarik.celik@bitcamp.ba", "187", "1",
//				"Softwer Developer", "Pasta", "7UP" };
//
//		String[] person2 = { "John", "Doe", "1947", "Radiceva 2", "A1OOOOO",
//				"213", "john.doe@pekara.ba", "0", "Pekar", "Grah", "Boza" };
//
//		App.getOlderPerson(person1, person2);

		/*
		 * Listing classes as data structures
		 */

		PersonDetails per1 = new PersonDetails("Tarik", "Celik", 1986,
				"Jadranska 9", "A16FOOA", "tarik.celi@bitcamp.ba", 187, true,
				"Pasta", "7UP");
		PersonDetails per2 = new PersonDetails("John", "Doe", 1997,
				"Radiceva 2", "A1OOOOO", "john.doe@pekara.ba", 213, false,
				"Grah", "Boza");
		
		App.getOlderPerson(per1, per2);
	}
}
