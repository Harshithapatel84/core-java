package com.form.kmf.service.impl;

import com.form.kmf.dto.KmfDetailDTO;
import com.form.kmf.service.KmfDetailservice;

public class KmfDetailserviceImpl implements KmfDetailservice {

    @Override
    public boolean validateAndSave(KmfDetailDTO detailDTO) {
        System.out.println("validate and save data:"+detailDTO);
        if(detailDTO.getMilkType()!=null && detailDTO.getMilkType().length()>=7 && detailDTO.getMilkType().length()<=70)
        {
            System.out.println("valid ");
        }
        else {
            System.out.println("invalid");
        }
        return false;
    }
}
