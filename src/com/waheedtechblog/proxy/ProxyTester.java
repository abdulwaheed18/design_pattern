/**
 * 
 */
package com.waheedtechblog.proxy;

/**
 * proxy means object representing another object.
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class ProxyTester {

	public static void main(String args[]) {

		// Image: Interface to getImage
		// OriginalImage: Treat it as a Image Server downloading original image
		// ProxyImage: Treat it as a ProxyImage which will compress the original
		// image and this proxy can be used in front of mobile networks
		
		Image image = new ProxyImage();
		image.getImage();
	}

}
