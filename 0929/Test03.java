import java.util.Scanner;
class Test03 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age1,age2;
		System.out.println("ù ��° ����� ���̸� �Է��Ͻÿ�.");
		age1=sc.nextInt();
		System.out.println("�� ��° ����� ���̸� �Է��Ͻÿ�.");
		age2=sc.nextInt();
		if(age1 == age2)
		System.out.println("���� �����Դϴ�");
		else
		System.out.println("���̰� �ٸ��ϴ�");
	}
}
