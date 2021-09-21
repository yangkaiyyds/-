package 工人和经理;

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
public void all() {
	 this.salary=this.salary*this.day;
}
public void print() {
	System.out.println(name+"每月工资:"+salary);
}
}
