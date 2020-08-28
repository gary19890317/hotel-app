package com.itexico.hotel.config;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.itexico.hotel.model.Reservation;
import com.itexico.hotel.repository.ReservationRepository;

@Component
public class DataBaseInitializer implements CommandLineRunner{

	@Autowired
	private ReservationRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Reservation(LocalDateTime.now(), "Gary"));
		repo.save(new Reservation(LocalDateTime.now().plusDays(5), "Maria"));
		repo.save(new Reservation(LocalDateTime.now().plusDays(3), "Laura"));
		repo.save(new Reservation(LocalDateTime.now().plusDays(9), "Julian"));
	}

}
