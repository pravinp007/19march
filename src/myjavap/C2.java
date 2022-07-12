package myjavap;

public class C2 {

	public static void main(String[] args) {
		C12 p1 = new C12();
		p1.b();
		C1.a1();
		C2.b1();
		C1 p3 = new C1();
		p3.a2();
		C2 p4 = new C2();
		p4.b2();

	}

	public static void b1() {
		System.out.println("hi this is b1");
	}

	public void b2() {
		System.out.println("hi this is b2");
	}
}
