class  Decimaloctalhecbirnary
{
	public static void main(String[] args) 
	{
		 
	int a=12;
	int b=014;
	int c=0xc;
	int d=0b1100;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);


	}
}
/*
10진수: 12라고 할 때
8진수 변환법: 앞에다가 0을 붙이기 ex) int b=014;
16진수 변환법 : 앞에 0x 붙이기 ex)  int c=0xc;
2진수 변환법: 앞에다가 0b 붙이기 ex) int d=0b1100;

8   10  16	2
------------------------------------
0   0   0	0
1   1	1	1
2   2	1	10
3   3	3	11
4   4	4	100
5   5	5	101	
6   6	6	110
7   7	7	111
10  8	8	1000
11  9	9	1001
12  10	A	1011
13  11	B	1100
14  12  C
	13	D
	14	E
	15	F
	16	10
	17	11



*/