package Rohith.Assignment.Singleton;

public class Singleton{
public Singleton(String notAStaticString){
      this.notAStaticString=notAStaticString;
      System.out.println(notAStaticString);
}
String notAStaticString;
//static method to print non static values
public static Singleton aStaticMethod(String someRandomString){
      //non-static variable notAStaticString cannot be referenced from a static context someRandomString = notAStaticString;
      //someRandomString = notAStaticString;
      Singleton object=new Singleton();
      return object;
      //System.out.println("String is"+someRandomString);
}
//non static method to print variables
public void printTheString(){
      System.out.println("String is"+notAStaticString);
}
}
