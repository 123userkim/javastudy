//�ڷ��� ������ ���� ������ Spring ����ϱ�
class NotDefine{
	public static void main(String[] args) {
		 
		name = "��þ�";
		System.out.println("�̸���"+name);

	}
}
/*
error: Class names, 'NotDefinejava', are only accepted if annotation processing is explicitly requested
1 error

C:\javastudy\0928>javac NotDefine.java
NotDefine.java:4: error: cannot find symbol
                name = "��þ�";
                ^
  symbol:   variable name
  location: class NotDefine
NotDefine.java:5: error: cannot find symbol
                System.out.println("�̸���"+name);
                                         ^
  symbol:   variable name
  location: class NotDefine
*/