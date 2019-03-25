// time complexity of this code is o(n) where n is the size of string and space complexity is o(n). boolean array can be considered to store the count as true or false instead of count which will still give o(n) sc.
import java.io.*;
import java.util.*;
class Checkallchar
{
	public static void main (String[] args)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();			
		s=s.toLowerCase();			//converting into case sensitive string
		System.out.println(s);
		int cnt[]=new int[26];        		//boolean array can be considered.
		for(int i=0;i<s.length();i++){
			cnt[s.charAt(i)-'a']++; 	//instead of incrementing count just assign true
		}
		for(int i=0;i<26;i++) {
			//System.out.print(cnt[i]);
			if(cnt[i]==0){
				System.out.println("False");
				break;
			}
		}
		System.out.println("True");
	}
}
