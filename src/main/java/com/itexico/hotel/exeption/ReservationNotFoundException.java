package com.itexico.hotel.exeption;

public class ReservationNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -258613024857214727L;
	
	public ReservationNotFoundException(String id) {
		super("Reservation [ " + id + "] not found");
	}

}
