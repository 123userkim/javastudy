import java.util.Scanner;
class  Test01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println( "���n�� �Է����ּ���");
		n=sc.nextInt();
		if(n>=0)
			System.out.println(n*100+"�۾�����");
		else
			System.out.println(Math.pow(n, 2)+"�۾�����");

	}
}
 