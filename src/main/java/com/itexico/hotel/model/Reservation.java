package com.itexico.hotel.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Reservation {
	@Id
	@GeneratedValue
	private long id;
	@NonNull
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime time;
	@NonNull
	private String name;
}
