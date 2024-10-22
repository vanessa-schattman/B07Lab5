package lab5;

import org.junit.jupiter.api.Test;

public class Triangle {
	Point A;
	Point B;
	Point C;
	
	public Triangle(Point A, Point B, Point C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(A);
	}
	
	public boolean isEquilateral() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCA = C.distance(A);
		//System.out.println(dAB + " " + dBC + " " + dCA);
		if(dAB==dBC && dBC==dCA)
			return true;
		else
			return false;
	}
	
}
