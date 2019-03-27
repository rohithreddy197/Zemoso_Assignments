import java.util.*;
import java.io.*;

interface Cycle{
    public void speed();
}

class Unicycle implements Cycle{
    public void speed(){
    System.out.println("Unicycle speed");
}
}
class Bicycle implements Cycle{
    public void speed(){
        System.out.println("Bicycle speed");
    }
}
class Tricycle implements Cycle{
    public void speed(){
        System.out.println("Tricycle speed");
    }
}

class CycleFactory{
    public Cycle getObject(int i){
        //returns reference for each object
        if(i==0) return new Unicycle();
        else if(i==1) return new Bicycle();
        else return new Tricycle();
}
}

class CyclesFactory{
    public static void main(String args[]){
        //object for factory class
        CycleFactory cf=new CycleFactory();
        //calling methods using CycleFactory
            Cycle c1=cf.getObject(0);
            c1.speed();
            Cycle c2=cf.getObject(1);
            c2.speed();
            Cycle c3=cf.getObject(2);
            c3.speed();
    }
}
