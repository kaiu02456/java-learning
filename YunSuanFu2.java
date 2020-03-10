/*
1、赋值运算符
2、字符串连接运算符
3、三目运算符/三元运算符/条件运算符


赋值类运算符两种：
基本的赋值运算符

=

扩展的赋值运算符


+=
-=
*=
/=
%=

自带强制转换

1、赋值类运算符优先级：先执行右边的表达式，将执行结果赋值给左边的变量
2、注意以下代码；
	byte i = 10;
	i += 5; 等同于：i = (byte)(i + 5)
	
	int k = 10;
	k += 5; 等同于：k = (int)(k + 5)

	long x = 10L;
	int y = 20;
	y += x; 等同于： y=(int)(y + x);
3、重要结论：扩展类的赋值运算符不改变运算结果类型，假设最初这个变量类型是byte类型，无论怎么进行追加或追减
最终变量都是byte类型
	



public class YunSuanFu2
{
	public static void main(String[] args)
	{

		int i = 10;
		
		System.out.println(i); //10

		i = i + 5;

		System.out.println(i);//15

		i += 5; //等同于：i = i + 5

		System.out.println(i);//20

		i -= 5; //等同于：i = i - 5
		
		System.out.println(i);//15

		i *= 2; //等同于：i = i * 2
		
		System.out.println(i);//30

		i /= 4; //等同于：i = i / 4

		System.out.println(i);//7

		i %= 2; //等同于：i = i % 2

		System.out.println(i);//1


	}
}


*/

//------------------------------------------------

byte a = 10;
a = a + 5//错误 a + 5 是int + byte类型
a = (byte)(a + 5) // a = 15
System.out.println(a) // a = 15

byte b = 5;
b += 5;// 等同于 b = (byte)(b + 5)可以编译通过，无需加强制转换符
System.out.println(b) // b = 10