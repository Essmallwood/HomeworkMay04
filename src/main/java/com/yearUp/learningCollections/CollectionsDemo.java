package com.yearUp.learningCollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
     setDemo(); // calling the method
        mapDemo();

    }

    public static void setDemo(){
        Set <String> fruit = new HashSet();
        fruit.add ("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("lemon");
        fruit.add("orange");


        System.out.println(fruit.size()); // 4 - since they are no duplicates
        System.out.println(fruit); // [banana, orange, apple, lemon]


        // LOOPING THROUGH COLLECTIONS
       var i =  fruit.iterator();
       // iterator will allow us to go through each item in the collection

        // hasNext = has something left in the collection
        while (i.hasNext()){
            System.out.println(i.next());// next - will return an object
            //outputs -
            //banana
            //orange
            //apple
            //lemon
        }

        // ENHANCED FOR LOOP
        for (String item: fruit) {
            System.out.println(item);
            //outputs -
            //banana
            //orange
            //apple
            //lemon
        }

        // FOR EACH LOOP
        fruit.forEach(x -> System.out.println(x)); // ???
        fruit.forEach(System.out::println); // either way works

        //outputs -
        //banana
        //orange
        //apple
        //lemon

    }

    public static void mapDemo(){
        //MAP = unorganized.
        Map <String, Integer> fruitCalories = new HashMap(); // creating the map (HashMap)
        fruitCalories.put ("apple", 20); // PUTTING (adding) key + value
        fruitCalories.put("lemon", 30);
        fruitCalories.put ("banana", 30);
        fruitCalories.put("lemon", 84);
        fruitCalories.put("orange", 24);

        System.out.println(fruitCalories.size()); // 4 - since we can't have duplicate keys
        System.out.println(fruitCalories); // [banana=30, orange=24, apple=20, lemon=84]

        // nameOfMap.get(key) -- in order to get the value of that key
        System.out.println(fruitCalories.get ("lemon")); // gets the updated lemon value which is 84
        System.out.println(fruitCalories.entrySet()); //[banana=30, orange=24, apple=20, lemon=84]

        fruitCalories.remove ("orange"); // removes the item using the key
        System.out.println(fruitCalories); // shows the updated map after the item is removed.
        // outputs - {banana=30, apple=20, lemon=84}

        // ENHANCED FOR LOOP - loop through map
        for (var entry: fruitCalories.entrySet()){
            System.out.println( entry.getValue()); // only print out the values
            System.out.println(entry.getKey()); // only prints out the key
            System.out.println(entry.getKey() + "=" + entry.getValue());
             System.out.println(entry.hashCode()); // ???
            /*
            OUTPUTS
            30 - value
            banana  - key
            banana=30  - key = value
            -1396355205  - hashcode?
            20 - value
            apple - key
            apple=20 - key = value
            93029198 - hashcode?
            84 - value
            lemon - key
            lemon=84 - key + value
            102857383 - hashcode?
             */
        }
        fruitCalories.forEach
                ((k,v) -> System.out.println("Fruit: "
                + k + ", Calories: " + v));
/*
Fruit: banana, Calories: 30
Fruit: apple, Calories: 20
Fruit: lemon, Calories: 84
 */

    }
}
