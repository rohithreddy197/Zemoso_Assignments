import java.io.*;
import java.util.*;
class Outer1{
    Outer1(){
        System.out.println("Outer class 1");
    }
    class Inner1{ //nested class1
        int n;
        Inner1(int n){
            this.n=n;
            System.out.println("Inner class in Outer1 "+n);
        }
    }
}
class Outer2{
    Outer2(){
        System.out.println("Outer class 2");
    }
    class Inner2 extends Outer1.Inner1{ //nested class extending other nested class
        Inner2(Outer1 a){
            a.super(22); 	//calling nested class constructor
            System.out.println("Inner class2 extending Inner1");
        }
    }
}
class Main{
    public static void main(String a[]){
        Outer1 o1=new Outer1();
        Outer2.Inner2 o2=new Outer2().new Inner2(o1);
    }
}

