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
	System.out.println("�����˻������ٴδ�Ǯ");
}
public void withdraw(double money) {
	Date d1=new Date();
	int time=(int)(d1.getTime()-this.getDatetime().getTime())/1000/3600/24;
	if(time<this.getTerm()) {
		System.out.println("���ڴ����ڣ�����֧ȡ");
	}
	
	if(money!=this.getBalance()) {
		System.out.println("���ڴ�����һ��ȫ��֧ȡ");
	}
	this.Balance(0);
}private Date getDatetime() {
	// TODO �Զ����ɵķ������
	return null;
}
public void changeMoney(account other,double money) {
	System.out.println("�����˻�����ת��");
}
private void Balance(int i) {
	// TODO �Զ����ɵķ������
	
}
private double getBalance() {
	// TODO �Զ����ɵķ������
	return 0;
}
private int getTerm() {
	// TODO �Զ����ɵķ������
	return 0;
}
}
