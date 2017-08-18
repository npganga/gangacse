package Ivug;

import java.util.Scanner;

public class Hunter80 {
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int c=0;
for(int i=n;i>0;i=i/10) {
	c++;
}
int[] arr=new int[c];
int t=c-1;
for(int i=n;i>0;i=i/10) {
	int r=i%10;
	arr[t]=r;
	--t;
}
int y=0;
for(int j=0;j<c-1;j++) {
	int k=j+1;
   if((arr[j]-arr[k])==1||(arr[j]-arr[k])==-1){
	   y++;
   }
}
if(y==(c-1)) {
	System.out.println("Jumping number");
}
else {
	System.out.println("Not Jumping number");
}
in.close();
}
}