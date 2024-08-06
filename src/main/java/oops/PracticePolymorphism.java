package oops;


import java.util.ArrayList;

class A{
    public void show(StringBuilder sb){
        System.out.println("StringBuilder"+ sb);
    }

    public void show(String s){
        System.out.println("String"+ s);
    }

    public void show(ArrayList<String> list){
        System.out.println("StringBuilder"+ list.toString());
    }

}

class B{
    public void show(String s){
        System.out.println("String in Class B"+ s);
    }
}

class C extends B {
//
//    Exception Compatibility in Java:
//    Checked Exceptions: If the base class method declares a checked exception, the overridden method can only throw the same exception or its subclasses. It cannot throw new or broader checked exceptions that the base class method doesn't declare.
//    Unchecked Exceptions: The overridden method can throw unchecked exceptions (subclasses of RuntimeException) freely, as they do not need to be declared.

//    public void show(String s) throws Exception{              //will throw error
//        System.out.println("String in Class C"+ s);
//    }
//}
}

public class PracticePolymorphism {

    public static void main(String[] args) {

        A a = new A();
//        a.show(null);                         it will throw error

    }


}

