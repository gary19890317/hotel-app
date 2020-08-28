package com.itexico.hotel.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import com.itexico.hotel.dto.ReservationDTO;
import com.itexico.hotel.model.Reservation;
import com.itexico.hotel.repository.ReservationRepository;

@SpringBootTest
public class ReservationServiceImplIntegrationTest {
	
	@Autowired
    private IReservationService reservationSvc;
 
    @MockBean
    private ReservationRepository repo;
    
    @Test
    public void whenGetAllReservations_thenReservationListShouldBeReturned() {
    	Mockito.when(repo.findAll()).thenReturn(Arrays.asList(
        	new Reservation(LocalDateTime.now(), "Gary"),
        	new Reservation(LocalDateTime.now().plusDays(5), "Maria"),
        	new Reservation(LocalDateTime.now().plusDays(3), "Laura"),
        	new Reservation(LocalDateTime.now().plusDays(9), "Julian")));
        	
    	List<ReservationDTO> list = reservationSvc.getAllReservations();
    	
    	Assert.notEmpty(list, "The list of reservations is empty");
    	Mockito.verify(repo, Mockito.times(1)).findAll();
    }
 
}
