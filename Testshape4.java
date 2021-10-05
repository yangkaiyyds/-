package shape;

public class Testshape4 {
public double sumshape(shape[] a) {
	double sum=0;
	for(int i=0;i<a.length;i++)
		sum+=a[i].getArea();
	return sum;
}
public static void main(String[] args) {
	shape[] s=new shape[4];
	s[0]=new Circle(3);
	s[1]=new Circle(4);
	s[2]=new Rectangle(4,3);
	s[3]=new Rectangle(5,4);
	Testshape4 ts=new Testshape4();
	System.out.println("sumshape="+ts.sumshape(s));
}
}
