package bank;

public class bank1 {
public static void main(String[] args) {
	account zhangsan=new account("001","����",1000);
	account lisi=new account("002","����",1000);
	zhangsan.deposise(2000);
	lisi.withdraw(500);
	zhangsan.changemoney(lisi,300);
	zhangsan.print();
	lisi.print();
}
}
