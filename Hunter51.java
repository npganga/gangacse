package Ivug;

import java.util.Scanner;

public class Hunter51 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String input1=in.next();
	String input2=in.next();
	String output;
	int n1=Integer.valueOf(input1);
	int n2=Integer.valueOf(input2);
	int t=n1*n2;
	output=String.valueOf(t);
	System.out.println(output);
	in.close();
}
}
