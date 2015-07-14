package ba.bitcamp.ArrayList;

public class Song {

	public static final int DZIGARA = 1;
	public static final int ROCK = 2;
	public static final int POP = 3;
	
	private String name;
	private String author;
	private int year;
	private int genre;
	
	public Song(String name, String author, int year, int genre){
		this.name=name;
		this.author=author;
		this.year = year;
		this.genre = genre;
	}
	
	public boolean equals(Song other){
		if(this.name.equals(other.name) && this.author.equals(other.author) && this.year == other.year && this.genre == other.genre){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return "Song tittle: "+ name + " Author: " + author + " Year: " + year; 
	}
}
