package ba.bitcamp.task03.w6d1.vjezbe;

public class Clock implements WriteableClock {

	private int hour;
	private int minutes;
	private int seconds;

	
	
	
	/**
	 * @param hour
	 * @param minutes
	 * @param seconds
	 */
	public Clock(int hour, int minutes, int seconds) {
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}




	@Override
	public void addToFile(String filename, int format) {

		if (format == MILITARY_FORMAT) {
			String s = hour + ":" + minutes + ":" + seconds;
			writeToFile(filename, s);
		} else if (format == AMPM_FORMAT) {
			if (hour > 12) {
				hour -= 12;
			}
			String s = hour + ":" + minutes + ":" + seconds;
			writeToFile(filename, s);
		} else if (format == AMPM_FORMAT_NO_SECONDS) {
			String s = hour + ":" + minutes;
			writeToFile(filename, s);
		} else if (format == MILITARY_FORMAT_NO_SECONDS) {
			String s = hour + ":" + minutes;
			writeToFile(filename, s);
		}
	}

}
