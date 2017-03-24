/**
 * 
 */
package com.waheedtechblog.adaptor;

/**
 * Assume each adaptor has their own reading and writing speed
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public interface CardAdaptor {

	public DataSpeed getUltraSDAdaptor();

	public DataSpeed getMicroSDAdaptor();

}
