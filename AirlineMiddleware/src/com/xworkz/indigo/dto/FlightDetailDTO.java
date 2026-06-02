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

public class FlightDetailDTO implements Serializable {

    private TripType tripType;
    private String fromaddress;
    private String toAddress;
    private LocalDate departure;
    private Integer noOfPassenger;

}
