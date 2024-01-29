package extendsThread;

public class B extends Thread{
	
	String name;
	
	public B(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(this.name);
	}

}
