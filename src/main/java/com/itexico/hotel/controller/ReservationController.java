package com.itexico.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itexico.hotel.dto.ReservationDTO;
import com.itexico.hotel.service.IReservationService;

@RestController
public class ReservationController {

	@Autowired
	private IReservationService svc;
	
	@GetMapping("/reservations")
	public List<ReservationDTO> findAllReservations(){
		return svc.getAllReservations();
	}
	
}
