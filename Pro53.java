package Ivug;

import java.util.Scanner;

public class Pro53 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String input=in.nextLine();
	int t=65;
	int y=97;
	char[] up=new char[26];
	char[] low=new char[26];
	for(int i=0;i<26;i++) {
		up[i]=(char)t;
		low[i]=(char)y;
		t++;
		y++;
	}
	int[] c=new int[26];
	int u=0;
	char[] inn=input.toCharArray();
	for(int i=0;i<inn.length;i++) {
		for(int j=0;j<26;j++) {
		if(inn[i]==up[j]||inn[i]==low[j]) {
			c[j]=++u;
		}
		}
	}
	int g=0;
	for(int i=0;i<26;i++) {
		if(c[i]>0) {
			++g;
		}
	}
	if(g==26) {
		System.out.println(" A Panagram input");
	}
	else {
		System.out.println("It is not a panagram input");
	}
	in.close();
}
}
