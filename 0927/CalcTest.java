import java. util. Scanner; 
class CalcTest{
	public static void main (String []arge){
	Scanner sc = new Scanner(System. in);
	int first, second, add, sub, multi, div;
	System.out.println("ù ��° ���� �Է��Ͻÿ�");
	first = sc.nextInt();
	System.out.println("�� ��° ���� �Է��Ͻÿ�");
	second = sc.nextInt();
	add=first + second;
	sub = first - second;
	multi = first * second;
	div = first / second;
	
	System.out.println("**��� ���**");
	System.out.println("���ϱ� : " + add);
	System.out.println("���� : " + sub);
	System.out.println("���ϱ� : " + multi);
	System.out.println("������ : " + div);



}
}