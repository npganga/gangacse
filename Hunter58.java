package Ivug;

import java.util.Scanner;

public class Hunter58 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
	int[] array=new int[n];
	for(int i=0;i<n;i++) {
		array[i]=in.nextInt();
	}
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			int t=array[i]-array[j];
			if(Math.abs(t)==k) {
				System.out.println(array[i]+","+array[j]);
			}
			
		}
	}
}
}
