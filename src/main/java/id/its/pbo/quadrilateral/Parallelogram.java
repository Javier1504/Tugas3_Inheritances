package id.its.pbo.quadrilateral;

	public class Parallelogram extends Trapezoid {
		public Parallelogram( double x1, double y1, double x2, double y2,
				double x3, double y3, double x4, double y4 ) {
			super( x1, y1, x2, y2, x3, y3, x4, y4 );
	 }
		public double getWidth() {
			if ( getP().getY() == getQ().getY() ) {
				return Math.abs( getP().getX() - getQ().getX() );
			
			}
			else {
				return Math.abs( getQ().getX() - getR().getX() );
			}
		}
		public double getBase() {
			 if ( getP().getY() == getQ().getY() ) {
				 return Math.abs( getP().getX() - getQ().getX() ) ;
			 }
			 else {
				 return Math.abs( getQ().getX() - getR().getX() ) ;
			 }
		 } 
		public String toString() {
			return String.format( "\n%s:\n%s%s: %s\n%s: %s\n%s: %s\n", "Coordinates of Parallelogram are", getCoordinatesAsString(),
					"Width is", getWidth(), "Height is", getHeight(), "Area is", getArea() );
	 } 
	}
	