import java.util.Scanner;
class Test01 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("ù ��° ������ �Է��Ͻÿ�.");
		a=sc.nextInt();
		System.out.println("�� ��° ������ �Է��Ͻÿ�.");
		b=sc.nextInt();
		if(a>b)
		System.out.println("���� ���� "+b+"�Դϴ�.");
		else
		System.out.println("���� ���� "+a+"�Դϴ�.");
	}
}
