package oops;


import java.util.Arrays;
import java.util.List;

public class JavaPassByValue {

    static class Obj{
        int value;
        public Obj(){
        }

        public Obj(int value){
            this.value= value;

        }
    }

    public static void main(String args[]){
        Obj a = new Obj();
        a.value=10;
        System.out.println(a.value);  //10
        modify(a);
        System.out.println(a.value); //20

        modifyMore(a);
        System.out.println(a.value); //20



    }

    static void modify(Obj a){
        a.value=20;

    }

    static void modifyMore(Obj a){
        a= new Obj();
        a.value=30;

    }
}
