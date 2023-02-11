class A extends Thread {
	public void m1() {
		System.out.println("public void m1");
	}

	public static void m2() {
		System.out.println("public static void m2");
	}

	public synchronized void m3() {
		System.out.println("public synchronized void m3");
	}

	public static synchronized void m4() {
		System.out.println("public static synchronized void m4");
	}
//	public void run() {
//		m1();
//		m2();
//		m3();
//		m4();
//	}
}

public class Multithreading {
	public static void main(String[] args) {
		A t1 = new A();
		A t2 = new A();
//		a1.start();
//		a2.start();
		t1.m1();
		t2.m1();
		
		A.m2();
		A.m2();
		
		t1.m3();
		t2.m3();
		
		A.m4();
		A.m4();
		
		
	}
}
