package gUVI;

import java.util.Scanner;

public class Hunter29 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Array size:");
	int n=in.nextInt();
	System.out.println("Array elements are:");
	int[] arr=new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]=in.nextInt();
    }
    System.out.println("Sub array size:");
    int a=in.nextInt();
    int sum=0;
    int max=0;
    for(int i=0;i<=n-a;i++) {
    	for(int j=i;j<a+i;j++) {
    		sum+=arr[j];
    	}
    	if(sum>max) {
    		max=sum;
    	}
    	sum=0;
    }
    System.out.println("Sum of maximum in subarray is "+max);
    in.close();
}
}
