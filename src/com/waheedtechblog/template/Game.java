/**
 * 
 */
package com.waheedtechblog.template;

/**
 * Abstract class for the game design and other class can extend the base class
 * and define the initialization in their own way
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public abstract class Game {

	abstract void initialize();

	abstract void start();

	abstract void stop();

	public final void play() {
		initialize();
		start();
		stop();
	}
}
