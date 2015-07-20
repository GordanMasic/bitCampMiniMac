package ba.bitcamp.Objects;

public class Application {

	private String name;
	private int year;
	private String version;
	private double size;
	public Application(String name, int year, String version, double size) {
		super();
		this.name = name;
		this.year = year;
		this.version = version;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public String getVersion() {
		return version;
	}
	public double getSize() {
		return size;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public void setSize(double size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return String.format(
				"Application [name=%s, year=%s, version=%s, size=%s]", name,
				year, version, size);
	}
	
	
}
