package javaFinal;

import org.apache.commons.math3.analysis.function.Sin;

public class SingeltonMain {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());

        if (x == y && y == z) {
            System.out.println("3 object points the same memory location on the heap");
        } else {
            System.out.println("3objects NOT point to the same memory location on the heap");
        }
    }
}
