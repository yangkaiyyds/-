package 船和飞机接口测试;

public class FighterPlane implements IPlane{
private String name;
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}
public FighterPlane(String name) {
	this.name=name;
}
public void fly(double speed) {
	System.out.println("my name is"+name+";my speed is"+speed);
}
public static void main(String[] args) {
	IPlane plane=new FighterPlane("¼ß20");
	plane.fly(2000);
}
}
