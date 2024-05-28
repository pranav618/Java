

@java.lang.FunctionalInterface                       //only 1 abstract method, so functional interface
interface A{
     void show();
}


//implementing an interface without Lambda
class xys implements A{
    @Override
    public void show() {
        System.out.println("Hello");
    }
}

public class LambdaAPI {

    public static void main(String args[]){
        A obj=()-> System.out.println("Hello");         //implementing an interface using Lambda
        obj.show();

    }

}
