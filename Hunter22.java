package gUVI;

import java.util.Scanner;

public class Hunter22 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of an array:");
	int n=in.nextInt();
	System.out.println("Array elements are:");
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=in.nextInt();
	}
	int[] out=new int[n];
	System.out.println("The output array is:");
	int mul=1;
	for(int j=0;j<n;j++) {
	for(int i=0;i<n;i++) {
		if(j!=i) {
		mul*=arr[i];
		}
	}
	out[j]=mul;
	mul=1;
	}
	for(int i=0;i<n;i++) {
		System.out.println(out[i]);
	}
	in.close();
}
}
