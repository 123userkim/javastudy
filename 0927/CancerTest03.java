import java.util. Date;
import java.util. Scanner;
class CancerTest03 {
public static void main(String []args){
 	Scanner sc = new Scanner (System.in);
 	Date today= new Date();
	String name;
	int age, Useryear;
	int thisyear;
	thisyear= today.getYear()+1900;

	System.out.println("�̸��� �Է��Ͻÿ�.");
	name = sc. next();
	System.out.println("��������� �Է��Ͻÿ�.");
	Useryear= sc. nextInt();
	age=thisyear-Useryear;
	
	System.out.println("���ش�"+thisyear+"�Դϴ�.");
	if (age>=40)
	System.out.println(name+"��, ���ؿ�" + age +"�� �Դϴ�. ���� �ϰ��� ����� �Դϴ�.");
	else
	System.out.println(name+"��, ���ؿ�" + age +"�� �Դϴ�. ���� �ϰ��� ����ڰ� �ƴմϴ�.");

}
}