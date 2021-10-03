package shape;

public class PI {
public static void main(String[] args) {
	int account=10000;
	int sam=0;
	for(int i=0;i<10000;i++)
	{
	double x=Math.random();
	double y=Math.random();
	if(x*x+y*y<1)
		sam++;
	}
	System.out.println("PI="+(double)4*sam/account);
}
}
