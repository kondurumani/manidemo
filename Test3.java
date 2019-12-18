public class Test3 {
void m1() {
	m2();
	m3();
	System.out.println("m1 method");

}
void m2() {
	System.out.println("m2 method");
}
void m3() {
	System.out.println("m3 method");
}
public static void main(String[] args) {
	Test3 t=new Test3();
	t.m1();
}
}
