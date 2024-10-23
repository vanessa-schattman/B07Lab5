package B07lab5;

public class Circle {
	Point tangent_point;
	Point center;

	Circle(Point center, Point tangent_point) {
		this.tangent_point = tangent_point;
		this.center = center;
	}

	double Radius() {
		double Power = Math.pow(tangent_point.y - center.y, 2) + Math.pow(tangent_point.x - center.x, 2);
		return Math.sqrt(Power);
	}
	double Diameter() {
		double radius = this.Radius();
		return 2 * radius;
	}

	double Circumference() {
		double radius = this.Radius();
		return  2 * Math.PI * radius;
	}
	double Area() {
		double radius = this.Radius();
		return radius * radius * Math.PI;
	}
}
