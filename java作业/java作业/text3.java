package java��ҵ;

import java.util.Scanner;

public class text3 {
public static void main(String[] args) {
	System.out.println("������2����:");
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	scanner.close();
	if (a < b) {
        int temp;
        temp=a;a=b;b=temp;
    }
    int c;
    do{
        c=a%b;
        a=b;b=c;
    }while (c!=0);
	System.out.println("��������������������Ϊ:"+a);
}
}