import java. util. Scanner;
class YourInfo{
 	public static void main(String []args){
	Scanner sc = new Scanner(System. in);
	String name;
	int age;	
	System. out. println("����� �̸��� �����Դϱ�?");
	name = sc.next();
	System. out. println("����� ���̴� �� ���Դϱ�?");
	age = sc.nextInt();
	System. out. println("�ݰ����ϴ�! ����� �̸���" + name + "�̰�, ���̴�" + age + "���Դϴ�.");
}
}