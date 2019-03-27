import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class RegEx{
    public static void main(String args[]){
        //pattern to be evluated
        Pattern regex=Pattern.compile("[A-Z]+[a-zA-Z0-9]*[.]{1}");
        //Input the string
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        //match pattern wth string
        Matcher matcher=regex.matcher(sentence);
        boolean matches=matcher.matches();
        if(matches==true) {
            System.out.println("Sentence starts with a Capital and ends with a full-stop");
        }
        else System.out.println("Sentence doesnt start with a Capital and end with fullstop");
    }
}
