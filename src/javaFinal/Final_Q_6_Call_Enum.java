package javaFinal;

public class Final_Q_6_Call_Enum {

    /*
    Create an enum type class with multiple values,
    loop through all of them using for loop.
    */
    public static void main(String[] args) {

        testEnum e = testEnum.JANUARY;

        for (testEnum d:testEnum.values()) {
            System.out.println(d);
        }
    }
}
