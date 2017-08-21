package ivug;

import java.util.Scanner;

public class Hunter64 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the amount:");
	int rs=in.nextInt();
	int[] arr={2000,1000,500,100,50,20,10,5,2,1};
	int c=0;
	int i=0;
		while(rs>0) {
			if(arr[i]<=rs) {
			rs=rs-arr[i];
			++c;
		}
			else {
				i++;
			}
	}	
	System.out.println("The number of note/notes are "+c);
	in.close();
}
}
