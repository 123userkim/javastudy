import java.util.Scanner;
class ConditionalOperator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,min;
		System.out.println("ù ��° ���� �Է��ϱ�");
		a = sc.nextInt();
		System.out.println("�� ��° ���� �Է��ϱ�");
		b = sc.nextInt();
		min = (a<b)?a:b;
		System.out.println("���� ����" + min +"�Դϴ�.");
	}
}
