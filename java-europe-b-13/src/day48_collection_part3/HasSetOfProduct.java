package day48_collection_part3;

import day46_collection_part1.Product;

import java.util.HashSet;
import java.util.Set;

public class HasSetOfProduct {
    public static void main(String[] args) {

        Set<Product> prodSet = new HashSet<>();
        prodSet.add(new Product("book",25.99));
        prodSet.add(new Product("book",17.99));
        prodSet.add(new Product("magazine",7.99));

        System.out.println(prodSet.toString());

        prodSet.forEach(n-> System.out.print(n.getPrice()+"|"));

        System.out.println("");
        for (Product product : prodSet) {
            System.out.print(product.getName()+"|");

        }
        System.out.println("");


    }
}
