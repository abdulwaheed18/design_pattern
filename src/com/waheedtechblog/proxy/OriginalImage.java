/**
 * 
 */
package com.waheedtechblog.proxy;

/**
 * Implement Image, Can be used as downloading image server
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class OriginalImage implements Image {

	@Override
	public void getImage() {
		System.out.println("Loading original Image...");

	}

}
