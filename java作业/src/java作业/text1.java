package java��ҵ;

import java.util.Scanner;

public class text1 {
public static void main(String[] args) {
	int a;
	System.out.println("����������:");
	Scanner scanner=new Scanner(System.in);
	scanner.close();
	a=scanner.nextInt();
	int b=0;
	for(a=0;a<100;a++)
	{
		if(a%400==0)b++;
	else if(a%4==0&&a%100!=0)
		b++;
	}
	System.out.println("һ���ܹ�"+b+"������");
}
}
