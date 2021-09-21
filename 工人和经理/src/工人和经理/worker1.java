package 工人和经理;

public class worker1 {
public static void main(String[] args) {
	worker p1=new worker("张三",200,20);
	p1.all();
	p1.print();
	worker p2=new worker("李四",250,30);
	p2.all();
	p2.print();
	manager p3=new manager("王总",8000,5);
	p3.increasing();
	p3.print();
}
}