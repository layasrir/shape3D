
public class Rectangles3D implements Shape3D {
	
	//private fields
	private double length;
	private double width;
	private double height;
	
	//getters
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	
	//setters
	public double setLength(double l) {
		return this.length = l;
	}
	public double setWidth(double w) {
		return this.width = w;
	}
	public double setheight(double h) {
		return this.height = h;
	}
	
	//constructors
	
	//instance methods
	 public double getSurfaceArea();
	 public double getVolume();
	 public int compareTo(Shape3D other);
	
}
