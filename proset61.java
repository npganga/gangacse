package pro;

import java.util.Scanner;

public class proset61 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the first string");
	String input1=in.next();
	System.out.println("Enter the second string");
	String input2=in.next();
	int t=65;
	int l=97;
	String ans1="";
	char[] arr=new char[26];
	char[] arr1=new char[26];
	for(int i=0;i<26;i++){
		arr[i]=(char)t;
		t++;
		arr1[i]=(char)l;
		l++;
	}
	int g=0;
	for(int i=0;i<input1.length();i++){
		for(int ij=0;ij<26;ij++){
		if(input1.charAt(i)==arr[ij]){
			
			if((ij+10)>25){
				g=(ij+9)-25;
			}
			else{
				g=ij+10;
			}
			ans1=ans1+arr[g];
		}
		else if(input1.charAt(i)==arr1[ij]){
			if((ij+10)>25){
				g=(ij+9)-25;
			}
			else{
				g=ij+10;
			}
			ans1=ans1+arr1[g];
		}
	}
	}
	ans1=ans1+" "+input2.charAt(0);
	for(int i=1;i<input2.length()-1;i++){
		for(int ij=0;ij<26;ij++){
			if(input2.charAt(i)==arr[ij]){
				
				if((ij+10)>25){
					g=(ij+9)-25;
				}
				else{
					g=ij+10;
				}
				ans1=ans1+arr[g];
			}
			else if(input2.charAt(i)==arr1[ij]){
				if((ij+10)>25){
					g=(ij+9)-25;
				}
				else{
					g=ij+10;
				}
				ans1=ans1+arr1[g];
			}
		}
	}
	System.out.println(ans1+""+input2.charAt(input2.length()-1));
	in.close();
}
}
