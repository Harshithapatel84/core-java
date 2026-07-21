package com.xworkz.map.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class HouseDTO {

    private int houseId;
    private String ownerName;
    private String address;
}
