package java��ҵ;

public class text5 {
	 public static void main(String[] args) {
	        System.out.println("����������ĸ���");
	        Scanner scaner= new Scanner(System.in);
	        int n=scaner.nextInt();
	        int[] a =new int[n];
	        int  i,sum=0;
	        double aver;
	        for (  i=0; i<a.length; i++){
	            a[i]=scaner.nextInt();
	            sum+=a[i];
	        }aver=sum/n;
	        for ( i=0; i<a.length;i++){
	            if (a[i]>aver){
	                System.out.println("a["+i+"]="+a[i]);
	            }
	        }
	    }
}
