import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class TestCircle{
    @Test
    public void testRadius(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Circle c = new Circle(p1, p2);
        assertEquals(c.Radius(), 1);
    }

    @Test
    public void testDiameter(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Circle c = new Circle(p1, p2);
        assertEquals(c.Diameter(), 2);
    }

     @Test
    public void testCircumference(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Circle c = new Circle(p1, p2);
        assertEquals(c.Diameter(), 2 * Math.PI);
    }

     @Test
    public void testArea(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Circle c = new Circle(p1, p2);
        assertEquals(c.Diameter(), Math.PI);
    }

}
