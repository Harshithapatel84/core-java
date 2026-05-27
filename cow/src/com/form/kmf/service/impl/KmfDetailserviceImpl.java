package com.form.kmf.service.impl;

import com.form.kmf.dto.KmfDetailDTO;
import com.form.kmf.service.KmfDetailservice;

public class KmfDetailserviceImpl implements KmfDetailservice {

    @Override
    public boolean validateAndSave(KmfDetailDTO detailDTO) {
        System.out.println("entering data:"+detailDTO);
        return false;
    }
}
