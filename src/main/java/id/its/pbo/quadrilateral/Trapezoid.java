package id.its.pbo.quadrilateral;

public class Trapezoid extends Quadrilateral {
	private double height;
	 // height of trapezoid
	 
	// Trapezoid constructor
	 public Trapezoid( double x1, double y1, double x2, double y2,
			 double x3, double y3, double x4, double y4 ) {
	
		 super( x1, y1, x2, y2, x3, y3, x4, y4 );
	 }
	 public double getHeight() {
		 if ( getP().getY() == getQ().getY() ) {
		 
			 return Math.abs( getQ().getY() - getR().getY() );
	 	}
		 else { 
			 return Math.abs( getP().getY() - getQ().getY() );
	 	}
	 }
	 public double getArea() {
		 return getSumOfParallelSide() * getHeight() / 2.0;
	 }
	 public double getSumOfParallelSide() {
		 if ( getP().getY() == getQ().getY() ) {
			 return Math.abs( getP().getX() - getQ().getX() ) +
					 Math.abs( getR().getX() - getS().getX() );
		 }
		 else {
			 return Math.abs( getQ().getX() - getR().getX() ) +
					 Math.abs( getS().getX() - getP().getX() );
		 }
	 } 
	 public String toString() {
		 return String.format( "\n%s:\n%s%s: %s\n%s: %s\n","Coordinates of Trapezoid are", getCoordinatesAsString(),"Height is", getHeight(), "Area is", getArea() );
	 }
}