package desingPattern.factoryCreationalDesginPattern;

import desingPattern.factoryCreationalDesginPattern.Android;


public class Main{
    public static void main(String args[]){
//        OS obj= new Android();      //if i run like this, then client will know which OS i am using.
                                    //so instead of directly creating class, we create OperatingSystemFactory class

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS obj = operatingSystemFactory.getInstance("Closed");
        obj.specs();

    }
}