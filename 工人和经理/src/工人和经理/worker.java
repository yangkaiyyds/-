package ���˺;���;

public class worker {
String name;
int salary;
int day;
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}
public int getsalary() {
	return salary;
}
public void setsalary(int salary) {
	this.salary=salary;
}
public int getday() {
	return day;
}
public void setday(int day) {
	this.day=day;
}
public worker(String name,int salary,int day) {
	this.name=name;
	this.salary=salary;
	this.day=day;
}
public worker() {
	this.name="����";
	this.salary=250;
	this.day=30;
}
public int getall() {
	return salary*day;
}
public void main(String[] args) {
	worker r1=new worker(this.name,this.salary,this.day);
	System.out.println("����"+r1.name);
	System.out.println("�չ���"+r1.salary);
	System.out.println("�¹���"+r1.getall());
}
}