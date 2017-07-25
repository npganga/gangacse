package beginner;

import java.util.Scanner;

public class set112 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
    String input=in.nextLine();
    String[] arr=input.split(" ");
    for(int i=0;i<arr.length;i++){
    	if(i%2==0){
    		StringBuffer sb=new StringBuffer(arr[i]);
    		System.out.print(sb.reverse()+" ");
    	}
    	else {
    		System.out.print(arr[i]+" ");
    	}
    }
    in.close();
  }
}
