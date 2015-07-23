package ba.bitcamp.test;

public class ArtWorks extends Exponate {

	// Variables
	private String authorName;
	private PeriodArtWorks period;

	/**
	 * Constructor for creating ArtWorks objects
	 * 
	 * @param name
	 * @param description
	 * @param authorName
	 * @param period
	 */
	public ArtWorks(String name, String description, String authorName,
			PeriodArtWorks period) {
		super(name, description);

		this.authorName = authorName;
		this.period = period;
	}

	// Getters and Setters
	public String getAuthorName() {
		return authorName;
	}

	public PeriodArtWorks getPeriod() {
		return period;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setPeriod(PeriodArtWorks period) {
		this.period = period;
	}

	/**
	 * toString method
	 */
	@Override
	public String toString() {
		String periodArt = "";
		switch (period) {

		case RENAISSANCE:
			periodArt = "Renaissance";
			break;
		case CLASSICISM:
			periodArt = "Classicism";
			break;
		case MODERN:
			periodArt = "Modern";
			break;
		case NEOCLASSICISM:
			periodArt = "Neoclassicism";
			break;
		}
		return String
				.format("ArtWorks Author: %s\nName: %s\nID: %s\nDescription: %s\nPeriod: %s\n",
						authorName, super.getName(), super.getId(),
						super.getDescription(), periodArt);
	}

	/**
	 * Equals method for comparing two ArtWork objects
	 * 
	 * @param other
	 *            ArtWork to compare with
	 * @return true if art works are same, false if not same
	 */
	public boolean equals(ArtWorks other) {
		return this.authorName.equals(other.authorName)
				&& this.period == other.period;
	}

	@Override
	public boolean fitsSearch(String s) {
		return super.fitsSearch(s);
	}

	@Override
	public int compareTo(Exponate o) {
		return super.compareTo(o);
	}
}
