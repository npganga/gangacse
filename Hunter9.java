package gUVI;

import java.util.Scanner;

public class Hunter9 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=in.nextInt();
	System.out.println("Array elements are");
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=in.nextInt();
	}
	if(arr.length>=2) {
	int b=2147483647;
	int one=0;
	int two=0;
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			int a=arr[i]+arr[j];
			int d=Math.abs(a);
			if(d<b) {
				b=d;
				one=arr[i];
				two=arr[j];
			}
		}
	}
	System.out.println("The closest pair of elements near to zero is ("+one+","+two+")");
	}
	else {
		System.out.println("No pairs available");
	}
	in.close();
}
}
