package string;

import java.util.Scanner;

public class Reverse {

	public static String reversed(String str) {
		String rev="";
        char ch =' ';
        for(int i=0; i<str.length(); i++) {
        	ch=str.charAt(i);
        	rev =ch+rev;
        }
		return rev;
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Reverse s = new Reverse();
		String a =s. reversed(sc.next());
		System.out.println(a);
         
	}

}

