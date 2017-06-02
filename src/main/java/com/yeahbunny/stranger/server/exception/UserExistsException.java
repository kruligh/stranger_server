package com.yeahbunny.stranger.server.exception;

public class UserExistsException extends Exception {
	
	private static final long serialVersionUID = 1L;

	
	public UserExistsException() {
		super();
	}


	public UserExistsException(String msg) {
		super(msg);
	}

}
