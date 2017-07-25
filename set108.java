package beginner;

import java.util.Scanner;

public class set108 {
public static void main(String[] args){
	int[] caps=new int[27];
	int[] small=new int[27];
	Scanner in=new Scanner(System.in);
	int c=1;
	int i=0;
for( i='a';i<='z';i++){
		small[c]=i;
		c++;
	}
	c=1;
	for( i='A';i<='Z';i++){
		caps[c]=i;
		c++;
	}
	int value=0;
	char last=in.next().charAt(0);
	for(int j=1;j<27;j++){
		if(last==(caps[j])||(last==small[j])){
		value=j;
		System.out.println(last+" = "+value);
		break;
		}
	}
	in.close();
}
}
