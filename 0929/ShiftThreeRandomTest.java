import java.util.Random;
class ShiftThreeRandomTest 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		
		int n = rand.nextInt();//int�� �������� �ƹ��ų� �ϳ� �������� �������,, ������ ������ �� ���� �ٸ��� ����
		System.out.println(n);
       

		//0�� 9������ ������ �߻��ϵ��� ���α׷��� �����ϱ�
		
		n= n>>> 1; //������ ����� ����� >>>1
		
		n = n%10;     //0�� 9������ ���� �߻��ϱ� ���ؼ��� ������ �����ڸ� �̿��ϸ� �� ex)5678%10=8
		System.out.println(n);

	
	}
}