package bank;

public class account {
String id,name;
double balance;
public String getid() {
	return id;
}
public void setid(String id) {
	this.id=id;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}
public double getbalance() {
	return balance;
}
public void setbalance(double balance) {
	this.balance=balance;
}
public account(String id,String name,double balance) {
	this.id=id;
	this.name=name;
	this.balance=balance;
}
public account() {
	this.id="";
	this.name="";
	this.balance=0;
}
public void deposise(double money) {
	this.balance=this.balance+money;
}//��Ǯ�ķ���
public void withdraw(double money) {
	if(this.balance<money) {
		System.out.println("������㣬����ȡǮ");
	return;
}
    this.balance=this.balance-money;	
}//ȡǮ�ķ���
public void changemoney(account other,double money) {
	if(this.balance<money) {
		System.out.println("�������");
	return;
}
	this.balance=this.balance-money;
	other.balance=other.balance+money;
}
public void print() {
	System.out.println("�˺�:"+id+"����:"+name+"���"+balance);
}
}