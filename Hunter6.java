package gUVI;

import java.util.Scanner;

public class Hunter6 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=in.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the element of an array");
	for(int i=0;i<n;i++) {
		arr[i]=in.nextInt();
	}
	System.out.println("The frist repeated element in the array is");
	int count=0;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(arr[i]);
			break;
		}
		count=0;
	}
	in.close();
}
}
