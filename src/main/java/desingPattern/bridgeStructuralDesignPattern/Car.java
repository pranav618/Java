package desingPattern.bridgeStructuralDesignPattern;

public class Car extends Automobiles {
    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing carrr....");

    }
}
