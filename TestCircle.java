package B07lab5;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCircle{
    @Test
    public void testRadius(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Circle c = new Circle(p1, p2);
        assertTrue(c.Radius() == 1);
    }

    @Test
    public void testDiameter(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Circle c = new Circle(p1, p2);
        assertTrue(c.Diameter() == 2);
    }

     @Test
    public void testCircumference(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Circle c = new Circle(p1, p2);
        assertTrue(c.Circumference() == 2 * Math.PI);
    }

     @Test
    public void testArea(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Circle c = new Circle(p1, p2);
        assertTrue(c.Area() == Math.PI);
    }

}
