import java.util.Scanner;
class  Test05
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		String name;
		int  pri, qty, total;
		System.out.println("��ǰ���� �Է��Ͻÿ�.");
		name=sc.next();
		System.out.println("�ܰ��� �Է��Ͻÿ�.");
		pri=sc.nextInt();
		System.out.println("���ż����� �Է��Ͻÿ�.");
		qty=sc.nextInt();
		total= pri*qty;
		if(qty>=10 || total>=20000)
		System.out.println("���ұݾ��� "+total*0.9+"�Դϴ�.");
		else
		System.out.println("���ұݾ��� "+total+"�Դϴ�.");

	}
}
