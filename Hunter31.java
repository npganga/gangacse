package gUVI;

import java.util.Scanner;

public class Hunter31 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Array size:");
	int n=in.nextInt();
	System.out.println("Array elements:");
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=in.nextInt();
	}
	int a=0;
	int b=0;
	int t=0;
	int max=0;
	for(int i=0;i<n-1;i++) {
		int j=i+1;
		if((t=arr[i]*arr[j])>max) {
			a=arr[i];
			b=arr[j];
			max=t;
		}
		
	}
	if(max>0) {
		System.out.println("The number are:"+a+" "+b+" and the product is "+max);
	}
	else {
		System.out.println("The given array does not generate a possible input");
	}
	in.close();
}
}
