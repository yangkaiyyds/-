package 工人和经理;

public class manager {
String name;
int wage;
int month;
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}
public int getwage() {
	return wage;
}
public void setwage(int wage) {
	this.wage=wage;
}
public int month() {
	return month;
}
public manager(String name,int wage,int month) {
	this.name=name;
	this.wage=wage;
	this.month=month;
}
public void setmonth(int month) {
	this.month=month;
}
public void increasing() {
	this.wage=this.wage+100*this.month;
}
public void print() {
	System.out.println(name+"当前工资:"+wage);
}
}
