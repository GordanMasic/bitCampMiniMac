package ba.bitcamp.singerice;

public class Main {

	public static void main(String[] args) {

		MusicPerformer m1 = new MusicPerformer("The Rolling Stones", true,
				1962, "Rock");
		MusicPerformer m2 = new MusicPerformer("The Beatles", true, 1960,
				"Rock");

		Song s1 = new Song(m1, "Satisfaction", 1965, "Rock");
		Song s2 = new Song(m1, "Paint it black", 1966, "Rock");
		Song s3 = new Song(m2, "Love me do", 1962, "Rock");
		Song s4 = new Song(m2, "Help!", 1965, "Rock");
		
		Song[] albumSongs1 = new Song[2];
		albumSongs1[0] = s1;
		albumSongs1[1] = s2;
		
		Album al1 = new Album("Satisfaction", m1,albumSongs1,"Rock");
		
		Song[] albumSongs2 = new Song[2];
		albumSongs2[0] = s1;
		albumSongs2[1] = s2;
		
		Album al2 = new Album("Help!", m2,albumSongs2,"Rock");
		
		Album[] albums = new Album[2];
		albums[0] = al1;
		albums[1] = al2;

//		System.out.println("Is it same author of song \"" + s1.songTittle
//				+ "\" and \"" + s2.songTittle + "\"? " + isSameAuthor(s1, s2));
//
//		System.out.println("Is it same author of song \"" + s3.songTittle
//				+ "\" and \"" + s1.songTittle + "\"? " + isSameAuthor(s3, s2));
//
//		System.out.println();
//		System.out.println(m1);
//		System.out.println();
//		System.out.println(s1);
//		System.out.println();
//		System.out.println("Is song \"" + s1.songTittle
//				+ "\" from solo author? " + isFromSoloAuthor(s1));
//		System.out.println();
//		Song olderSong = getOlderSong(s1, s4);
//		if (olderSong != null){
//			System.out.println("Which song is older? \n"+s1+" or "+s4+" \n"+olderSong);
//		}else{
//			System.out.println("Which song is older? \n"+s1+" or "+s4+" \nNiether");
//		}
//		
//		System.out.println("Album "+al1.albumName+" whose genre is "+al1.albumGenre);
//		System.out.println("has "+countGenreNumber(al1, al1.albumGenre)+" songs from that genre.");
//		
		System.out.println("In which album is song "+ s1.songTittle);
		printAlbumInformation(albums, s1);
	}

	public static boolean isSameAuthor(Song s1, Song s2) {
		if (s1.author.name.equals(s2.author.name)) {
			return true;
		}
		return false;
	}

	public static boolean isFromSoloAuthor(Song s) {
		if (s.author.isBand == true) {
			return false;
		}
		return true;
	}

	public static Song getOlderSong(Song s1,Song s2){
		if (s1.songYear < s2.songYear){
			return s1;
		}else if(s1.songYear > s2.songYear){
		return s2;
		}else
			return null;
	}
	
	public static int countGenreNumber(Album a, String genre){
		int counter = 0;
		for (int i = 0; i < a.songsOnAlbum.length; i++) {
			if(a.songsOnAlbum[i].songGenre.equals(genre)){
				counter++;
			}
		}
		return counter;
	}
	
	public static void printAlbumInformation(Album[] a, Song s){
		Album al1 = null;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].songsOnAlbum.length; j++) {
				if(s.songTittle.equals(a[i].songsOnAlbum[i].songTittle)){
					al1 = a[i];
				}
			}
		}
		System.out.println(al1);
	}
}
