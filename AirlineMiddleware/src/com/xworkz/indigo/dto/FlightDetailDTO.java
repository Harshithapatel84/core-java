package com.xworkz.indigo.dto;

import com.xworkz.indigo.constant.TripType;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class FlightDetailDTO  {

    private TripType tripType;
    private String from;
    private String to;
    private LocalDate departure;
    private Integer noOfPassenger;

}
