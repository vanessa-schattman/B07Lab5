package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadrilateralTest1 {
	
	@Test
	public void testSquarePerimeter() throws Exception {
	    Point A = new Point(0, 1);
	    Point B = new Point(1, 1);
	    Point C = new Point(1, 0);
	    Point D = new Point(0, 0);
	    Quadrilateral square = new Quadrilateral(A, B, C, D);
	    assertEquals(4.0, square.perimeter());
	}

	@Test
	public void testRectanglePerimeter() throws Exception {
	    Point A = new Point(0, 2);
	    Point B = new Point(1, 2);
	    Point C = new Point(1, 0);
	    Point D = new Point(0, 0);
	    Quadrilateral rectangle = new Quadrilateral(A, B, C, D);
	    assertEquals(6.0, rectangle.perimeter());
	}
	
	@Test
	public void testRhombicPerimeter() throws Exception {
	    Point A = new Point(3, 4);
	    Point B = new Point(8, 4);
	    Point C = new Point(5, 0);
	    Point D = new Point(0, 0);
	    Quadrilateral rhombic = new Quadrilateral(A, B, C, D);
	    assertEquals(20.0, rhombic.perimeter());
	}
	
	@Test
	public void testParallelogramPerimeter() throws Exception {
	    Point A = new Point(3, 4);
	    Point B = new Point(4, 4);
	    Point C = new Point(1, 0);
	    Point D = new Point(0, 0);
	    Quadrilateral parallelogram = new Quadrilateral(A, B, C, D);
	    assertEquals(12.0, parallelogram.perimeter());
	}

	@Test
	public void testQuadrilateralPerimeter() throws Exception {
	    Point A = new Point(3, 4);
	    Point B = new Point(4, 4);
	    Point C = new Point(7, 0);
	    Point D = new Point(0, 0);
	    Quadrilateral quad = new Quadrilateral(A, B, C, D);
	    assertEquals(18.0, quad.perimeter());
	}

	@Test
    public void testIsParallelogram() throws Exception {
		Point A = new Point(3, 4);
	    Point B = new Point(4, 4);
	    Point C = new Point(1, 0);
	    Point D = new Point(0, 0);
        Quadrilateral parallelogram = new Quadrilateral(A, B, C, D);
        assertTrue(parallelogram.is_parallelogram());

        A = new Point(4, 4);
        B = new Point(5, 10);
        C = new Point(1, 0);
        D = new Point(0, 0);
        Quadrilateral nonParallelogram = new Quadrilateral(A, B, C, D);
        assertFalse(nonParallelogram.is_parallelogram());
    }

    @Test
    public void testIsRectangle() throws Exception {
        Point A = new Point(0, 2);
        Point B = new Point(1, 2);
        Point C = new Point(1, 0);
        Point D = new Point(0, 0);
        Quadrilateral rectangle = new Quadrilateral(A, B, C, D);
        assertTrue(rectangle.is_rectangle());
        
        A = new Point(0, 1);
        B = new Point(1, 1);
        C = new Point(1, 0);
        D = new Point(0, 0);
        Quadrilateral square = new Quadrilateral(A, B, C, D);
        assertTrue(square.is_rectangle());

        A = new Point(3, 3);
        B = new Point(5, 10);
        C = new Point(2, 0);
        D = new Point(0, 0);
        Quadrilateral parallelogram = new Quadrilateral(A, B, C, D);
        assertFalse(parallelogram.is_rectangle());
    }

    @Test
    public void testIsRhombic() throws Exception {
    	Point A = new Point(3, 4);
	    Point B = new Point(8, 4);
	    Point C = new Point(5, 0);
	    Point D = new Point(0, 0);
        Quadrilateral rhombic = new Quadrilateral(A, B, C, D);
        assertTrue(rhombic.is_rhombic());

        A = new Point(0, 1);
        B = new Point(1, 1);
        C = new Point(1, 0);
        D = new Point(0, 0);
        Quadrilateral square = new Quadrilateral(A, B, C, D);
        assertTrue(square.is_rhombic());

        A = new Point(3, 4);
        B = new Point(5, 10);
        C = new Point(2, 0);
        D = new Point(0, 0);
        Quadrilateral nonrhombic = new Quadrilateral(A, B, C, D);
        assertFalse(nonrhombic.is_rhombic());
    }

    @Test
    public void testIsSquare() throws Exception {
        Point A = new Point(0, 1);
        Point B = new Point(1, 1);
        Point C = new Point(1, 0);
        Point D = new Point(0, 0);
        Quadrilateral square = new Quadrilateral(A, B, C, D);
        assertTrue(square.is_square());

        A = new Point(0, 2);
        B = new Point(1, 2);
        C = new Point(1, 0);
        D = new Point(0, 0);
        Quadrilateral rectangle = new Quadrilateral(A, B, C, D);
        assertFalse(rectangle.is_square());

        A = new Point(3, 4);
        B = new Point(8, 4);
        C = new Point(5, 0);
        D = new Point(0, 0);
        Quadrilateral rhombic = new Quadrilateral(A, B, C, D);
        assertFalse(rhombic.is_square());
    }


}
