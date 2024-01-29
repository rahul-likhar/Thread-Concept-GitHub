package anonymousClass;
//because they are "synchronized and join" they always give me same output
//and if one of these keyword is missing output is unpredicted

public class A {

	int balance=0;
	
	public synchronized void add() {
		for(int i=0; i<=1000; i++) {
			balance = balance + i;
			
		}
	}
	
	public synchronized void sub() {
		for(int i=0; i<=1000; i++) {
			balance = balance - i;
			
		}
	}
	
	public void account() {
	
	Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			add();
		}
	});
	
	Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			sub();
		}
	});
	
	t1.start();
	t2.start();
	
	try {
		t1.join();
		t2.join();
	}
	catch (Exception e) {
		System.out.println(e);
		// TODO: handle exception
	}
	
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.account();
		System.out.println(a1.balance);
	}
}
