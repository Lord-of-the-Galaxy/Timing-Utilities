package lord_of_galaxy.timing_utils;

import processing.core.PApplet;

/**
 * Class for keeping time.
 * 
 * <p>
 * Part of Timing Utilities library containing a number of useful classes for time-keeping in Processing.
 * <br>
 * Built using Eclipse Mars IDE.
 * </p>
 * @author Lord of Galaxy
 * 
 * @version 0.1b
 * 
 * @since 0.1b
 */
public class Stopwatch {
	private int start = 0;
	private int pausedTime = 0;
	private boolean paused = false;
	private PApplet parent;

	/**
	 * Constructor for creating a Stopwatch
	 * 
	 * @param parent The parent PApplet (Processing sketch) that uses this instance
	 */
	public Stopwatch(PApplet parent) {
		this.parent = parent;
		pausedTime = 0;
		paused = true;
		start = parent.millis() - pausedTime;
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
		paused = true;
		pausedTime = parent.millis() - start;
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
		int time = 0;
		if (!paused) {
			time = parent.millis() - start;
		} else {
			time = pausedTime;
		}
		return time;
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
		return (time() / 1000) % 60;
	}

	/**
	 * @return Returns the current no of minutes as per the stopwatch
	 */
	public int minute() {
		return (time() / 60000) % 60;
	}

	/**
	 * @return Returns the current no of hours as per the stopwatch
	 */
	public int hour() {
		return time() / 3600000;
	}

	/**
	 * @return Returns true if the stopwatch is paused, false otherwise
	 */
	public boolean isPaused() {
		return paused;
	}
}
