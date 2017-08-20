package Hunter;

import java.util.Scanner;
public class Hunter123 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the string:");
	String input=in.next();
	char[] arr=input.toCharArray();
	int count=0;
	String output="";
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length;j++){
			if(arr[i]==arr[j]){
				count++;
			}
		}
		if(count==1){
			output+=arr[i];
		}
		count=0;
	}
	System.out.println(output);
	in.close();
}
}
