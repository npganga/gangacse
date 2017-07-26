package player;

import java.util.Scanner;

public class Player182 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=in.nextInt();for(int k=1;k<=n;k++){
	for(int i=1;(i<=k);i++){
			System.out.print(i);
		}
	for(int i=k-1;i>0;i--){
		System.out.print(i);
	}
	System.out.print(" ");

 }
	}
}
