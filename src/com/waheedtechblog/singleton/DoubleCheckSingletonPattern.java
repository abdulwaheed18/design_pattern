package com.waheedtechblog.singleton;

/**
 * Ensure that only one instance of a class is created and Provide a global
 * access point to the object.
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class DoubleCheckSingletonPattern {
	private static volatile DoubleCheckSingletonPattern instance;

	/*
	 * Prevent to instantiate the Singleton class from outside the class.
	 */
	private DoubleCheckSingletonPattern() {

	}

	/**
	 * provides the global point of access to the Singleton object and returns
	 * the instance to the caller.
	 * 
	 * @return instance
	 */
	public static DoubleCheckSingletonPattern getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckSingletonPattern.class) {
				if (instance == null) {
					// instance will be created at request time
					instance = new DoubleCheckSingletonPattern();
				}
			}
		}
		return instance;
	}

}
