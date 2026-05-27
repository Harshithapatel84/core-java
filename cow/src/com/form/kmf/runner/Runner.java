package com.form.kmf.runner;

import com.form.kmf.dto.KmfDetailDTO;
import com.form.kmf.service.KmfDetailservice;
import com.form.kmf.service.impl.KmfDetailserviceImpl;

public class Runner {
    public static void main(String[] args) {
        KmfDetailservice kmfDetailservice=new KmfDetailserviceImpl();
        KmfDetailDTO kmfDetailDTO=new KmfDetailDTO("tumkur",50,"cow milk",100.0,
                "12-05-2026");
        kmfDetailservice.validateAndSave(kmfDetailDTO);
    }
}
