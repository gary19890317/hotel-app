package com.itexico.hotel.exeption;

public class ReservationEmptyException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3210731611319494279L;

	public ReservationEmptyException() {
		super("The hotel does not have any reservation yet");
	}
}
