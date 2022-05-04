package com.yearUp.learningCollections;

import java.util.*;

public class LearningCollection {
// Collection - is an object that holds references to
// to other objects. Objects within the collections
    // are called an element
// Collection is an interface.
    // Set, List,and Queue implement collections
  // set - can not have a duplicate element

    //List - elements are ordered and can contain duplicates.
    /*
    Example of when we may use list: organizing phone numbers
    in our call history

    - Queue - ordered elements for processing. Accessed
    in the order elements were added. (FIFO OR LIFO)
use case: people in a checkout line.

    - Map - unordered unique key-value pairs
    - Map is not a true collection because it doesn't
    inherit from the collection interface (contains collection like
   operations)
    - Use case for Map - a list of bank transactions
    where each map entry is has a unique  transaction ID (which would
    be the key) and the value would be the amount that is transacted.

    set - is an interface
    interfaces cannot be instantiated (new)
    But set can be an object type?


     */

    public static void main(String[] args) {

        //SET
        Set fruitSet = new HashSet(); // creating a set called fruit
        fruitSet.add("apple"); // adding to the set with -  setName.add
        fruitSet.add ("lemon"); // add elements into the set.
        fruitSet.add ("banana");
        fruitSet.add ("orange");
        fruitSet.add("lemon"); // set can not have duplicates

        System.out.println(fruitSet.size());
        // output 4
        // since it will ignore the duplicate element ("lemon")

        System.out.println("Fruit set: " + fruitSet); // outputs - [banana, orange, apple, lemon]
        // it will output because it's organized so there would
        //  be no control over where the elements will be placed in the stack.


        //Arraylist
        List fruitList = new ArrayList (); // creating an a
        fruitList.add ("apple");
        fruitList.add("lemon");  // List can have duplicates.
        fruitList.add ("banana");
        fruitList.add ("orange");
        fruitList.add ("lemon");
        fruitList.add (4);

        System.out.println();
        System.out.println(fruitList.get(2)); // gets banana at index 2
        System.out.println(fruitList.size()); // 6 since they are 6 elements
        System.out.println("Fruit list: " + fruitList); // [apple, lemon, banana, orange, lemon, 4]
// The list will stay in the ordered that they were added in.
        // because list are organized.

        //QUEUE - LINKED LIST
        // the most common implementation of queue are
        // linked list and priority queue.
        Queue fruitQueue = new LinkedList (); // creating a LinkedList
        fruitQueue.add ("apple");
        fruitQueue.add("lemon");  // List can have duplicates.
        fruitQueue.add ("banana");
        fruitQueue.add ("orange");
        fruitQueue.add ("lemon");
        fruitQueue.add (4);

        System.out.println(); // blank space.

        System.out.println(fruitQueue.size()); // 6 since they are 6 elements
        System.out.println("Fruit queue:" + fruitQueue); // [apple, lemon, banana, orange, lemon, 4]

        fruitQueue.remove(); // apple === removes the first element added
        System.out.println(fruitQueue); //[lemon, banana, orange, lemon, 4]

        System.out.println(fruitQueue.peek());  // lemon
        // nameofQueue.peek will show the first element that
        // will be processed next.

// the first element of a queue is known as the head.
// the last element of a queue is known as the tail.


        //MAP - values & keys
        // we search for a value using a key
        // there can not be any key duplicates
        // but there can be duplicate values

        Map fruitCalories = new HashMap(); // creating an HashMap
        fruitCalories.put ("apple", 20); // adding the key (apple) & the value (20)
        fruitCalories.put ("lemon", 38); // Map doesn't have access to the add method like the other collections
        fruitCalories.put ("orange",  54);
        fruitCalories.put ("lemon", 52); // "lemon" is not a unique key
        // if you add a key that already added, then the map
        // will update with that new key entry ("lemon", 52) will
        // be the updated key.

        System.out.println();
        System.out.println(fruitCalories.size());  // outputs 3 - since there is a duplicate that isn't counted
        System.out.println(fruitCalories); // {orange=54, apple=20, lemon=52} - removed the duplicate
        System.out.println(fruitCalories.get ("lemon")); // outputs 52 - the value of they key (lemon)
        System.out.println(fruitCalories.entrySet()); // outputs [orange=54, apple=20, lemon=52]

        fruitCalories.remove("orange");
        System.out.println(fruitCalories); // {apple=20, lemon=52}

// can't use the remove or add element to List.of
       List unchangeableList = List.of("apple", "lemon", "banana"); // adding elements to this list using the "list.of" method
    //     unchangeableList.add("orange"); //UnsupportedOperationException
     //   unchangeableList.remove(1);  UnsupportedOperationException
        System.out.println(unchangeableList);

        Set set = Set.of("apple", "lemon", "banana"); // adding elements to this list using the "list.of" method
        //     set.add("orange"); //UnsupportedOperationException
        //   set.remove("lemon");  UnsupportedOperationException
        System.out.println(set);

        Map map = Map.of("apple", 83 ,"lemon", 32, "banana", 90); // adding elements to this list using the "list.of" method
        //     unchangeableList.put("apple"); //UnsupportedOperationException
        //   unchangeableList.remove("banana", 105);  UnsupportedOperationException
        System.out.println(map);
    }

}
