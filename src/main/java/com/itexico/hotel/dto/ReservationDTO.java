package com.itexico.hotel.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservationDTO {
	private long id;
	private String name;
	private LocalDateTime time;
}
