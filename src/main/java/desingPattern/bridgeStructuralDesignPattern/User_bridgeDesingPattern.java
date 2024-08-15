package desingPattern.bridgeStructuralDesignPattern;



//The Bridge Pattern is a structural design pattern that decouples an abstraction from its implementation,
// allowing them to vary independently. This is particularly useful when you want to avoid a large hierarchy of classes that combine multiple dimensions of abstraction and implementation.
//
//        Components of the Bridge Pattern:
//        Abstraction: This is the core of the bridge pattern. It contains a reference to the implementor and defines high-level operations that can be performed.
//        Refined Abstraction: A subclass of the Abstraction that implements the high-level operations.
//        Implementor: An interface that defines the low-level operations.
//        Concrete Implementor: A concrete implementation of the Implementor interface.


//When we have interface hierarchies in both interfaces as well as implementations,
//        then bridge design pattern is used to decouple the interfaces from implementation and hiding the implementation details from the client programs.


public class User_bridgeDesingPattern {

    public static void main(String[] args) {

        Automobiles car = new Car(new Manufacture(), new Produce());
        car.manufacture();

        Automobiles bus = new Bus(new Manufacture(), new Produce());
        bus.manufacture();
    }



}
