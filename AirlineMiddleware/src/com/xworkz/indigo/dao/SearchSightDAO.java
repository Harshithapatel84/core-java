package com.xworkz.indigo.dao;

import com.xworkz.indigo.dto.SearchSightDetailDTO;

public interface SearchSightDAO {
    boolean search(SearchSightDetailDTO detailDTO);
}
