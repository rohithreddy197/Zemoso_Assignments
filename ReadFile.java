import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {
    public static void main(String args[]){
        try{
	    //Reading input file
            File f=new File("/home/lenovo/Desktop/inputtext.txt");
            BufferedReader br=new BufferedReader(new FileReader(f));
            HashMap< Character , Integer > hm=new HashMap< Character , Integer>();
            String s;
            while((s=br.readLine())!=null){
                char[] schar=s.toCharArray();
		//adding alphabet occurances to hashmap
                for(char c: schar){
                    if(hm.containsKey(c)){
                        hm.put(c,hm.get(c)+1);
                    }
                    else hm.put(c,1);
                }
            }
	    //printing character occurance values
            for(Map.Entry entry:hm.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
	//Exception handling
        catch(FileNotFoundException E) {
            System.out.println("File Not Found");
        }
        catch (IndexOutOfBoundsException E){
            System.out.println("Index out of bounds");
        }

        catch(IOException E){
            System.out.println("IO exception");
        }
    }
}
