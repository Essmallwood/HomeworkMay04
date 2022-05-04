package com.yearUp.learningInterfaceHW;

public interface IProduct {

    // -  if you define a field in an
    // interface that field has to be final.
    // - interfaces can not be instantiated ( new )
    // - interfaces are implemented (not extended)
    // - any class that implements an interfaces, must implement
    // all the interface's methods or the class must be abstract.
    // - methods in an interface must be abstract or default.
    // - a class can only extend one class but can implement many interfaces.

public double getPrice ();
public void setPrice(double price);

public String getName();
public void setName(String name);

public String getColor();
public  void setColor(String color);


// if you define the method as default,
// you can provide a default implementation for the method.
default String getBarcode() {
    return " no barcode";
}

// . = a dot operator

}
