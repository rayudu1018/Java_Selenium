package Maps;

class A{
	String name = "Hello";
}
class B{
	A obja = new A();
}
class C extends B{
	public static void main(String[] args) {
		C objc = new C();
		objc.print();
	}
	public void print() {
		System.out.println(super.obja.name);
	}
}