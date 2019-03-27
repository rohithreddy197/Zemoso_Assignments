import java.io.*;
import java.util.*;
abstract class Rodent{
    Rodent(){
        System.out.println("Rodent class greeets you.");
    }
    abstract void wavehi();
    abstract void wavebye();

}
class Mouse extends Rodent {
    Mouse(){
        System.out.println("Rodent class greeets you.");
    }
    void wavehi(){
        System.out.println("Mouse is waving hi");
    }
    void wavebye(){
        System.out.println("Mouse is waving bye");
    }
}
class Gerbil extends Rodent {
    Gerbil(){
        System.out.println("Gerbil class greets you");
    }
    
    void wavehi(){
        System.out.println("Gerbil is waving hi");
    }
    void wavebye(){
        System.out.println("Gerbil is waving bye");
    }
}
class Hamster extends Rodent {
    Hamster(){
        System.out.println("Hamster Class greeets you.");
    }
    
    void wavehi(){
        System.out.println("Hamster is waving hi");
    }
    void wavebye(){
        System.out.println("Hamster is waving bye");
    }
}

class RodentBreed {
    public static void main(String[] args) {
        //Array ofobjects for rodents
        Rodent[] rodent = new Rodent[3];
                rodent[0]=new Mouse();
                rodent[1]=new Gerbil();
                rodent[2]=new Hamster();

        //Call baseclass methods
        for(Rodent i : rodent){
            i.wavehi();
            i.wavebye();
        }
    }
}
