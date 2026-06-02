package com.xworkz.airIndia.service;

import com.xworkz.airIndia.dto.CabSearchDTO;

public interface CabSearchService {
    boolean validateAndSave(CabSearchDTO searchDTO);
}
