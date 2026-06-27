package com.xworkz.product.runner;

import com.xworkz.product.dto.ProductDTO;

import java.util.ArrayList;
import java.util.Collection;

public class ProductRunner {
    public static void main(String[] args) {
        ProductDTO productDTO=new ProductDTO("Vs01","vaseline","cosmetics");
        ProductDTO productDTO1=new ProductDTO("Hr87","horlics","powder");

        Collection<ProductDTO> productDTOS=new ArrayList<>();
        productDTOS.add(productDTO);
        productDTOS.add(productDTO1);

        System.out.println("total products:"+productDTOS.size());
    }
}
