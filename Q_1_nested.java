package Q_1_demo;


class A{
	int a = 3;
	void display() {
		System.out.println("In the outer class a = " + a);
//		displayB;
		B b1 = new B();
		b1.displayB();
	}
	class B{
		void displayB() {
			System.out.println("In  the Inner class a = " + a );
			display();
		}
		{
		for(int i =0;i<10;i++) {
			class C {
				void display() {
					System.out.println("from the Inner class in method a = " + a);
					}
				}
			C c1 = new C();
			c1.display();
			}
		}		
	}

}
public class Q_1_nested{
	public static void main() {
		A a2 = new A();
		A.B b2 = a2.new B();
		b2.displayB();
		
	}
	
}
