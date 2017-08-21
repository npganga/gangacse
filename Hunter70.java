package ivug;

import java.util.Scanner;

public class Hunter70 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number of array elements to be size and to be considered");
	int n=in.nextInt();
	int m=in.nextInt();
	System.out.println("Array elements are ");
	int[] array=new int[n];
	int mm=0;
	try {
	if(m<=n) {
	for(int i=0;i<n;i++) {
	array[i]=in.nextInt();
	}
	int sum=0;
	System.out.println("Enter the target number");
	int t=in.nextInt();
	for(int i=0;i<n;) {
		for(int j=i;j<m;j++) {
			sum+=array[j];
		}
		if(sum==t) {
			mm=sum;
			break;
		}
		else {
			sum=0;
			i++;
			m++;
		}
	}
	if(mm==t) {
		System.out.println("TRUE");
	}
	else {
		System.out.println("FALSE");
	}
	}
	}
	catch(Exception e) {
		System.out.println("Overflow");
	}
	in.close();
}
}
