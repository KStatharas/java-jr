package gr.aueb.elearn.chapter17.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("Athens","London","Paris"));
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apples",8.600,5));
        products.add(new Product("Milk",7.600,9));
        products.add(new Product("Honey",5.400,7));



        List<Product> appleProducts = products.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .sorted(Comparator.comparingInt(Product::getQuantity))
                .collect(Collectors.toList());

        appleProducts.forEach(System.out::println);

        List<Double> priceProducts = products.stream()
                        .map(Product::getPrice)
                                .collect(Collectors.toList());
        priceProducts.forEach(System.out::println);

        List<Product> honeyProducts = products.stream()
        .filter(product -> product.getDescription().equals("Honey"))
                .map(e->new Product(e.getDescription(), e.getPrice() + e.getPrice() * 0.1,e.getQuantity())
                                .collect(Collectors.toList())
                                        .forEach(System.out::println);
        appleProducts.forEach(System.out::println);

                int appleCount = products.stream()
                        .filter(product -> product.getDescription().equals("Apples"))
                        .mapToInt(Product::getQuantity)
                        .sum();
        System.out.println(appleCount);



//        products.sort(Comparator.comparing(Product::getDescription)
//                .thenComparingInt(Product::getQuantity)
//                .thenComparingDouble(Product::getPrice,(a1, a2) -> Double.compare(a2,a1))
//                .reversed());
//
//        products.forEach(System.out::println);





//        Collections.sort(products);
//        products.forEach(System.out::println);
//
//        Collections.reverse(products);
//        products.forEach(System.out::println);




//        Product myProduct = new Product("Apples",8.600,5);
//
//        if (products.contains(myProduct)) products.remove(myProduct);
//
//        products.set(1,new Product("Oranges",1.533,2));
//
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.println(cities.get(i));
//        }
//
//        for (String city : cities){
//            System.out.println(city);
//        }
//
//        Iterator<String> it = cities.iterator();
//
//        while (it.hasNext()){
//            String city = it.next();
//            if (city.equals("Athens")) it.remove();
//            System.out.println(city);
//        }
//
//        cities.forEach((city)-> System.out.println(city));
//        cities.forEach(System.out::println);
//
////        cities.removeIf(s->s.)
    }



}
