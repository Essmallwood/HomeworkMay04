package com.yearUp.learningExceptions;

public class Employee {
    public static void main(String[] args) {
        String [] employees = {"Moshe", "Adam", "Eve"};
        for (int i = 0; i < 4; i++){
            System.out.println("Hi " + employees [i]);
            // this will compile but
       // will run into an error when try to get index #3


        }
    }
}
