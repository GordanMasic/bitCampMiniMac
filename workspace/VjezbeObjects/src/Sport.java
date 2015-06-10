public class Sport {

	private String name;
	private boolean teamSport;
	private String terrain;
	private int yearWhenInvented;
	private boolean olympic;
	private String prop;

	public Sport(String n, boolean ts,String ter, int year, boolean oly, String p){
		name = n;
		teamSport = ts;
		terrain = ter;
		yearWhenInvented = year;
		olympic = oly;
		prop = p;
	}
	public String toString() {
		String s = "";
		s = s + ("Name: " + name + "\n");
		s = s + ("Team sport: " + teamSport + "\n");
		s = s + ("Terrain: " + terrain + "\n");
		s = s + ("Year when invented: " + yearWhenInvented + "\n");
		s = s + ("Olympic: " + olympic + "\n");
		s = s + ("Props: " + prop + "\n");

		return s;

	}

}
