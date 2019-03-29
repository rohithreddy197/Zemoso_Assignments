import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegExFile {
    public static void main(String args[]) throws Exception {
		    //Take the home directory into a file
        File homeDirectory = new File("/home/lenovo/Rohith");   
	      //String homeDirectory = System.getProperty("user.home");
        System.out.println("Iput the Regular Expressions of files");
        Scanner sc = new Scanner(System.in);
		    //Store pathnames into a array of files.
        File[] listOfFiles = homeDirectory.listFiles();
        while (sc.hasNext()){
            int NumberOfFiles=0;
			      //compile the given pattern input
            Pattern p=Pattern.compile(sc.next());
            for (File file : listOfFiles)
                if (file.isFile()){
                    String fileName = file.getName();
                    Matcher m = p.matcher(fileName);
					           // print the absolute path if found any satisfying that regular expression
                    if (m.find()){
                        System.out.println(file.getAbsolutePath());    
                        numberOfFiles++;
                    }
                }
            if(numberOfFiles==0)
                System.out.println("Sorry, No files found");
        }
    }
}
