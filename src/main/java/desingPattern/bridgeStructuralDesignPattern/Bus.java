package desingPattern.bridgeStructuralDesignPattern;

public class Bus extends Automobiles{
    public Bus(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Busss....");

    }
}
