package DepositAccount;

public class CreditAccount extends account{
private double overdraftMoney;
public  CreditAccount(String id,String name,double balance,double overdraftMoney) {
	this.overdraftMoney=overdraftMoney;
}
public double getoverdraftMoney() {
	return overdraftMoney;
}
public void setoverdraftMoney(double overdraftMoney) {
	this.overdraftMoney=overdraftMoney;
}
public void withdraw(double money) {
	if(money>(this.getbalance()+this.getoverdraftMoney())) {
		System.out.println("支取金额超过限度，不能支取");
		return;
	}
	this.setbalance(this.getbalance()-money);
}
public void changeMoney(account other,double money) {
	if(money>(this.getbalance()+this.getoverdraftMoney())) {
		System.out.println("支取金额超过限度，不能支取");
		return;
	}
	this.setbalance(this.getbalance()-money);
	other.setbalance(other.getbalance()+money);
}
public void deposise(int money) {
	// TODO 自动生成的方法存根
	
}
}
