package com.itexico.hotel.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itexico.hotel.dto.ReservationDTO;
import com.itexico.hotel.model.Reservation;
import com.itexico.hotel.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements IReservationService{

	@Autowired
	private ReservationRepository repo;
	
	@Override
	public List<ReservationDTO> getAllReservations() {
		return repo.findAll().stream()
				.map(this::convertToDTO)
				.collect(Collectors.toCollection(ArrayList::new));
	}

	/**
	 * 
	 * @param reservation
	 * @return
	 */
	private ReservationDTO convertToDTO(Reservation reservation) {
		ReservationDTO dto = new ReservationDTO(reservation.getId(), reservation.getName(), 
			reservation.getTime());
		return dto;
	}
	
}
