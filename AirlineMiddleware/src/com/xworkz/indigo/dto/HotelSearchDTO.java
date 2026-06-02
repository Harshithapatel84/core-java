package com.xworkz.indigo.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class HotelSearchDTO implements Serializable {
    private String destination;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Integer noOfRoom;
}
