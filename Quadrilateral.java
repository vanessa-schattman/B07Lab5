package lab5;

public class Quadrilateral {
// the order of the point matters
	Point A;
	Point B;
	Point C;
	Point D;
	
	// create a quadrilateral ABCD
	public Quadrilateral(Point A, Point B, Point C, Point D)  throws Exception
	{
		if(A.x > B.x || C.x < D.x || B.y < C.y || A.y < D.y) 
		{ throw new Exception("the order matters");}
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public double perimeter()
	{
		return A.distance(B) + A.distance(D) + C.distance(D) + C.distance(B);
	}
	
	
	
	public boolean is_parallelogram() 
	{
		return (A.distance(B) == C.distance(D)) && (A.distance(D) == B.distance(C)); 
	}
	
	// helper
	public static double dotProduct(Point p1, Point p2, Point p3)
	{
        double vector1x = p2.x - p1.x;
        double vector1y = p2.y - p1.y;
        double vector2x = p3.x - p2.x;
        double vector2y = p3.y - p2.y;
        return vector1x * vector2x + vector1y * vector2y;
    }
	
	
	public boolean is_rectangle()
	{
        if (! this.is_parallelogram())   return false;
        if (dotProduct(A, B, C) != 0 || dotProduct(B, C, D) != 0 || dotProduct(C, D, A) != 0 || dotProduct(D, A, B) != 0)
        {
            return false;
        }
        return true;
	}
	
	public boolean is_rhombic() 
	{
		return (A.distance(B) == C.distance(D)) && (A.distance(D) == C.distance(B)) && (A.distance(B) == D.distance(A)); 
	}
	
	public boolean is_square() 
	{
		return this.is_rectangle() && this.is_rhombic();
	}
}

