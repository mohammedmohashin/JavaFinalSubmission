package javaFinal;

public class Singleton {

    /*
Create a singleton class and create another class to
 show an example of the usage of a singleton class.
*/
    private static Singleton instance = null;
    public String a;

    private Singleton() {
        a = "This is example of Singelton class";
    }

    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
/* int x = 10;
    static Singleton obj = new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance(int x){
        return obj;
    }

    */