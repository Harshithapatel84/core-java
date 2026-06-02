package com.xworkz.indigo.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SearchSightDetailDTO {
    private  String destination;
    private LocalDate date;
}
