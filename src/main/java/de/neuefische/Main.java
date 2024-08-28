package de.neuefische;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //List, Set, Map

        //Set
        Set<String> names = new HashSet<>();

        //Add Values
        names.add("Thomas");
        names.add("Thomas");
        names.add("Maria");
        names.add("Stefanie");
        names.add("Stefan");
        names.add("Mareike");
        names.add("Claudia");

        //Remove Values
        names.remove("Maria");

        //Is Value present?
        boolean x = names.contains("Stefan");

        //How many Values
        int y = names.size();


        //Map -> Key, Value
        Map<String, Person> currywurst = new HashMap<>();

        Person person1 = new Person("123", "Thomas", 35);
        Person person2 = new Person("456", "Maria", 31);

        //Add Values
        currywurst.put(person1.getSocialSecNum(), person1);
        currywurst.put(person2.getSocialSecNum(), person2);

        System.out.println(currywurst);

        //Get Value from Map
        System.out.println(currywurst.get("123"));

        //Just get Values
        System.out.println(currywurst.values());

        //Just get Keys
        System.out.println(currywurst.keySet());

        //Remove Object
        currywurst.remove("1");

        //Check if key exists
        boolean isPresent = currywurst.containsKey("1");

    }
}