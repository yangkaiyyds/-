package shape;

public class Testshape3 {
public double sumCircle(Circle[] circles) {
	double sum=0;
	for(int i=0;i<circles.length;i++)
		sum+=circles[i].getArea();
	return sum;
}
public double sumRectangle(Rectangle[] rectangle) {
	double sum=0;
	for(int i=0;i<rectangle.length;i++)
		sum+=rectangle[i].getArea();
	return sum;
}
public static void main(String[] args) {
	Circle[] c=new Circle[2];
	Rectangle[] r=new Rectangle[2];
	c[0]=new Circle(3);
	c[1]=new Circle(4);
	r[0]=new Rectangle(4,3);
	r[1]=new Rectangle(5,4);
	Testshape3 ts=new Testshape3();
	System.out.println("sumCircle="+ts.sumCircle(c));
	System.out.println("sumRectangle="+ts.sumRectangle(r));
}
}