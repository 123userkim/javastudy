import java.util.Scanner;
class  Test07
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		int age1, age2;
		System.out.println("ù ��° ����� ���̸� �Է��Ͻÿ� ");
		age1=sc.nextInt();
		System.out.println("�� ��° ����� ���̸� �Է��Ͻÿ� ");
		age2=sc.nextInt();
		if(age1>=20 & age2 >=20)
		System.out.println("�� ��� ��� 20���̻��Դϴ�");
		else
		System.out.println("�� ��� ��� 20���̻��� �ƴմϴ�");
	}
}