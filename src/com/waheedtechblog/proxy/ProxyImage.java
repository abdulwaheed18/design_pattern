/**
 * 
 */
package com.waheedtechblog.proxy;

/**
 * Class represent proxyImage
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class ProxyImage implements Image {

	Image originalImage = null;

	public ProxyImage() {
		originalImage = new OriginalImage();
	}

	@Override
	public void getImage() {
		System.out.println("Proxy connecting to Original image server");
		originalImage.getImage();
		System.out.println("Compressing the original Image on proxy Server");
	}

}
