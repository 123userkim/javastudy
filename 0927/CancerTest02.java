import java.util.Scanner;
class CancerTest02{
 public static void main(String[]args){
	Scanner sc = new Scanner(System. in);
	String name;
	int UserYear,age;
	System. out. println(" �̸��� �Է��Ͻÿ�.");
	name = sc. next();
	System. out. println(" ��������� �Է��Ͻÿ�.");
	UserYear = sc.nextInt();
	age = 2021-UserYear;
	
	if(age>=40)
	System. out. println(name+ "��, ���� " + age + "�� �Դϴ�. ���� �� ���� ������Դϴ�.");
	else 
	System. out. println(name+ "��, ���� " + age + "�� �Դϴ�. ���� �� ���� ����ڰ� �ƴմϴ�.");
}
}