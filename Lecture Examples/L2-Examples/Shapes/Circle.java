package Shapes;

///////////////////////////////////////////////////////////
class Circle extends Shape 
{
	/** The radius of the circle */
	private double radius = 1;
	
	/** Construct a circle with a specified radius */
	public Circle(double newRadius) {
		this.radius = newRadius; // equivalent to   radius = newRadius;
	}
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double  newRadius) {
		this.radius = newRadius;
	}
			
	@Override // highlight mistake if you mispell the function name from parent class
	public double findArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public boolean equals(Object obj){
		// because we passed an obj into the function, we have to cast it into the class 
		return this.radius == ((Circle) obj)).radius );
	}
	
	@Override
	public String toString() {
		return "Circle radius = " + this.radius; // + getRadius() does not work 
	}
}
//////////////////////////////////////////////////////////////////
