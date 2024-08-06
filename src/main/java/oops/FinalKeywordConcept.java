package oops;



//you cannot reassign a value to a
//-- final class



//-- if you make method as final no one can override your method.



class Aa{
    public final void show(){
        System.out.print("IN Aa");
    }
}

class Bb extends Aa{
    // but you inherit class but you cannot override show() method  if your method is final
    //since show method is final
}



final class Aaa{
    public void show(){
        System.out.println("In Calc show");
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
}

//class Bbb extends Aaa{

    //Suppose someone want to extend your class , but we want to stop inheritance then we need to make final
//-- if you make class final then no one can inherite your class
//-- but you can use the final class by making object of final class
//}


public class FinalKeywordConcept {

}
