 
import java.util. Scanner;
import java.util. Date;
class CancerTest04 {
	public static void main(String []args){
	Scanner sc =new Scanner(System.in);
 	Date today=new Date();
	String name;
	int UserYear;
	int thisYear= today.getYear()+1900;

	System.out.println("�̸��� �Է��Ͻÿ�.");
	name= sc.next();
	System.out.println("��������� �Է��Ͻÿ�.");
	UserYear=sc.nextInt();
	int age= thisYear-UserYear;

	if(age>=40 && thisYear % 2 ==UserYear % 2)
	System.out.println(name+"��," + thisYear + "�⵵�� ���� �ϰ��� ����� �Դϴ�.");
	else
	 System.out.println(name+"��," + thisYear + "�⵵�� ���� �ϰ��� ����ڰ� �ƴմϴ�.");
}}
