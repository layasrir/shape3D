
public class Circles3D implements Shape3D {

	//private fields
	private double radius;
	private double height;
	
	//getters
	public double getRadius() {
		return this.radius;
	}
	public double getHeight() {
		return this.height;
	}
	
	//setters
	public double setRadius(double w) {
		return this.radius = w;
	}
	public double setheight(double h) {
		return this.height = h;
	}
	
	//constructors
	
	//instance methods
	 public double getSurfaceArea() {
		 return (((2*radius)*height) + (2 * Math.PI * radius * radius));
	 }
	 public double getVolume() {
		 return (Math.PI * radius * radius * height);
	 }
	 public int compareTo(Shape3D other);
}
