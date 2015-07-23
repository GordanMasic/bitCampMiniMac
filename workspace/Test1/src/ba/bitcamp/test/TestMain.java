package ba.bitcamp.test;

public class TestMain {

	public static void main(String[] args) {

		Museum museum = new Museum();

		Employee employee1 = new Employee("John", "Doe", 1500);
		Employee employee2 = new Employee("Jane", "Doe", 1200);
		Employee employee3 = new Employee("Richard", "Gerre", 2000);
		Employee employee4 = new Employee("Sandra", "Bullock", 3500);

		museum.add(employee1);
		museum.add(employee2);
		museum.add(employee3);
		museum.add(employee4);

		Artifacts artifact1 = new Artifacts(
				"Magna Carta",
				"Magna Carta  is a charter agreed by King John of England at Runnymede, near Windsor, on 15 June 1215.",
				"England", PeriodArtifact.MIDDLEAGES);
		Artifacts artifact2 = new Artifacts(
				"The King List",
				"The King List is an account of kingships stretching into the prehistory of the Sumerian people.",
				"Sumer", PeriodArtifact.ANTIC);
		Artifacts artifact3 = new Artifacts(
				"Codex Gigas (Or ‘The Devil’s Bible’)",
				"The largest known ancient manuscript is the Codex Gigas, more famously called “the Devil’s Bible” due to a full-page illustration of the Devil himself and the legends that swirl around the book. It takes two people to lift the book, which is made of more than 160 animal skins. ",
				"UNKNOWN", PeriodArtifact.MIDDLEAGES);

		ArtWorks artWork1 = new ArtWorks(
				"Mona Lisa",
				"Mona lisa or La Gioconda is a half-length portrait of a woman by the Italian artist Leonardo da Vinci, which has been acclaimed as \"the best known, the most visited, the most written about, the most sung about, the most parodied work of art in the world\".",
				"Leonardo da Vinci", PeriodArtWorks.RENAISSANCE);
		ArtWorks artWork2 = new ArtWorks(
				"Guernica",
				"Guernica is a mural-sized oil painting on canvas by Spanish artist Pablo Picasso completed by June 1937.The painting, which uses a palette of gray, black, and white, is known as one of the most moving and powerful anti-war paintings in history.[",
				"Picasso", PeriodArtWorks.CLASSICISM);

		museum.add(artifact1);
		museum.add(artifact2);
		museum.add(artifact3);
		museum.add(artWork1);
		museum.add(artWork2);

		museum.sortEmployees();
		museum.sortExponates();

		System.out.println(museum);
		
		System.out.println(artWork1.fitsSearch("Mona"));
	}
}
