package com.waheedtechblog.adaptor;

/**
 * This class will act as a Adaptee class where we have existing features
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class LaptopAdaptor {

	// just assume laptop data speed is 100MBps
	public DataSpeed getLaptopSpeed() {
		return new DataSpeed(100);
	}

}
