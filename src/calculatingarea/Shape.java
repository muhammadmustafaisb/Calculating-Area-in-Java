package calculatingarea;

public abstract class Shape {
	
	public abstract double area() ;



}

class Rectangle extends Shape{
	
	private double l1;
	private double l2;
	
	
	public double getL2() {
		return l2;
	}

	public void setL2(double l2) {
		this.l2 = l2;
	}

	public double getL1() {
		return l1;
	}

	public void setL1(double ll1) {

		this.l1 = ll1;
	}
	

	@Override
	public double area() {
		
		double R = 2*(l1+l2);
		System.out.println("The Rectangle Area " +R);
		return R;
	}
	
}

class Circle extends Shape{

	private double c1;
	
	public double getC1() {
		return c1;
	}

	public void setC1(double c1) {
		this.c1 = c1;
	}

	@Override
	public double area() {
		
		double C = 3.14*(c1);
		System.out.println("Area of Cricle is " +C);
		return C;
	}
	
}