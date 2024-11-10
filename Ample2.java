package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Ample2 {

	public static void main(String[] args) {
//	  
//  List l1 = new ArrayList();
//  l1.add(0,"abhsx");
//  l1.add(1,14);
//  l1.add(2,24);
//  System.out.println(s1);
		
//  LinkedList l2 = new LinkedList();
	HashMap<String, Integer > l2 = new HashMap<String ,Integer>();

	 l2.put("leo", 15);
	  l2.put("ravi",16);
	  l2.put("ba", 132);
	  l2.put("pra",65);
	  l2.put("ak",187);
	  l2.put("ven",26);
  System.out.println(l2);
  if(l2.containsKey("leo")) {
	  System.out.println(l2.get("leo"));
  }
  System.out.println(l2.size());
  l2.clear();
  System.out.println(l2.isEmpty());
//  System.out.println(l2);
//  l2.addFirst("text");
//  System.out.println(l2);
//  l2.addLast("text");
//  System.out.println(l2);
//  
//     l1.addAll(1,l2);
////     l1.remove(3);
//     System.out.println(l1);
////     System.out.println(l1.get(5));
//     l1.set(5, 26);
//     System.out.println(l1);
//     System.out.println(l1.indexOf(26));
//     System.out.println(l1.lastIndexOf(26));
////     List  l3 = new ArrayList();
////     l3=l1.subList(3,7);
////     System.out.println(l3);
//     
	}
	}



