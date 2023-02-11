class P {
	public void m1() {
		System.out.println("m1 method .. From Parent P");
	}
}
class C extends P {
	public void m1() {
		System.out.println("m1 method .. From Child C");
	}
	public void m2() {
		System.out.println("m2 method .. From Child C");
	}
}
class GC extends C {
	public void m2() {
		System.out.println("m2 method .. From grand child GC");
	}
}
public class PolymorphismConcept {

	public static void main(String[] args) {
		P p = new GC();
		p.m1();
		//p.m2();// ye line error throw karega , becoz P me m2 method ni hai.
	}
}
