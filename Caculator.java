public class Caculator
{	
	public static void main(String[] args){
	
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.print("�������һ�����֣�");
	int num1 = s.nextInt();
	System.out.print("�������������");
	String yunSuanFu = s.next();
	System.out.print("������ڶ�������");
	int num2 = s.nextInt();


	System.out.print("���Ľ���ǣ�");
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
			System.out.print("�Բ�����������");
	

	}




	}




}