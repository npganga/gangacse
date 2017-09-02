package gUVII;

import java.util.Scanner;

public class Hunter24 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of an array:");
	int n=in.nextInt();
	System.out.println("Array elements are:");
	int[] arr=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=in.nextInt();
	}
	System.out.println("Enter the target element:");
	int target=in.nextInt();
	int sum=0;
	int t=0;
	for(int i=0;i<n;i++){
		if(arr[i]<target){
			for(int j=0;j<n;j++){
				if(arr[j]<target&&i!=j){
					sum=arr[i]+arr[j];
				}
				if(sum==target){
					t=1;
					System.out.println("The two array elements to get the value of target are "+arr[i]+","+arr[j]);
					break;
				}
				sum=0;
			}
			if(t==1){
				break;
			}
		}
		if(t==0){
			System.out.println("No elements");
			break;
		}
	}
	in.close();
}
}
