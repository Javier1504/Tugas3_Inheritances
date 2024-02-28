package id.its.pbo.quadrilateral;

	public class Square extends Parallelogram {
		public Square( double x1, double y1, double x2, double y2,
				double x3, double y3, double x4, double y4 ) {
			super( x1, y1, x2, y2, x3, y3, x4, y4 );
			}
		public double getSide() {
			 if ( getP().getY() == getQ().getY() ) {
			 
				 return Math.abs( getQ().getY() - getR().getY() );
		 	}
			 else { 
				 return Math.abs( getP().getY() - getQ().getY() );
		 	}
		 }
		public String toString() {
			return String.format( "\n%s:\n%s%s: %s\n%s: %s\n","Coordinates of Square are", getCoordinatesAsString(),
					"Side is", getSide(), "Area is", getArea() );
			} 
		}