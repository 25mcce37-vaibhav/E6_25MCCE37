package Test;
import Q_1_demo.Q_1_abstract;
import Q_1_demo.Q_1_Rectangle;
import Q_1_demo.Q_1_triangle;

public class Q_1_Abstract_test {
	public static void main(String[] args) {
//		Q_1_abstract a1 = new Q_1_abstract(1,3);
		
		Q_1_Rectangle r1 = new Q_1_Rectangle(1,3);
		
		System.out.println("area of the rectangle is " + r1.area());
	}
}
