package com.xworkz.indigo.service;

import com.xworkz.indigo.dto.SearchSightDetailDTO;

public interface SearchSightService {
    boolean validateAndSave(SearchSightDetailDTO detailDTO);
}
