import java.util.Scanner;
class  Test08
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("ù ��° ������ �Է����ּ���." );
		a=sc.nextInt();
		System.out.println("�� ��° ������ �Է����ּ���." );
		b=sc.nextInt();
	    System.out.println((a>b)?b: a);
	}
}
