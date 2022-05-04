package com.yearUp.independentExcerises.dividingByZero;


public class Dividing {
    public static void main(String[] args) {
    divide();
    }

    public static void divide (){

            try {
                int c = 30/0;
                 System.out.println(c);

        }catch (ArithmeticException e ) {
          //  e.printStackTrace();
                System.out.println("Cannot divide 30 by 0.");

        }finally {
                System.out.println( "Division is fun");
            }
    }
}
