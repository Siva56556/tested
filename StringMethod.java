package string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
	String text = " hello madam is and is frnd";
	String [] text2 = text.split("is ");
	  
	  for(int i=0;i<text2.length; i++) {
		  System.out.println(text2[i]);
	  }

	

	}

}
  