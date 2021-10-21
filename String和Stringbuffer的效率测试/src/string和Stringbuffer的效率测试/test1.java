package string和Stringbuffer的效率测试;

public class test1 {
public static void main(String[] args) {
	String toappend="abcdefjhijk";
	int times=20000;
	long start=System.currentTimeMillis();
	@SuppressWarnings("unused")
	String str=" ";
	for(int i=0;i<times;i++) {
		str+=toappend;
	}
	long end=System.currentTimeMillis();
	System.out.println("String time="+(end-start)+"ms");
	start=System.currentTimeMillis();
	StringBuffer strbuf=new StringBuffer();
	for(int i=0;i<times;i++) {
		strbuf.append(toappend);
	}
	end=System.currentTimeMillis();
	System.out.println("StringBuffer="+(end-start)+"ms");
}
}
