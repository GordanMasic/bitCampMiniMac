package ba.bitcamp.ArrayList;

public class Main {

	public static void main(String[] args) {

		Song s1 = new Song("Come to be old together", "Saban Saulic", 1975,
				Song.DZIGARA);
		Song s2 = new Song("Long live Rock And Roll", "The Rainbow", 1979,
				Song.ROCK);
		Song s3 = new Song("Uptown Funk", "Bruno Mars", 2015, Song.POP);

		ArrayListSong topHits = new ArrayListSong();
		topHits.addSong(s1);
		topHits.addSong(s2);
		topHits.addSong(s3);

		System.out.println(topHits);

		topHits.removeSong(0);

		System.out.println(topHits);

		System.out.println(topHits.listSize());

		System.out.println(topHits.indexOf(s2));
	}

}
