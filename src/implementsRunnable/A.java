package implementsRunnable;

public class A implements Runnable{

	String name;
	
	public A(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=1000; i++) {
			System.out.println(this.name);
		}
	}
	
	public static void main(String[] args) {
		A a1 = new A("Rahul");
		Thread t1 = new Thread(a1);
		t1.start();
		
		A a2 = new A("Yash");
		Thread t2  =new Thread(a2);
		t2.start();
		
		A a3 = new A("Pravin");
		Thread t3 = new Thread(a3);
		t3.start();
		
		for(int i=1; i<=1000; i++) {
			System.out.println("Main method");
		}
	}
	

}
