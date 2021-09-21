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
}//存钱的方法
public void withdraw(double money) {
	if(this.balance<money) {
		System.out.println("你的余额不足，不能取钱");
	return;
}
    this.balance=this.balance-money;	
}//取钱的方法
public void changemoney(account other,double money) {
	if(this.balance<money) {
		System.out.println("你的余额不足");
	return;
}
	this.balance=this.balance-money;
	other.balance=other.balance+money;
}
public void print() {
	System.out.println("账号:"+id+"户名:"+name+"余额"+balance);
}
}