package Rohith.Assignment.main;
import Rohith.Assignment.data.Data;
import Rohith.Assignment.Singleton.Singleton;
public class MainClass
{
      public static void main(String e[]){
      
            //object for First class in singleton pckage
            Singleton s=new Singleton();
            //object for data class in data package
            Data d  =new Data();
            d.printingMethod();
            //d.printingLocalVars();          //will raise an error
            //s.aStaticMethod("hi");          //will raise an error
            s.printTheString();
}
}
