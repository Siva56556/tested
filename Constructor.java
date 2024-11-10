package string;

public class Constructor {
	public Constructor() {
		System.out.println("hell");
		System.out.println("hel0");
	}
    String name ;
    int rollnum;
    public Constructor( String name, int rollnum) {

	this.name= name;
	this.rollnum =rollnum;
	}
    public void display() {
    	System.out.println( name + rollnum);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Constructor s =new Constructor();
		 Constructor s2 =new Constructor("jdc", 10);
		 Constructor s3 =new Constructor("vdc", 20);
		 s2.display();
		 s3.display();
	}

}
