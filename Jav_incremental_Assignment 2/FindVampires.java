import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
public static boolean checkIfVampire(int n,String numinstr){
    for(int i=1;(i*i)<=n;i++){
        int factor=0;
        if(n%i==0) factor=n/i;
        String fronthalf=Integer.toString(i);
        String scndhalf=Integer.toString(factor);
        if(fronthalf.endsWith("0") && scndhalf.endsWith("0") || fronthalf.length()!=scndhalf.length()) continue;
        String resultobtained=fronthalf+scndhalf;
        char[] resultobtainedarr=resultobtained.toCharArray();
        char[] resultrequiredarr=numinstr.toCharArray();
        Arrays.sort(resultobtainedarr);
        Arrays.sort(resultrequiredarr);
        if(Arrays.equals(resultrequiredarr,resultobtainedarr)) return true;
    }
    return false;
}

public static void main(String args[]){
        int cnt=0;
	    for(int i=1000;cnt!=100;i++){
	        String numinstr;
	        numinstr=Integer.toString(i);
	        if(numinstr.length()%2==0){
	            if(checkIfVampire(i,numinstr)==true){
	                cnt++;
	                System.out.print(i+" ");
	            }
	        }
	    }
    }
}