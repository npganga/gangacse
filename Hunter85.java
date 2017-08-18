package Ivug;

import java.util.Scanner;

public class Hunter85 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int c=0;
	for(int i=0;i<=n;i++) {
		for(int j=i;j>0;j=j/10) {
			int r=j%10;
			if(r==2) {
				c++;
			}
		}
	}
	System.out.println(c);
	in.close();
}
}
