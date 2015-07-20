package ba.bitcamp.Objects;

public class VideoGame extends Application {

	private String gameName;
	private String genre;
	private String studio;
	private int numberSoled;

	public VideoGame(String name, int year, String version, double size,
			String gameName, String genre, String studio, int numberSoled) {
		super(name, year, version, size);
		this.gameName = gameName;
		this.genre = genre;
		this.studio = studio;
		this.numberSoled = numberSoled;
	}

	public String getGameName() {
		return gameName;
	}

	public String getGenre() {
		return genre;
	}

	public String getStudio() {
		return studio;
	}

	public int getNumberSoled() {
		return numberSoled;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public void setNumberSoled(int numberSoled) {
		this.numberSoled = numberSoled;
	}

	@Override
	public String toString() {
		return String.format(
				"VideoGame [gameName=%s, genre=%s, studio=%s, numberSoled=%s]",
				gameName, genre, studio, numberSoled);
	}

}
