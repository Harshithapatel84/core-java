package com.xworkz.planet.runner;

import com.xworkz.planet.Address;
import com.xworkz.planet.Product;

public class GenericRunner {
    public static void main(String[] args) {
        Address<String> address=new Address<>();
        address.doorNo="BM506";
        Address<Integer> address1=new Address<>();
        address1.doorNo=587;
        System.out.println(address.doorNo+" "+address1.doorNo);

        Product<String,Double> product=new Product<>();
        product.productId="CS45";
        product.productPrice=78.0;

        Product<Integer,Float> product1=new Product<>();
        product1.productId=54;
        product1.productPrice=840f;

        System.out.println(product.productId+" "+product.productPrice);
        System.out.println(product1.productId+" "+product1.productPrice);


    }
}
