package ba.bitcamp.test;

public class Artifacts extends Exponate {

	// Variables
	private String origin;
	private PeriodArtifact period;

	/**
	 * Constructor for creating Artifacts object
	 * 
	 * @param name
	 * @param description
	 * @param origin
	 * @param period
	 */
	public Artifacts(String name, String description, String origin,
			PeriodArtifact period) {
		super(name, description);

		this.origin = origin;
		this.period = period;
	}

	// Getters and setters
	public String getOrigin() {
		return origin;
	}

	public PeriodArtifact getPeriod() {
		return period;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setPeriod(PeriodArtifact period) {
		this.period = period;
	}

	/**
	 * toString method
	 */
	@Override
	public String toString() {
		String periodArtifact = "";
		switch (period) {

		case MIDDLEAGES:
			periodArtifact = "Middle Ages";
			break;
		case CLASSICISM:
			periodArtifact = "Classicism";
			break;
		case MODERN:
			periodArtifact = "Modern";
			break;
		default:
			break;
		}
		return String
				.format(""
						+ "Artifact Name: %s\nOrigin: %s\nID: %s\nDescription: %s\nPeriod: %s\n",
						super.getName(), origin, super.getId(),
						super.getDescription(), periodArtifact);
	}

	/**
	 * Equals method to compare two Artifacts objects
	 * 
	 * @param other
	 *            Artifacts to compare with
	 * @return true if artifacts are same, false if not same
	 */
	public boolean equals(Artifacts other) {
		return this.origin.equals(other.origin) && this.period == other.period;
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
