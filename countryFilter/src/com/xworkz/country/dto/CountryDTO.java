package com.xworkz.country.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter

public class CountryDTO implements Serializable,Comparable<CountryDTO>{
    private  String name;
    private Integer pincode;
    private String president;
    private String Prime_Minister;

    @Override
    public boolean equals(Object o) {
        System.out.println("running equals");
    return true;
    }

    @Override

    public int hashCode() {
        System.out.println("running hashCode");

        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + pincode;
        result = 31 * result + president.hashCode();
        result = 31 * result + Prime_Minister.hashCode();

        return result;
    }


    @Override
    public int compareTo(CountryDTO o) {
        return this.name.compareTo(o.name);
    }
}

