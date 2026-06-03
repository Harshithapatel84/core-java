package com.xworkz.plane.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class FlightStatusDTO {
    private String pnr;
    private LocalDate travelDate;
}
