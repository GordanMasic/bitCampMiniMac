public class Place {

	private String name;
	private Place next;

	/**
	 * Constructor for creating Place objects
	 * 
	 * @param name
	 *            initializing variable name
	 */
	public Place(String name) {
		this.name = name;
	}

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public Place getNext() {
		return next;
	}

	public void setNext(Place next) {
		this.next = next;
	}
	
	//toString method
	public String toString(){
		return this.name;
	}
	

}
