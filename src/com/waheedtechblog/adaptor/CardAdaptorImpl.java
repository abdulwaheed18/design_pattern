/**
 * 
 */
package com.waheedtechblog.adaptor;

/**
 * Adaptor pattern using Inheritance, if you cannot extent the LaptopAdaptor
 * then use composition to create object of LaptopAdaptor
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class CardAdaptorImpl extends LaptopAdaptor implements CardAdaptor {

	// use composition when you cannot extent Adaptee class
	// private LaptopAdaptor laptopAdaptor = new LaptopAdaptor();

	@Override
	public DataSpeed getUltraSDAdaptor() {
		// UltraSD adaptor usually has better data transfer rate as compared to
		// Micro adaptor
		DataSpeed speed = getLaptopSpeed();
		return new DataSpeed(speed.getSpeed() / 2);

	}

	@Override
	public DataSpeed getMicroSDAdaptor() {
		DataSpeed speed = getLaptopSpeed();
		return new DataSpeed(speed.getSpeed() / 4);

	}

}
