import java.security.SecureRandom;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer num = 45;
        Integer aa = 30;
        Integer bb = 44;
        swap(aa,bb);
        System.out.println(aa + " " +bb);
        final int bonus = 2;
        //final keyword does not allow to modify variable 'bonus'
        // bonus = 3;

        final B luis = new B("luis bravo");
        luis.name = "Poland";
        System.out.println(luis.name);
        // when a non primitive is final, you cannot reassing it.
        //luis = new B("Warsaw");
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }

}

class  A{
    //final variable has to be initialized
    //always initialize while declaring
    // final int num; show error
    //the value of the instanced variable and the reference to the object (Integer a = 'value')
    // will never change it will always refer to the same object due to
    // Integer class has a final modifier behind.
    //But the value of the object can change.

    //When a final keyword is before a primitive data type, you cannot change the value
    final int INCREASE = 2;
    //INCREASE = 3; Here show an error.

    //When using a final keyword in not primitive data type,
    // you can change the value
    //But you cannot re-assign
        //Example: luis = other object.


}

class B{
    final int num = 10;
    String name;

    public B(String name){
        this.name = name;
    }

}