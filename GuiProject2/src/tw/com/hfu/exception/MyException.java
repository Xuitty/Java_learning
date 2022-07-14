/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.exception;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class MyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException() {

	}

	public MyException(String message) {
		super(message);
	}
}
