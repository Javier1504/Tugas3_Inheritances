package id.its.pbo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import id.its.pbo.quadrilateral.*;

class QuadrilateralTest {
	Point point;
	Quadrilateral q;
	Trapezoid t;
	Parallelogram p;
	Rectangle r;
	Square s;
	
	@BeforeEach
	void setUp() throws Exception {
		point = new Point(3.0, 5.0);
		q = new Quadrilateral(2.0, 4.0, 8.0, 4.0, 7.0, 8.0, 3.0, 8.0);
		t = new Trapezoid(2.0, 1.0, 8.0, 1.0, 5.0, 10.0, 2.0, 10.0);
		p = new Parallelogram(3.0, 2.0, 9.0, 2.0, 12.0, 6.0, 6.0, 6.0);
		r = new Rectangle(3.0, 3.0, 8.0, 3.0, 8.0, 5.0, 3.0, 5.0);
		s = new Square(3.0, 2.0, 6.0, 2.0, 3.0, 5.0, 6.0, 5.0);
	}
	
	@Test
	@DisplayName("Mendapatkan nilai x dan y dari suatu titik")
	void testPoint() {
		assertEquals(3.0, point.getX());
		assertEquals(5.0, point.getY());
	}
	
	@Test
	@DisplayName("Mendapatkan nilai x dan y untuk masing-masing point")
	void testQuadrilateral() {
		assertEquals(2.0, q.getP().getX());
		assertEquals(4.0, q.getP().getY());
		
		assertEquals(8.0, q.getQ().getX());
		assertEquals(4.0, q.getQ().getY());
		
		assertEquals(7.0, q.getR().getX());
		assertEquals(8.0, q.getR().getY());
		
		assertEquals(3.0, q.getS().getX());
		assertEquals(8.0, q.getS().getY());
	}
	
	@Test
	@DisplayName("Test toString pada Quadrilateral")
	void testToStringQuadrilateral() {
		assertEquals("All Quadrilateral Coordinates: (2.0, 4.0), (8.0, 4.0), (7.0, 8.0), (3.0, 8.0)", q.toString());
	}
	
	@Test
	@DisplayName("Mendapatkan tinggi trapezoid")
	void testHeightTrapezoid() {
		assertEquals(9, t.getHeight());
	}
	
	@Test
	@DisplayName("mendapatkan jumlah sisi sejajar trapezoid")
	void testSumOfParallelSideTrapezoid() {
		assertEquals(9, t.getSumOfParallelSide());
	}
	
	@Test
	@DisplayName("Mendapatkan luas trapezoid")
	void testAreaTrapezoid() {
		assertEquals(40.5, t.getArea());
	}
	
	@Test
	@DisplayName("Mendapatkan tinggi parallelogram")
	void testHeightParalleogram() {
		assertEquals(4, p.getHeight());
	}
	
	@Test
	@DisplayName("Mendapatkan alas parallelogram")
	void testbaseParallelogram() {
		assertEquals(6, p.getBase());
	}
	
	@Test
	@DisplayName("Mendapatkan luas parallelogram")
	void testAreaParallelogram() {
		assertEquals(24, p.getArea());
	}
	
	@Test
	@DisplayName("Mendapatkan area dari rectangle")
	void testAreaRectangle() {
		assertEquals(10, r.getArea());
	}
	
	@Test
	@DisplayName("Mendapatkan panjang sisi square")
	void testSideSquare() {
		assertEquals(3, s.getSide());
	}
	
	@Test
	@DisplayName("Mendapatkan luas dari square")
	void testAreaSquare() {
		assertEquals(9, s.getArea());
	}
}
