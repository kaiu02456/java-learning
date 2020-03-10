/*
强制类型转换符
慎重使用 但是会损失精度
long x = 100L
int y = (int)x
*/
/*
byte b = 50 
无法通过编译 大容量int转换小容量byte 需要强制转换器

浮点型
float 单精度 4字节
double 双精度 8字节



float f = 5.1f;

float f = (float)5.1;

布尔型数字类型
boolean

只有ture false

布尔类型在开发中非常重要，在逻辑运算和控制语句当中
*/
/*public class DataType4
{
    public static void main(String[] args){
		boolean loginSuccess = true;

         if (loginSuccess)
         {
           System.out.println("登陆成功");
          }else{
           System.out.println("失败");
         }

    }
}

*/

/*关于基本数据类型之间的互相转换：
转换规则
		*1、除布尔类型，剩下7种都能互相转换
		*2、小容量向大容量转换，称为自动类型转换，容量从小到大排序
		byte<short<int<long<float<double
			 char<
		任何浮点类型不管几个字节都比整数型大
		char和short可表示的种类数量相同，但是char可以取更大的正整数
		*3、大容量转换小容量，叫强制类型转换，需要强制转换符 但是会损失精度 谨慎使用
		*4、当整数字面值没有超出byte,short,char的取值范围，可以直接赋值飞byte,short,char类型变量
		*5、byte,short,char混合运算的时候，各自先转换成int在做计算
		*6、多种数据类型混合运算，先转换成容量最大的那种类型再做运算
*/

public class DataType4
{			public static void main(String[] args){
	char l = '3';
		
		System.out.println((byte)l);
}
}
