import java.util.Scanner;
class Test10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0,i;
		System.out.println( "1���� � ������ ���ұ��?" );
		n=sc.nextInt();

		for ( i=1 ; i<=n ; i++)
		{
			sum += i;
			
		}
	
	System.out.println( "1����" + n +"������ ����"+sum+"�Դϴ�." );
	}

}