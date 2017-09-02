package gUVI;

import java.util.Arrays;
import java.util.Scanner;

public class Hunter12 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int[] height=new int[50];
		System.out.println("The height of 50 students are:");
		for(int i=0;i<50;i++) {
			height[i]=in.nextInt();
		}
		Arrays.sort(height);
		System.out.println("The 4th tallest student in the class is"+height[50-4]);
		System.out.println("Enter the k value:");
		int k=in.nextInt();
		System.out.println("The kth tallest student is:"+height[50-k]);
		in.close();
}
}
