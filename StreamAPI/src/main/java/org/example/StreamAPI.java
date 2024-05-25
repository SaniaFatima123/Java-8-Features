package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

class Product{
    private int id;
    private String name;
    private int price;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class StreamAPI {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Samsung", 12000));
        products.add(new Product(1, "Redmi", 8000));
        products.add(new Product(1, "Vivo", 20000));
        products.add(new Product(1, "Oppo", 18000));
        products.add(new Product(1, "Poco", 9000));
        products.add(new Product(1, "Realme", 9000));

        // This line declares a new list named processedData of type List<Integer>.
        // This list will eventually store the extracted prices of the filtered products.

        List<Integer> processedData = products.stream()
                .filter(product -> product.getPrice()<10000)
                .map(product -> product.getPrice()).collect(Collectors.toList());
        System.out.println(processedData);

        products.stream().filter(product -> product.getPrice() == 18000)
                .forEach(product -> System.out.println(product.getName()));

        // find max and min price
        Product productMax = products.stream()
                .max((product1, product2)->product1.getPrice() > product2.getPrice() ? 1: -1).get();
        System.out.println(productMax.getPrice());

        Product productMin = products.stream()
                .min((productA, productB)-> productA.getPrice() > productB.getPrice()? 1: -1).get();
        System.out.println(productMin.getPrice());

        long coun = products.stream().filter((product)->product.getPrice()==9000).count();
        System.out.println(coun);


    }
}
