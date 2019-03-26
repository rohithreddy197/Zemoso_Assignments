import java.util.HashMap;
import java.io.File;
import java.io.*;
import java.util.*;
import java.lang.String;
   public class ReadFile{
           public static void main(String args[]){
              //System.out.println("Frst");
            try{
            //FileReader f=new FileReader("inputfile.txt");
		          File f=new File("inputtext.txt");
	    	      BufferedReader br=new BufferedReader(new FileReader(f));
          	  //System.out.println("Scnd");
          	  HashMap< Character , Integer > hm=new HashMap< Character , Integer>();
	            //int i;
	             /*
                    while((i==f.read())!=false){
	                  System.out.print((char)i);
	                  System.out.println("frth");
	                  }
		          */
		          String s;
		          while((s=br.readLine())!=null){
		          char[] schar=s.toCharArray();
		          //for(int i=0;i<s.length();i++){
		          for(char c: schar){
		            if(hm.containsKey(c)){
			              hm.put(c,hm.get(c)+1);
		            }
		            else hm.put(c,1);
	  	          //System.out.println("THRd");
		            //System.out.println(s);
		         }		
	        }	
		         for(Map.Entry entry:hm.entrySet()){
			          System.out.println(entry.getKey()+" "+entry.getValue());
		      }
	  }
	  catch(Exception E){}
           }
  }
