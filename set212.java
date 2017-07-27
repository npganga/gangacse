package player;

import java.util.Scanner;

public class set212 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("The value of radius,length,breath and height is ");
	double r=in.nextFloat();
	double l=in.nextFloat();
	double  b=in.nextFloat();
	double h=in.nextFloat();
    circle( r);
	rectangle(l,b);
	triangle(b,h);
	in.close();
}
public static double triangle(double b, double h) {
	// TODO Auto-generated method stub
	double d=0.5*b*h;
	System.out.println("Arear of Triangle "+d);
	return d;
}
public static double rectangle(double l, double b) {
	// TODO Auto-generated method stub
	double e=l*b;
	System.out.println("Area of Rectangle "+e);
	return e;
}
public static double circle(double t){
	double c=3.14*t*t;
	System.out.println("Area of Circle "+c);
	return c;
}
}
