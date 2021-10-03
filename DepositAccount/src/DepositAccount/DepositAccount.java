package DepositAccount;

import java.util.Date;

public class DepositAccount extends account{
private int term;
public int getterm()
{
	return term;
}
public void setterm(int term)
{
	this.term=term;
}
public DepositAccount(String id,String name,double balance,int term) {
	super(id,name,balance);
	this.term=term;
}
public void deposite(double money) {
	System.out.println("定期账户不能再次存钱");
}
public void withdraw(double money) {
	Date d1=new Date();
	int time=(int)(d1.getTime()-this.getDatetime().getTime())/1000/3600/24;
	if(time<this.getTerm()) {
		System.out.println("定期存款不到期，不能支取");
	}
	
	if(money!=this.getBalance()) {
		System.out.println("定期存款必须一次全部支取");
	}
	this.Balance(0);
}private Date getDatetime() {
	// TODO 自动生成的方法存根
	return null;
}
public void changeMoney(account other,double money) {
	System.out.println("定期账户不能转账");
}
private void Balance(int i) {
	// TODO 自动生成的方法存根
	
}
private double getBalance() {
	// TODO 自动生成的方法存根
	return 0;
}
private int getTerm() {
	// TODO 自动生成的方法存根
	return 0;
}
}
