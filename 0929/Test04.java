import java.util.Scanner;
class  Test04
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		String name;
		int kor, eng, math,avg;
		System.out.println("�̸��� �Է��Ͻÿ�.");
		name=sc.next();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		kor=sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		eng=sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		math=sc.nextInt();
		avg=(kor+eng+math)/3;
		System.out.println("����� "+ avg+"�� �Դϴ�.");
		if(avg>=90 && kor>=90)
		System.out.println("���б� ���� ������Դϴ�.");
		else
		System.out.println("���б� ���� ����ڰ� �ƴմϴ�.");
		



	}
}
