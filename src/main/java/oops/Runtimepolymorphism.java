package oops;


//Runtime polymorphism or Dynamic Method Dispatch is the mechanism by which a call to an overridden method is resolved at run time,
//        rather than compile time.

//Note: during compile time we do not which show() method is called from which class.
//        -- we can know during run time which show method is called this is known as run time polymorphism.
//        -- all this concept is class dynamic method dispatch

class D{
    public void show(){
        System.out.println("In D");
    }
}

class E extends D{
    public void show(){
        System.out.println("In E");
    }
}

class F extends D{
    public void show(){
        System.out.println("In F");
    }
}


public class Runtimepolymorphism {

    public static void main(String[] args) {
        D d = new D();
        d.show();

        d= new E();  //reference is D(we can use reference of parents) and create object of E  and assign to parents reference variable.
        d.show();

        d= new F();
        d.show();

    }




}
