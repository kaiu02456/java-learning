/*
完整的switch语句

		switch(int或String类型的字面值或变量）{
				case int或String类型的字面值或变量 :
					java语句；
					。。。。
					break;
				case int或String类型的字面值或变量 :
					java语句；
					。。。。
					break;
				case int或String类型的字面值或变量 :
					java语句；
					。。。。
				    break;
				...
				default :
					java语句；
					。。。
		}

有break，若执行则终止
无break，则执行完本条后下条继续执行
若全部case未执行，则执行default语句
switch后面只能int或者String
byte short char可以自动转换成int

case可以合并
int i = 10;

switch(i){
	case 1: case 2: case 3: case 10:
			System.out.println("Test Code!");
			
*/
public class Switch01{
	public static void main(String[] args) {		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入数字：");
		String age = s.next();
				switch(age) {
				case "1" :
					System.out.println("你输入的是1！");
					//break;
				case "2" :
					System.out.println("你输入的是2！");
					//break;
				case "3" : case "4" :
					System.out.println("你输入的是3或4！");
					//break;
				default :
					System.out.println("超出范围，请重新输入！");
					
				
				}
		
		
	}
	
	
}
