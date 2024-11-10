package string;

import java.util.Scanner;

public class Exaple {
	
	public static void  find () {
       int pal=0;
       int npal=0;
       int num[] = {21,33,45,44};
       for(int s:num) {
       String str = Integer.toString(s);
       
		   String rev = "";
		   char ch =' ';
		   for(int i=0;i<str.length();i++) {
			   ch =str.charAt(i);
			   rev = ch+rev;
			   
		   }
       
		  
       if(str.equals(rev)) {
    	   System.out.println(str+"Pal");
    	   pal++;
       }else {
    	   System.out.println(str+"not pal");
    	   npal++;
       }
       }
       System.out.println(pal);
       
	}
		String str = "mom and dad going";
	
		String words[] = str.split(" ");
		
		for(String s : words) {
			String rev = "";
			char ch = ' ';
			
			for(int i=0; i<s.length();i++) {
				ch = s.charAt(i);
				rev =ch+rev;
		}
		
			if(s.equals(rev)) {
				System.out.println(s+"pal");
		}else {
			System.out.println(s+"not pal");
		}
		
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Scanner sc = new Scanner(System.in);
	 find();
	}

}