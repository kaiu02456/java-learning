public class Caculator
{	
	public static void main(String[] args){
	
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.print("请输入第一个数字：");
	int num1 = s.nextInt();
	System.out.print("请输入运算符：");
	String yunSuanFu = s.next();
	System.out.print("请输入第二个数字");
	int num2 = s.nextInt();


	System.out.print("您的结果是：");
	switch(yunSuanFu) {
	    case "+" : 
			int anwser1 = num1 + num2;
			System.out.print(anwser1);
			break;
		case "-" : 
			int anwser2 = num1 - num2;
			System.out.print(anwser2);
			break;
		case "*" : 
			int anwser3 = num1 * num2;
			System.out.print(anwser3);
			break;
		case "/" : 
			int anwser4 = num1 / num2;
			System.out.print(anwser4);
			break;
		default :
			System.out.print("对不起，输入有误！");
	

	}




	}




}