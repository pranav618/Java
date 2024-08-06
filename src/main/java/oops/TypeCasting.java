package oops;


//what is typecasting  ?
//        typecasting is way to converting one primitive data type into other data type using implicit or explicit type
//        conversion.


//        When we are talking about non -primitive data type we have concept of upcasting and downcasting
//        condition for upcasting and downcasting:
//        -- for that two class should have some parents child  relationship
//-- if non-primitive data type have no any relationship so, upcasting and downcasting is not possible.

class Ab{
    public void show1(){
        System.out.println("In show A");
    }
}

class Ba extends Ab{
    public void show2(){
        System.out.println("In show B");
    }
}

//Note:
//        the object can also be typecasted like the datatypes. Parent and Child objects are two types of objects.
//        So, there are two types of typecasting possible for an object, i.e., Parent to Child and Child to Parent or can say Upcasting and Downcasting.



public class TypeCasting {
    double d=4.5;
    int i=(int)d; //explicit typecasting

    int i1=5;
    double d1=i1; //implicit type conversion

    public static void main(String []args){
        Ab obj =(Ab) new Ba(); //upcasting
//        obj.show2(); //error

        Ab obj1 =new Ba(); // upcasting
//         obj1.show2(); // you get error and you are not able to call show2() because with parents reference specialised method of child is not visible
//        here we downcastig to use show2() method
        ((Ba)obj).show2(); //downcasting
    }
}
