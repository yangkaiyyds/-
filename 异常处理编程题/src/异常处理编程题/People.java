package �쳣��������;

public class People {
private String name;
private int age;
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}
public int getAge(){return age;}
public void setAge(int age) throws AgeException{
	if(age<0||age>200)throw new AgeException();
	this.age=age;
}
public static void main(String[] args) {
	People p=new People();
	try {
		p.setAge(400);
	}catch (AgeException e) {
		System.out.println("��age��ֵ����"+e.getMessage());
	}
}
}
