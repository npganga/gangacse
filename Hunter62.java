package ivug;

import java.util.Arrays;
import java.util.Scanner;

public class Hunter62 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("Stock of 10 days are:");
	int[] array=new int[10];
	for(int i=0;i<10;i++) {
		array[i]=in.nextInt();
	}
	System.out.println("Share are in");
	String a=in.next();
	Arrays.sort(array);
	int ans=array[9]-1;
	System.out.println(ans+" "+a);
	in.close();
}
}
