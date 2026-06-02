package com.xworkz.airIndia.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CabSearchDTO {
    private String from;
    private String to;
    private LocalDate pichUpDate;
    private LocalTime pickUpTime;

}
