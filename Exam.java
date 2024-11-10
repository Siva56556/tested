package string;

import java.util.ArrayList;
import java.util.List;

public class Exam {
	

	public static void main(String[] args) {
		
		  
	  List <String ,Integer>l1 = new ArrayList<String, Integer>();
	  l1.add(0,"abhsx");
	  l1.add(1,14);
	  l1.add(2,24);
//	  System.out.println(l1);
	  List l2 = new ArrayList();
	  l2.addAll("abhs",15 );
	  l2.add(1,16);
	  l2.add(2,2);
	  l1.addAll(1, l2);
	  System.out.println(l1);
	  System.out.println(l1.get(3));
	  l1.set(3,5);
     System.out.println(l1);
     
	}

}
