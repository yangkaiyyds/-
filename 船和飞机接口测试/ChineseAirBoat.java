package ���ͷɻ��ӿڲ���;

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
	System.out.println("�ҵ��ͺ���:"+type+";������:"+speed+"���ٶȺ���");
}
public void fly (double speed) {
	System.out.println("�ҵ��ͺ���:"+type+";������:"+speed+"���ٶȷ���");
}
public static void main(String[] args) {
	IAirBoat airboat=new ChineseAirBoat("����-600");
	airboat.fly(1000);
	airboat.sail(500);
	IShip ship=new ChineseAirBoat("����-500");
	ship.sail(400);
	//ship.fly(800);//ship��fly������
}
}
