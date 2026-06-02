package com.xworkz.indigo.service.impl;

import com.xworkz.indigo.dao.SearchSightDAO;
import com.xworkz.indigo.dto.SearchSightDetailDTO;
import com.xworkz.indigo.service.SearchSightService;

public class SearchSightServiceImpl implements SearchSightService {
    private SearchSightDAO searchSightDAO;
    public SearchSightServiceImpl(SearchSightDAO searchSightDAO)
    {
        this.searchSightDAO=searchSightDAO;
    }
    @Override
    public boolean validateAndSave(SearchSightDetailDTO detailDTO) {
        if(this.searchSightDAO!=null)
        {
            System.out.println("sight  detail is not null");
            return  true;
        }
        else{
            System.out.println("sight cannot be null");
        }
        return false;
    }
}
