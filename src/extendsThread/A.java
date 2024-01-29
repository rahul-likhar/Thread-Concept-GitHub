package extendsThread;

public class A extends Thread{
	
	public void run() {
		for(int i=1; i<=10000; i++) {
			System.out.println("Run method");
		}
	}
	
	public static void main(String[] args) {
		A a1  = new A();
		a1.start();
		for(int i=1; i<=10000; i++) {
			System.out.println("Main method");
		}
	}
	

}
