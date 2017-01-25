package lord_of_galaxy.timing_utils;

import processing.core.PApplet;

/**
 * Class for keeping time.
 * 
 * <p>
 * Part of Timing Utilities library containing a number of useful classes
 * for time-keeping in Processing.<br>
 * Built using Eclipse Mars IDE.
 * </p>
 * @author Lord of Galaxy
 * 
 * @version 0.1b
 * 
 * @since 0.1b
 */
public class Stopwatch {
	protected final PApplet parent;
	protected int start, pausedTime;
	protected boolean paused = true;

	/**
	 * Constructor for creating a Stopwatch
	 * 
	 * @param parent The parent PApplet (Processing sketch) that uses this instance
	 */
	public Stopwatch(final PApplet pa) {
		start = (parent = pa).millis();
	}

	/**
	 * Starts the stopwatch
	 */
	public void start() {
		start = parent.millis() - pausedTime;
		paused = false;
	}

	/**
	 * Pauses the stopwatch
	 */
	public void pause() {
		pausedTime = parent.millis() - start;
		paused = true;
	}

	/**
	 * Resets the stopwatch to 0.
	 */
	public void reset() {
		start = parent.millis();
		this.pause();
	}

	/**
	 * Restarts the stopwatch - resets to 0 then starts the stopwatch.
	 */
	public void restart() {
		reset();
		start();
	}

	/**
	 * @return Returns the current time in milliseconds as per the stopwatch
	 */
	public int time() {
		return paused? pausedTime : parent.millis() - start;
	}

	/**
	 * @return Returns the current no of milliseconds as per the stopwatch
	 */
	public int millis() {
		return time() % 1000;
	}

	/**
	 * @return Returns the current no of seconds as per the stopwatch
	 */
	public int second() {
		return time() / 1000 % 60;
	}

	/**
	 * @return Returns the current no of minutes as per the stopwatch
	 */
	public int minute() {
		return time() / 60_000 % 60;
	}

	/**
	 * @return Returns the current no of hours as per the stopwatch
	 */
	public int hour() {
		return time() / 3_600_000;
	}

	/**
	 * @return Returns true if the stopwatch is paused, false otherwise
	 */
	public boolean isPaused() {
		return paused;
	}

	/**
	 * @return Overrides toString() in order to get instance variables' state
	*/
	@Override 
	public String toString() {
		return "start: " + start + ", pausedTime: " + pausedTime + ", paused: " + paused;
	}
}
