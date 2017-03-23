/**
 * 
 */
package com.waheedtechblog.singleton;

/**
 * 
 * Ensure that only one instance of a class is created and Provide a global
 * access point to the object.
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class SingletonUsingInnerStaticClass {

	/*
	 * Prevent to instantiate the Singleton class from outside the class.
	 */
	private SingletonUsingInnerStaticClass() {

	}

	private static class SingletonInnerClass {
		private static final SingletonUsingInnerStaticClass INSTANCE = new SingletonUsingInnerStaticClass();
	}

	public static SingletonUsingInnerStaticClass getInstance() {
		return SingletonInnerClass.INSTANCE;
	}

}
