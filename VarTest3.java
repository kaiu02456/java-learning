public class VarTest3
	{
		static int k = 100;
		
		public static void main(String[] args){

			int i =100;

			System.out.println(i);
			System.out.println(k);
		}
		public static void doSome(){

			System.out.println(k);

		}

		
	}


for(int a=0;a<10;a++) //只能用于for循环中 出了for循环就无用

int j;
for (j=0;j<10;j++) //一直有效
{

}


/*

关于变量的分类：
根据变量声明的位置来分类：
*局部变量
-在方法体当中声明的变量叫做局部变量
*成员变量
-在方法体外【类体制内】声明的变量叫做成员变量
在不同的作用域当中，变量可同名
在同一个作用域当中，变量不可同名

