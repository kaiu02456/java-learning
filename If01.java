/*

	关于java语言中的if语句
	1、if(布尔表达式){
			java语句;
			java语句;
			java语句;
			java语句;
		}

		
	2、if(布尔表达式){
			java语句;
			java语句;
		}else{
			java语句;
			java语句;
		}

	3、if(布尔表达式){
			java语句;
			java语句;
		}else if(布尔表达式){
			java语句;
			java语句;}
		}else if(布尔表达式){
			java语句;
			java语句;}
		}else if(布尔表达式){
			java语句;
			java语句;}
		}else if(布尔表达式){
			java语句;
			java语句;}
		}else if(布尔表达式){
			java语句;
			java语句;}
		}else if(布尔表达式){
			java语句;
			java语句;}

	4、if(布尔表达式){
			java语句;
			java语句;
		}else if(布尔表达式){
			java语句;
			java语句;}
		}else if(布尔表达式){
			java语句;
			java语句;}
		}else if(布尔表达式){
			java语句;
			java语句;}
		}else if(布尔表达式){
			java语句;
			java语句;}
		}else if(布尔表达式){
			java语句;
			java语句;}
		}else(布尔表达式){
			java语句;
			java语句;}





	4、只要有一个分支执行，整个if全部结束
	5、只有2、4 带有else的可以保证一定有程序执行
	6、所有的控制语句都是可以嵌套使用，只要合理嵌套，代码格式需要完美
	7、if语句的分支中只有一条java语句，大括号可以省略不写


*/
public class If01{
	public static void main(String []args)

	{

		double grade = 45.0;

		if(grade > 90){
			System.out.println('A');
		}else if(grade > 80){
			System.out.println('B');
		}else if(grade > 70){
			System.out.println('C');
		}else{
			System.out.println('D');
		}
		


	}	
}