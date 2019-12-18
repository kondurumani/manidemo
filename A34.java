public class A34
{
	void m1()
	{
		System.out.println("m1 method");
	}
	void m2() 
	{
		System.out.println("m2 method");
	}
	class B extends A{
		void m3() 
		{
			System.out.println("m3 methods");
		}
		void m4() {
			System.out.println("m4 method");
		}
		class C extends B{
			void m5() {
				System.out.println("m5 method");
			}
			void m6() {
				System.out.println("m6 method");
			}
			public  void main(String[] args) {
B b=new B();
b.m1();
			}
		}}}
