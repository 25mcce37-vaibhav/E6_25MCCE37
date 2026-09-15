package Q_1_demo;

public abstract class Q_1_abstract{
	protected double dim1;
	protected double dim2;
	public Q_1_abstract(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	public abstract double area();
}