import java.util.Scanner;
class Test10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0,i;
		System.out.println( "1부터 어떤 수까지 더할까요?" );
		n=sc.nextInt();

		for ( i=1 ; i<=n ; i++)
		{
			sum += i;
			
		}
	
	System.out.println( "1부터" + n +"까지의 합은"+sum+"입니다." );
	}

}
