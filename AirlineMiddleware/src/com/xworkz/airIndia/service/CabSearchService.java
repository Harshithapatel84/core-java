package com.xworkz.airIndia.service;

import com.xworkz.airIndia.dto.CabSearchDTO;

public interface CabSearchService {
    boolean validateAndSearch(CabSearchDTO searchDTO);
}
