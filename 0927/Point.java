 import java. util. Scanner; 
 class Point{
	public static void main(String []args){  
	Scanner sc=new Scanner (System. in); 
	int com,clang,eng,math,avg;
 	System.out.println("��ǻ�� ���� ������ ������ �Է��Ͻÿ�==>");
	com = sc.nextInt();
	System.out.println(" c��� ���α׷���  ������ ������ �Է��Ͻÿ�==>");
	clang = sc.nextInt();
	System.out.println("���� ������ ������ �Է��Ͻÿ�==>");
	eng = sc.nextInt();
	System.out.println("�Ϲݼ����� ������ �Է��Ͻÿ�==>");
	math = sc.nextInt(); 
 	avg=(com+clang+eng+math) / 4 ;
	System.out.println("**������**");
	System.out.println("���������" + avg+"���Դϴ�.");


}
}