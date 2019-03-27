import java.io.*;
import java.util.*;

interface Int1{
    public void method1();
    public void method2();
}
interface Int2{
    public void method3();
    public void method4();
}
interface Int3{
    public void method5();
    public void method6();
}
interface Int4 extends Int1,Int2,Int3{ 
    //interface extending other interfaces because those methods are not implemented in interface
    public void method7();
}
class ConcreteClass{
    public void method8(){
        System.out.println("method8 inside a concrete class.");
    }
}
class MultipleInterfaces extends ConcreteClass implements Int4{ 
    public void method1(){
        System.out.println("method1 in int1");
    }
    public void method2(){
        System.out.println("method2 in Int1");
    }
    public void method3(){
        System.out.println("method3 in Int2");
    }
    public void method4(){
        System.out.println("method4 in Int2");
    }
    
    public void method5(){
        System.out.println("method5 in Int3");
    }
    public void method6(){
        System.out.println("method6 in Int3");
    }
    public void method7(){
        System.out.println("method7 in Int4");
    }
    
    public static void method1InMain(Int1 a){
        a.method1();
        a.method2();
        System.out.println("method1InMain in main");
        
    }
    public static void method2InMain(Int2 a){
        a.method3();
        a.method4();
         System.out.println("method2InMain in main");
    }
    public static void method3InMain(Int3 a){
        a.method5();
        a.method6();
         System.out.println("method3InMain in main");
    }
    public static void main(String x[]){
        //create object for the class
        MultipleInterfaces obj=new MultipleInterfaces();
        //call the methods sending object as parameter
        method3InMain(obj);
        method2InMain(obj);
        method1InMain(obj);
    }
}

