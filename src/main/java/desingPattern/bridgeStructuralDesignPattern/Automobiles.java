package desingPattern.bridgeStructuralDesignPattern;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public abstract class Automobiles {

   public Workshop workshop1;  //automobile has bridge with workshop
   public Workshop workshop2;

    public Automobiles(Workshop workshop1, Workshop workshop2){
        this.workshop1=workshop1;
        this.workshop2=workshop2;
    }


     public abstract void manufacture();
}
