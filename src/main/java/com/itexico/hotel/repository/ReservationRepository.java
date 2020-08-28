package com.itexico.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itexico.hotel.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
