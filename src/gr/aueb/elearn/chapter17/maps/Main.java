package gr.aueb.elearn.chapter17.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("GR","Greece");
        countries.put("FR","France");
        countries.put("US","USA");
        countries.put("IT","Italy");

        Iterator<Map.Entry<String,String>> it = countries.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
            for (Map.Entry<String,String> entry : countries.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        countries.forEach((k,v)->System.out.println(k + " " + v));
    }
}
