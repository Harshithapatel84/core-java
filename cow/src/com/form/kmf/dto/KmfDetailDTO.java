package com.form.kmf.dto;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class KmfDetailDTO implements Serializable {
    private String location;
    private Integer noOfBranch;
    private String milkType;
    private  Double  quantity;
    private  String date;
}
