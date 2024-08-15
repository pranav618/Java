package desingPattern.adaptarStructuralDesignPatten;

import desingPattern.adaptarStructuralDesignPatten.PencilPen.PencilPen;

public class PencilAdapter implements Pen{

    //here we are using PencilPen and overriding Pen to make it compatible with PencilPen

    PencilPen pencilPen = new PencilPen();

    @Override
    public void write(String s) {
        pencilPen.draw(s);
    }
}
