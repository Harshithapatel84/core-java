package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InvestmentDetailDTO implements Serializable{
    private String investorName;
    private String location;
    private Long phone_number;
    private Double minInvestment;
    private Double maxInvestment;
}
