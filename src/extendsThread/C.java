package extendsThread;

public class C {
	
	public static void main(String[] args) {
		B b1 = new B("Rahul");
		b1.start();
		B b2 = new B("Yash");
		b2.start();
		B b3 =new B("Pravin");
		b3.start();
	}

}
