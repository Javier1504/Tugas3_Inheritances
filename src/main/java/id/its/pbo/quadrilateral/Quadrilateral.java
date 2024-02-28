package id.its.pbo.quadrilateral; 

// Super Class
public class Quadrilateral {
	
	 private Point point1; 
	 private Point point2; 
	 private Point point3; 
	 private Point point4; 
	 
	 // Super Construction
	 public Quadrilateral( double x1, double y1, double x2, double y2, double x3,
			 double y3, double x4, double y4 ) {
		 
	 this.point1 = new Point( x1, y1 );
	 this.point2 = new Point( x2, y2 );
	 this.point3 = new Point( x3, y3 );
	 this.point4 = new Point( x4, y4 );
	 }
	 public Point getP() {
		 return point1;
	 }
	 public Point getQ() {
		 return point2;
	 }
	 public Point getR() {
		 return point3;
	 }
	 public Point getS() {
		 return point4;
	 }
	 
	 public String toString() {
		 return String.format("All Quadrilateral Coordinates: (%.1f, %.1f), (%.1f, %.1f), (%.1f, %.1f), (%.1f, %.1f)", 
					point1.getX(), point1.getY(), point2.getX(), point2.getY(), 
					point3.getX(), point3.getY(), point4.getX(), point4.getY());
		 }
	 public String getCoordinatesAsString() {
		 return String.format("%s, %s, %s, %s\n", point1, point2, point3, point4 );
	 }

}