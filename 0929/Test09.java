import java.util.Scanner;
class Test09 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("������ �� n�� �Է����ּ���." );
		n=sc.nextInt();
	//System.out.println(  n+"��"+( (n%2==0)? "¦��" :  "Ȧ��") +"�Դϴ�.");
		String result = (n%2==0)? "¦��":"Ȧ��";
		System.out.println(n+"��"+result +"�Դϴ�.");

	}
}