package Ivug;

import java.util.Scanner;

public class Hunter75 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int[] arr=new int[n];
	int[] w=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=in.nextInt();
	}
  for(int i=0;i<n-1;i++) {
	  if(arr[i+1]<arr[i]) {
		  w[i]=arr[i+1];
	  }
	  else {
		  w[i]=-1;
	  }
  }
  w[n-1]=-1;
  for(int i=0;i<n;i++) {
	  System.out.print(w[i]+" ");
  }
  in.close();
}
}
