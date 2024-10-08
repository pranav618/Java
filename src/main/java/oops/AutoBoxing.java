package oops;



//we are discussing about wrapper class:
//        if you want to store integer value you store in int
//        java provide primitive data type
//        thats why java is 99.9 % object oriented programming
//        primitive data types helps us to improve the performance
//        but certain feature are work only when we work with objects
//        for collection framework -- we need non primitive type data as input




public class AutoBoxing {


    public static void main(String[] args) {

        //    Boxing:It is manual method to convert primitive type data into non-primitive type .
//    e.g
        int num=7;
        Integer num1=new Integer(8); //boxing

//    UnBoxing: It is manual method to convert non-primitive data type to primitive type.
//    e.g
        int num2=num1.intValue(); //unboxing

//    AutoBoxing:It is automatic conversion of primitive type data into non-primitive data type.
        int num3=5;
        Integer num4=num3; //autoboxing

//    AutoUnBoxing:It is automatic conversion of non primitive type data into primitive data type.
        int num5=num4; //autounboxing

//    int num=7;
//    how to store data as Object
        Integer num14=new Integer(8); //this syntax is depreciated
        Integer num15=Integer.valueOf(8); //Now we use this syntax
        Integer num16=8; //autoboxing
        int num23=num16.intValue();//unboxing
        int num33=num14; //autounboxing

//--convert string into int type using parseInt
        String str="12";
        int num44=Integer.parseInt(str);

//--Convert number into String
        String str1=Integer.toString(23); //convert number into string



    }
}
