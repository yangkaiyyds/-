package shape;

public class Testshape2 {
public static void main(String[] args) {
	shape shape1=new Circle(3);
	System.out.println("shape1.getArea()="+shape1.getArea());
	shape shape2=new Rectangle(5,4);
	System.out.println("shape2.getPerimeter()="+shape2.getPerimeter());
	Circle c1=(Circle)shape1;
	System.out.println("c1.getArea()="+c1.getArea());
}
}
