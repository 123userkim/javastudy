import java.util.Scanner;
class Test13
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int s, h,m;
		System.out.println("�ʸ� �Է����ּ���.");
		s= sc.nextInt();
		h=s/3600;
		m=(s%3600)/60;
		s=(s%3600)%60;
	   System.out.println(h"�ð�"+m"��" +s"�� �Դϴ�.");