import java.io.*;
import java.util.*;
class Cycle{
    Cycle(){
        System.out.println("hi im cycle");
    }
    /*public void balancing(){
        System.out.println("cycle is balancing");
    }
    */
}
class Bicycle extends Cycle{
    Bicycle(){
        System.out.println("Bicycle");
    }
    public void balancing(){
        System.out.println("bicycle is balcng");
    }
}
class Unicycle extends Cycle{
    Unicycle(){
        System.out.println("Unicycle");
    }
    public void balancing(){
        System.out.println("Unicycle is balcng");
    }
}
class Tricycle extends Cycle{
    Tricycle(){
        System.out.println("Tricycle");
    }
    public void nomethod(){
        System.out.println("nommethod for tricycle");
    }
}
class CycleAndBalancing{
    public static void main(String s[]){
        Cycle o1=new Unicycle();
        Cycle o2=new Bicycle();
        Cycle o3= new Tricycle();
        Unicycle u1=(Unicycle)o1;
        Bicycle b1=(Bicycle)o2;
        Tricycle t1=(Tricycle)o3;
        t1.nomethod();
        //o3.balancing();     //Main.java:44: error: cannot find symbol o3.balancing();
        //o2.balancing();   //Main.java:43: error: cannot find symbol o2.balancing();
        b1.balancing();
        u1.balancing();
        //o1.balancing();   //Main.java:43: error: cannot find symbol o1.balancing();
        
    }
}
