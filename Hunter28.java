package gUVII;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Hunter28 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String input=in.next();
	Set<Character> lhs = new LinkedHashSet<>();
    for(int i=0;i<input.length();i++)
        lhs.add(input.charAt(i));
    for(Character ch : lhs)
        System.out.print(ch);
  in.close();
		
}
}
