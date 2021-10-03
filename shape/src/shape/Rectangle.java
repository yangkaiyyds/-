package shape;

public class Rectangle extends shape{
private double x,y;
public double getx() {
	return x;
}
public void setx(double x) {
	this.x=x;
}
public double gety() {
	return y;
}
public void sety(double y) {
	this.y=y;
}
public Rectangle(double x,double y)
{
	this.x=x;
	this.y=y;
}
public double getArea() {
	return x*y;
}
public double getPerimeter() {
	return 2*(x+y);
}
}
