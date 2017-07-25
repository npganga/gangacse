package beginner;

import java.util.Scanner;

public class set116 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int[] array=new int[25];
	for(int i=0;i<25;i++){
		array[i]=in.nextInt();
	}
	int max=array[0];
	for(int i=0;i<25;i++){
		if(array[i]>max){
			int temp=max;
			max=array[i];
			array[i]=temp;
		}
	}
	System.out.println(max);
	in.close();
}
}
