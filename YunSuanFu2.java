/*
1����ֵ�����
2���ַ������������
3����Ŀ�����/��Ԫ�����/���������


��ֵ����������֣�
�����ĸ�ֵ�����

=

��չ�ĸ�ֵ�����


+=
-=
*=
/=
%=

�Դ�ǿ��ת��

1����ֵ����������ȼ�����ִ���ұߵı��ʽ����ִ�н����ֵ����ߵı���
2��ע�����´��룻
	byte i = 10;
	i += 5; ��ͬ�ڣ�i = (byte)(i + 5)
	
	int k = 10;
	k += 5; ��ͬ�ڣ�k = (int)(k + 5)

	long x = 10L;
	int y = 20;
	y += x; ��ͬ�ڣ� y=(int)(y + x);
3����Ҫ���ۣ���չ��ĸ�ֵ��������ı����������ͣ���������������������byte���ͣ�������ô����׷�ӻ�׷��
���ձ�������byte����
	



public class YunSuanFu2
{
	public static void main(String[] args)
	{

		int i = 10;
		
		System.out.println(i); //10

		i = i + 5;

		System.out.println(i);//15

		i += 5; //��ͬ�ڣ�i = i + 5

		System.out.println(i);//20

		i -= 5; //��ͬ�ڣ�i = i - 5
		
		System.out.println(i);//15

		i *= 2; //��ͬ�ڣ�i = i * 2
		
		System.out.println(i);//30

		i /= 4; //��ͬ�ڣ�i = i / 4

		System.out.println(i);//7

		i %= 2; //��ͬ�ڣ�i = i % 2

		System.out.println(i);//1


	}
}


*/

//------------------------------------------------

byte a = 10;
a = a + 5//���� a + 5 ��int + byte����
a = (byte)(a + 5) // a = 15
System.out.println(a) // a = 15

byte b = 5;
b += 5;// ��ͬ�� b = (byte)(b + 5)���Ա���ͨ���������ǿ��ת����
System.out.println(b) // b = 10