/*public class DataType3

{
	public static void main(String[] args){
		
          char c1 = '\u0000';
          System.out.print('a');
          System.out.print(c1);
          System.out.print("“hello welcome”");


	}

char 类型
   转义字符
 
   \n 换行符
   \t 制表符 tab
   \\ 输出'\'
   \' 输出 ' 
   \" 输出 "
   \u4e2d Unicode编码
   反斜杠在java语言中有转义功能
   


system.out.println()输出后换行
system.out.print输出不换行







}*/

/* 关于java语言中的整数型
    byte,short,int,long

数据类型   占用空间大小  默认值         取值范围
byte               1       0            -128~127
short              2       0            -32768~32767
int                4       0           -2147483648~2147483647
long               8       0


1、java“整数型字面值”默认被当做int来处理。要让在“整数型正面值”被当做long来处理的话
需要在“整数型字面值”后面添加l/L 建议用大写L
2、java语言中整数型字面值有三种表示方式
第一种 十进制 默认
第二种 八进制 需要整数型字面值0开始
第三种 十六进制 需要整数型字面值要0x开始

*/
public class DataType3
{
   public static void main(String[] args){
	
    /* int a = 10;
     int b = 010;
     int c = 0x10;

           System.out.println(a);
           System.out.println(b);
           System.out.println(c);
           System.out.println(a * b * c);*/

       /*  long a = 2147483648;
         System.out.println(a); //超出范围 需要在后面加L

*/
         long a = 2147483648L;
         System.out.println(a);

    }

}

