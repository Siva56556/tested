package string;

public class Charc {

	public static void main(String[] args) {

String str = "hellotextapp";
String str1 ="  Hello";
String s3 = "dad and mom going to meet a madam dad";
String s4 = new String("abhi");
String s5 = new String("abhi");
System.out.println(s4.equals(s5));
System.out.println(str.charAt(1));
char ch = str.charAt(1);
System.out.println(ch);
//String c = str.concat("  fb");
//System.out.println(c);
System.out.println(str.contains("l"));
System.out.println(str.concat("fg"));
System.out.println(str.endsWith("o"));
System.out.println(str.equalsIgnoreCase(str1));
System.out.println(str.indexOf("o"));
System.out.println(str.indexOf("z"));
System.out.println(str.lastIndexOf("t"));
System.out.println(str.length());
String r = str.replace("o","x");
System.out.println(r);
String[] s = s3.split(" ");
System.out.println(s3);
for(int i=0; i<s.length;i++) {
	System.out.println(s[i]);
}
System.out.println(str.substring(4, 7));

char[] charArray = s3.toCharArray();
System.out.println(s3);
for(int i=0;i<charArray.length;i++) {
	System.out.println(charArray[i]);
}
System.out.println(str.toLowerCase());
System.out.println(str.toUpperCase());
System.out.println(str.trim()+str1);
System.out.println(str.trim()+str1.trim());
System.out.println(str.substring(4,8));

	}

}


