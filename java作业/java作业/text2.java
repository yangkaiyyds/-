package java��ҵ;

import java.util.Scanner;

public class text2 {
public static void main(String[] args) {
	System.out.println("��Fibonacci����:");
	Scanner scanner=new Scanner (System.in);
	int b=scanner.nextInt();
	int a[]=new int [1000];
	scanner.close();
	for(int n=2;n<1000;n++)
	{a[0]=0;
	a[1]=1;
	a[n]=a[n-1]+a[n-2];
	}
	System.out.println("��n����Ϊ:"+a[b]);
}
}
