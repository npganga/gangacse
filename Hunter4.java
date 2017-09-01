package gUVI;

import java.util.Scanner;

public class Hunter4 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of an array:");
	int n=in.nextInt();
	int[] arr=new int[n];
	if(n%2==1) {
		int count=0;
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt(); 
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					++count;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
			count=0;
		}
	}
	else {
		System.out.println("No element in the array");
	}
	in.close();
}
}
