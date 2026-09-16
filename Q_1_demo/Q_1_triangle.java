package Q_1_demo;

public class Q_1_triangle extends Q_1_abstract {
	public Q_1_triangle(double dim1 , double dim2) {
		super(dim1 ,dim2);
	}
	
	public double area() {
		return (dim1*dim2)/2;
	}
	
}
