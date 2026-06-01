package com.form.kmf.dao.impl;

import com.form.kmf.dao.KmfDetailDAO;
import com.form.kmf.dto.KmfDetailDTO;

public class KmfDetailDAOImpl implements KmfDetailDAO {
    @Override
    public void store(KmfDetailDTO kmfDetailDTO) {
        System.out.println("storing the kmf details....");
    }
}
