package DepositAccount;

public class bank {
public static void main(String[] args) {
	DepositAccount wangwu=new DepositAccount("003","ÍõÎå",10000,365);
	CreditAccount LiLi=new CreditAccount("004","ÀîÀö",1000,5000);
	wangwu.deposite(1000);
	wangwu.withdraw(500);
	LiLi.deposise(2000);
	LiLi.withdraw(30000);
}
}
