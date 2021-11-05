package Lesson3.Ex2;

import java.util.HashMap;
import java.util.Map;

public class AdressBook {

    Map<String, String> book = new HashMap<>();

    public void add(String name, String phone) {
        book.put(phone, name);
    }

    public void get(String name) {

    for (Map.Entry<String, String> e: book.entrySet()) {
        if (e.getValue().equals(name)) {
            System.out.println(e.getValue() + " " + e.getKey());
        }
    }
    }
}
