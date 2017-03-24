package com.waheedtechblog.adaptor;

/**
 * STRUCTURAL DESIGN PATTERN
 * 
 * Adapter pattern works as a bridge between two incompatible interfaces.This
 * pattern involves a single class which is responsible to join functionalities
 * of independent or incompatible interfaces.
 * 
 * The real life example of this pattern can be mobile charger or card reader.
 * 
 * In JDK 
 * java.util.Arrays#asList()
 * java.io.InputStreamReader(InputStream) & OutputStreamWriter
 * 
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class AdaptorTester {

	public static void main(String[] args) {
		CardAdaptor adaptor = new CardAdaptorImpl();

		LaptopAdaptor laptopAdaptor = new LaptopAdaptor();

		// Origina Speed
		System.out.println("laptop data speed: " + laptopAdaptor.getLaptopSpeed().getSpeed());

		// Speed supported by Ultra Adaptor
		System.out.println("Ultra Adaptor data speed: " + adaptor.getUltraSDAdaptor().getSpeed());

		// Speed supported by Micro Adaptor
		System.out.println("Micor Adaptor data speed: " + adaptor.getMicroSDAdaptor().getSpeed());
	}

}
