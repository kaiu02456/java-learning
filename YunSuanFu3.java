/*
		关于+运算符
		
		加法运算，求和
		字符串的连接运算

		
		数字+数字  ----> 求和  【求和】
		
		数字+字符串 ---> 字符串 【字符串连接】

		
		 没有小括号的情况下 从左到右依次运算


public class YunSuanFu3
{
	public static void main(String[] args){

	int a = 100;
	int b = 200;

	System.out.println(a + " + " + b + " = " + (a + b));




	String username = "465465465685";
	
	System.out.println("成功登陆，欢迎" + username + "回来");


}
}

*/

/*
	三元运算符/三目运算符/条件运算符

	1、语法规则：
		布尔表达式 ？ 表达式1：表达式2

	2、三元运算符的执行原理？

		当布尔表达式为true时，选择表达式1为执行结果
		当布尔表达式为false是，选择表达式2为执行结果

*/

public class YunSuanFu3
{	public static void main(String []args)

	{
	
	boolean sex = false;
	
	char c = sex ? '男' : '女';
	System.out.println(c);

	sex = true;
	c = sex ?'男':'女';
	System.out.println(c);	
	}
}