package beginner;

import java.util.Scanner;

public class set90 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("The String is ");
	String input=in.next();
	String ans="";
	for(int i=0;i<input.length();i++){
		int r=(int)input.charAt(i);
		if(r>47&&r<58){
			ans+=input.charAt(i);
		}
	}
	System.out.println("The numeric string is "+ans);
	in.close();
}
}
