package com.xworkz.indigo.dao.impl;

import com.xworkz.indigo.dao.SearchSightDAO;
import com.xworkz.indigo.dto.SearchSightDetailDTO;

public class SearchSightDaoImpl implements SearchSightDAO {
    @Override
    public boolean search(SearchSightDetailDTO detailDTO) {
        System.out.println("searching  sight..");
        return false;
    }
}
