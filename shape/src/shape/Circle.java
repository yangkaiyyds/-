package shape;

public class Circle extends shape{
private double radius;
public double getradius() {
	return radius;
}
public void setradius(double radius)
{
    this.radius=radius;	
}
public Circle(double radius) {
	this.radius=radius;
}
public double getArea() {
	return Math.PI*radius*radius;
}
public double getperimeter() {
	return 2*Math.PI*radius;
}
@Override
public double getPerimeter() {
	// TODO Auto-generated method stub
	return 0;
}
}