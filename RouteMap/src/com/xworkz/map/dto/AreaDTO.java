package com.xworkz.map.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AreaDTO {
    private String name;
    private Integer pincode;
    private String city;
}
