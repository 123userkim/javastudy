import java.util.Scanner;
class CancerTest{
	public static void main(String []args){
	 
	Scanner sc = new Scanner(System.in);
	String name;
	int age;
System. out. println("�̸��� �Է��ϼ���.");
name= sc.next();
System. out. println("���̸� �Է��ϼ���.");
age = sc.nextInt();

if (age >=40)
System.out.println (name + "��, ���� �� ���� ������Դϴ�.");
else
System.out.println (name + "��, ���� �� ���� ����ڰ� �ƴմϴ�.");

}

}