package com.xworkz.country.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class SnackDTO implements Serializable,Comparable<SnackDTO> {

    private String name;
    private String flavor;
    private double weight;
    private double price;

    @Override
    public int compareTo(SnackDTO o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SnackDTO snackDTO = (SnackDTO) o;
        return Double.compare(weight, snackDTO.weight) == 0 && Double.compare(price, snackDTO.price) == 0 && Objects.equals(name, snackDTO.name) && Objects.equals(flavor, snackDTO.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flavor, weight, price);
    }
}
