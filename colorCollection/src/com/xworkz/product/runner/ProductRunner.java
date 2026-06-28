package com.xworkz.product.runner;

import com.xworkz.product.dto.*;

import java.time.LocalDate;
import java.util.*;

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

        System.out.println("--------------------------------------------------");

        EmployeeDTO employeeDTO=new EmployeeDTO("4AI34","roshan","executive","software engineer",560000.0);
        Collection<EmployeeDTO> employeeDTOS=new ArrayList<>();
        employeeDTOS.add(employeeDTO);

        System.out.println("-----------------------------------------------------");
        InventortDTO inventortDTO1 = new InventortDTO("45A1", "Notebook", "Excellent", "Bengaluru", "ABC Suppliers");
        InventortDTO inventortDTO2 = new InventortDTO("23B7", "Eraser", "Good", "Mysuru", "XYZ Traders");
        InventortDTO inventortDTO3 = new InventortDTO("91C9", "Marker", "Average", "Tumakuru", "PQR Stationers");
        HashSet<InventortDTO> inventortDTOS=new HashSet<>();
        inventortDTOS.add(inventortDTO1);
        inventortDTOS.add(inventortDTO2);
        inventortDTOS.add(inventortDTO3);

        System.out.println("-------------------------------------------------");

        DiscountDTO discountDTO=new DiscountDTO("45B01","AB01","good quality product",97.9,LocalDate.of(2026,8,15));
        DiscountDTO discountDTO1 = new DiscountDTO("45B02", "AB02", "Festival offer", 120.50, LocalDate.of(2026, 9, 10));
        DiscountDTO discountDTO2 = new DiscountDTO("45B03", "AB03", "Seasonal discount", 250.75, LocalDate.of(2026, 10, 5));
        DiscountDTO discountDTO3 = new DiscountDTO("45B04", "AB04", "Clearance sale", 89.99, LocalDate.of(2026, 11, 20));
        DiscountDTO discountDTO4 = new DiscountDTO("45B05", "AB05", "New customer offer", 150.00, LocalDate.of(2026, 12, 25));
        LinkedHashSet<DiscountDTO> discountDTOS=new LinkedHashSet<>();
        discountDTOS.add(discountDTO1);
        discountDTOS.add(discountDTO2);
        discountDTOS.add(discountDTO);
        discountDTOS.add(discountDTO3);
        discountDTOS.add(discountDTO4);

        System.out.println("----------------------------------------------------------");

        CategoryDTO categoryDTO1 = new CategoryDTO("C001", "Stationery", "Office and school stationery", "P001", "Active");
        CategoryDTO categoryDTO2 = new CategoryDTO("C002", "Electronics", "Electronic gadgets and accessories", "P002", "Active");
        CategoryDTO categoryDTO3 = new CategoryDTO("C003", "Furniture", "Home and office furniture", "P003", "Inactive");
        CategoryDTO categoryDTO4 = new CategoryDTO("C004", "Groceries", "Daily household grocery items", "P004", "Active");
        CategoryDTO categoryDTO5 = new CategoryDTO("C005", "Sports", "Sports equipment and accessories", "P005", "Active");
        Collection<CategoryDTO> categoryDTOS =new ArrayList<>();
        categoryDTOS.add(categoryDTO1);
        categoryDTOS.add(categoryDTO2);
        categoryDTOS.add(categoryDTO3);
        categoryDTOS.add(categoryDTO4);
        categoryDTOS.add(categoryDTO5);
        System.out.println("---------------------------------------------------");


        ReviewDTO reviewDTO1 = new ReviewDTO("R001", "P001", "C001", 4.5, "Excellent product");
        ReviewDTO reviewDTO2 = new ReviewDTO("R002", "P002", "C002", 3.8, "Good quality");
        ReviewDTO reviewDTO3 = new ReviewDTO("R003", "P003", "C003", 5.0, "Highly recommended");
        ReviewDTO reviewDTO4 = new ReviewDTO("R004", "P004", "C004", 2.9, "Average performance");
        Collection<ReviewDTO> reviewDTOS=new HashSet<>();
        reviewDTOS.add(reviewDTO1);
        reviewDTOS.add(reviewDTO2);
        reviewDTOS.add(reviewDTO3);
        reviewDTOS.add(reviewDTO4);
            }
        }
        
