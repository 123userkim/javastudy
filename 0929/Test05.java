import java.util.Scanner;
class  Test05
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		String name;
		int  pri, qty, total;
		System.out.println("상품명을 입력하시오.");
		name=sc.next();
		System.out.println("단가를 입력하시오.");
		pri=sc.nextInt();
		System.out.println("구매수량을 입력하시오.");
		qty=sc.nextInt();
		total= pri*qty;
		if(qty>=10 || total>=20000)
		System.out.println("지불금액은 "+total*0.9+"입니다.");
		else
		System.out.println("지불금액은 "+total+"입니다.");

	}
}
