import java.util.Scanner;
class  Test02
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;
		System.out.println("�̸��� �Է��Ͻÿ�.");
		name=sc.next();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		kor=sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		eng=sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		math=sc.nextInt();

		tot=kor+eng+math;
		System.out.println("������"+tot+"�Դϴ�.");
		avg=double(tot)/3;
		System.out.println("�����"+avg+"�Դϴ�.");
	
		if(avg>=60)
		System.out.println("�հ�");
		else
		System.out.println("���հ�");


	}
}
