import java.util.Scanner;
class Test07  
{
	public static void main(String[] args) 
	{
		 Scanner sc= new Scanner(System.in);
		 int data,a,b,c,d;
		 System.out.println("10000�̸��� ������ �Է��Ͻÿ�.");
		 data= sc.nextInt();
		 
		 a = data / 1000;
		 b=  (data%1000)/100;
		 c= (data%100)/10;
 		 d= data%10;
		
		 
		System.out.println("õ�� �ڸ�"+a);
		System.out.println("���� �ڸ�"+b);
		System.out.println("���� �ڸ�"+c);
		System.out.println("���� �ڸ�"+d);
	}
}