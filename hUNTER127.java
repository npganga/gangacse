package Hunter;

import java.util.Scanner;

public class hUNTER127 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=in.nextInt();
	int c=0;
	for(int i=3;i<=n;i+=10){
		for(int j=1;j<=n;j++){
			if(i%j==0){
				c++;
			}
		}
		if(c==2){
			System.out.println(i);
		}
		c=0;
	}
	in.close();
}
}
