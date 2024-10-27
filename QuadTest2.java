package B07lab5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QuadTest2 {

	@Test
	void testPerimeter() throws Exception {
		Point A = new Point(1, 1);
		Point B = new Point(2, 1);
		Point C = new Point(1, -1);
		Point D = new Point(-1, -1);
		Quadrilateral quadrilateral = new Quadrilateral(A, B, C, D);
		double ExpectPerimeter = 3 + Math.sqrt(8) + Math.sqrt(5);
		assertEquals(quadrilateral.perimeter(), ExpectPerimeter);
		}
	
	@Test
	void testParallelgram() throws Exception {
		Point A = new Point(1, 1);
		Point B = new Point(2, 1);
		Point C = new Point(1, -1);
		Point D = new Point(-1, -1);
		Quadrilateral quadrilateral = new Quadrilateral(A, B, C, D);
		assertFalse(quadrilateral.is_parallelogram());
		}
	
	@Test
	void testParallelgram2() throws Exception {
		Point A = new Point(1, 1);
		Point B = new Point(2, 1);
		Point C = new Point(2, -1);
		Point D = new Point(1, -1);
		Quadrilateral quadrilateral = new Quadrilateral(A, B, C, D);
		assertTrue(quadrilateral.is_parallelogram());
		}
	
	@Test
	void testRectangle() throws Exception {
		Point A = new Point(1, 1);
		Point B = new Point(2, 1);
		Point C = new Point(4, -1);
		Point D = new Point(-1, -1);
		Quadrilateral quadrilateral = new Quadrilateral(A, B, C, D);
		assertFalse(quadrilateral.is_rectangle());
		}
	
	@Test
	void testRectangle1() throws Exception {
		Point A = new Point(1, 1);
		Point B = new Point(2, 1);
		Point C = new Point(2, -1);
		Point D = new Point(1, -1);
		Quadrilateral quadrilateral = new Quadrilateral(A, B, C, D);
		assertTrue(quadrilateral.is_rectangle());
		}
	
	@Test
	void testRectangle2() throws Exception {
		Point A = new Point(1, 1);
		Point B = new Point(2, 1);
		Point C = new Point(3, -1);
		Point D = new Point(2, -1);
		Quadrilateral quadrilateral = new Quadrilateral(A, B, C, D);
		assertFalse(quadrilateral.is_rectangle());
		}
	
	@Test
	void testRhombic() throws Exception {
		Point A = new Point(1, 1);
		Point B = new Point(3, 1);
		Point C = new Point(3, -1);
		Point D = new Point(1, -1);
		Quadrilateral quadrilateral = new Quadrilateral(A, B, C, D);
		assertTrue(quadrilateral.is_rhombic());
	}
	
	@Test
	void testRhombic1() throws Exception {
		Point A = new Point(1, 1);
		Point B = new Point(3, 1);
		Point C = new Point(2, -1);
		Point D = new Point(1, -1);
		Quadrilateral quadrilateral = new Quadrilateral(A, B, C, D);
		assertFalse(quadrilateral.is_rhombic());
	}
	
	
	@Test
	void testSquare() throws Exception {
		Point A = new Point(1, 1);
		Point B = new Point(2, 1);
		Point C = new Point(2, -1);
		Point D = new Point(1, -1);
		Quadrilateral quadrilateral = new Quadrilateral(A, B, C, D);
		assertFalse(quadrilateral.is_square());
	}
	
	@Test
	void testSquare1() throws Exception {
		Point A = new Point(1, 1);
		Point B = new Point(3, 1);
		Point C = new Point(3, -1);
		Point D = new Point(1, -1);
		Quadrilateral quadrilateral = new Quadrilateral(A, B, C, D);
		assertTrue(quadrilateral.is_square());
	}
}
