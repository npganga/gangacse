package Ivug;

import java.util.Scanner;

public class Hunter72 {

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String input=in.nextLine();
	String[] arrr=input.split(" ");
	String output="";
	for(int i=0;i<arrr.length;i++) {
		if(i%2==1) {
			output+=arrr[i];
		}
		else {
			StringBuffer sb=new StringBuffer(arrr[i]);
			output+=sb.reverse();
		}
		output+=" ";
	}
	System.out.println(output);
	in.close();
}

}
