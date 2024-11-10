package string;

import java.util.Scanner;

public class Palcheck {
	public static void palandrome() {
		int pal =0;
		int np=0;
		for(int i=0; i<=20;i++) {
			String num = Integer.toString(i);
		Reverse v = new Reverse();
		String ev = v.reversed(num);
		if(num.equals(ev)) {
			System.out.println(num+" pal");
			pal++;
		}else {
			System.out.println(num+"not pal");
			np++;
		}
			
		}
		System.out.println(pal);
		System.out.println(np);
	}		

	public static void main(String[] args) {
		
		palandrome();
		for(int i=str.length()-1;i>0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
