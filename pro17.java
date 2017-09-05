package gUVII;

import java.util.Scanner;

public class pro17 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("The number is:");
	int flag=0;
	int b=0;
	int n=in.nextInt();
	for(int i=1;i<n;i++){
		int a=i;
	    b=a;
		int sum=1;
		while(a>0){
		 int c=a%10;
		 sum*=c;
		 a=a/10;
		}
		if((sum*b)==n){
			flag=1;		
			System.out.println("The seed number of "+n+" is "+b);
		}
		
	}
	
	if(flag==0){
		System.out.println("The seed number of "+n+" is not available");
	}
}
}
