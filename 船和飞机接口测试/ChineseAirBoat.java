package 船和飞机接口测试;

public class ChineseAirBoat implements IAirBoat{
private String type;
public String gettype() {
	return type;
}
public void settype(String type) {
	this.type=type;
}
public ChineseAirBoat (String type) {
	this.type=type;
}
public void sail(double speed) {
	System.out.println("我的型号是:"+type+";我能以:"+speed+"的速度航行");
}
public void fly (double speed) {
	System.out.println("我的型号是:"+type+";我能以:"+speed+"的速度飞行");
}
public static void main(String[] args) {
	IAirBoat airboat=new ChineseAirBoat("蛟龙-600");
	airboat.fly(1000);
	airboat.sail(500);
	IShip ship=new ChineseAirBoat("蛟龙-500");
	ship.sail(400);
	//ship.fly(800);//ship无fly方法；
}
}
