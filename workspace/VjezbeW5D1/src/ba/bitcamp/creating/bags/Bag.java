package ba.bitcamp.creating.bags;
public class Bag {

	private Integer maxCapacity;
	private Integer usedCapacity = 0;

	/**
	 * Constructor for creating bag objects
	 * 
	 * @param maxCapacity
	 *            maximal capacity
	 */
	public Bag(int maxCapacity) {
		super();
		this.maxCapacity = maxCapacity;

	}

	/**
	 * Returns maximal capacity value
	 * 
	 * @return maximal capacity
	 */
	public Integer getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * Returns used capacity value
	 * 
	 * @return used capacity
	 */
	public Integer getUsedCapacity() {
		return usedCapacity;
	}

	/**
	 * Returns how many free space is in a bag
	 * 
	 * @return free space
	 */
	public Integer getFreeSpace() {
		Integer freeSpace;
		freeSpace = maxCapacity - usedCapacity;
		return freeSpace;
	}

	/**
	 * Adds stuff to bag if it is possible
	 * 
	 * @param number
	 *            number of stuff that has to be added
	 */
	public void add(Integer number) {
		if (usedCapacity + number <= maxCapacity) {
			usedCapacity += number;
		} else {
			System.out.println("Can't do it! Free space in the bag is: "
					+ getFreeSpace());
		}

	}

	/**
	 * Removes stuff from bag if it is possible
	 * 
	 * @param number
	 *            number of stuff that has to be removed
	 */
	public void remove(Integer number) {
		if (usedCapacity - number >= 0) {
			usedCapacity -= number;
		} else {
			System.out.println("Can't do it!");
		}

	}
}
