package com.xworkz.product.runner;

import com.xworkz.product.dto.CustomerDTO;
import com.xworkz.product.dto.OrderDTO;
import com.xworkz.product.dto.ProductDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ProductRunner {
    public static void main(String[] args) {
        ProductDTO productDTO=new ProductDTO("Vs01","vaseline","cosmetics");
        ProductDTO productDTO1=new ProductDTO("Hr87","horlics","powder");

        Collection<ProductDTO> productDTOS=new ArrayList<>();
        productDTOS.add(productDTO);
        productDTOS.add(productDTO1);

        System.out.println("total products:"+productDTOS.size());

        System.out.println("------------------------------------------------------------");

        CustomerDTO customerDTO=new CustomerDTO("cs45","rakesh","rkh@gmail.com",6754234576L,"bangalore");
        CustomerDTO customerDTO1=new CustomerDTO("gh76","riya","gyrx@gmail.com",876543L,"tumkur");
        CustomerDTO customerDTO2=new CustomerDTO("yt76","rita","rita@gmail.com",67543278L,"mysore");
        HashSet<CustomerDTO> customerDTOS=new HashSet<>();
        customerDTOS.add(customerDTO);
        customerDTOS.add(customerDTO1);
        customerDTOS.add(customerDTO2);

        System.out.println("added successfully");
        System.out.println("-----------------------------------------------------------------");

        OrderDTO orderDTO=new OrderDTO("34","56", LocalDate.of(2026,8,27),"Preparing",786.90);
        Collection<OrderDTO> orderDTOS=new ArrayList<>();
        orderDTOS.add(orderDTO);
    }
}
