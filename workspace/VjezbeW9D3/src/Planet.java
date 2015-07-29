import java.util.Arrays;
import java.util.Comparator;

public class Planet implements Comparable<Planet> {

	private static final double EARTH_MASS = 5.97E24;
	private static final double EARTH_SUN_DISTANCE = 150E6;

	private String name;
	private double diameter;
	private double mass;
	private double distance;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param diameter
	 * @param mass
	 * @param distance
	 */
	public Planet(String name, double diameter, double mass, double distance) {
		this.name = name;
		this.diameter = diameter;
		this.mass = mass;
		this.distance = distance;
	}

	/*
	 * Getters and setters
	 */
	public String getName() {
		return name;
	}

	public double getDiameter() {
		return diameter;
	}

	public double getMass() {
		return mass;
	}

	public double getDistance() {
		return distance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	/*
	 * toString
	 */
	@Override
	public String toString() {

		return name + " ( " + diameter + " km) [ " + (mass * EARTH_MASS)
				+ " kg] " + "{ " + (distance * EARTH_SUN_DISTANCE) + " km}\n";
	}

	/*
	 * compareTo
	 */
	@Override
	public int compareTo(Planet o) {
		return this.name.compareTo(o.name);
	}

	public static void sortByDiameter(Planet[] array) {
		Arrays.sort(array, new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return Double.compare(o2.diameter, o1.diameter);
			}

		});
	}

	public static void sortByMass(Planet[] array) {
		Arrays.sort(array, new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return Double.compare(o2.mass, o1.mass);
			}

		});
	}

	public static void sortByDistance(Planet[] array) {
		Arrays.sort(array, new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return Double.compare(o2.distance, o1.distance);
			}

		});
	}
}
