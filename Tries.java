package string;

public class Tries {

	public static void main(String[] args) {
		try {
			System.out.println("firstblock");
			int a=100;
			int b =5;
			int c=a/b;
			System.out.println(c);
			try {
				System.out.println("sec");
				int value =100/0;
				try {
					System.out.println("third");
					String  text = null;
					System.out.println(text.length());
				}catch(Exception e) {
					System.out.println("third");
					e.printStackTrace();
				}
			}catch(Exception e) {
				System.out.println("sec");
				e.printStackTrace();
			}
		}catch(Exception e) {
			System.out.println("first");
			e.printStackTrace();
		}


	}

}
