/*
ǿ������ת����
����ʹ�� ���ǻ���ʧ����
long x = 100L
int y = (int)x
*/
/*
byte b = 50 
�޷�ͨ������ ������intת��С����byte ��Ҫǿ��ת����

������
float ������ 4�ֽ�
double ˫���� 8�ֽ�



float f = 5.1f;

float f = (float)5.1;

��������������
boolean

ֻ��ture false

���������ڿ����зǳ���Ҫ�����߼�����Ϳ�����䵱��
*/
/*public class DataType4
{
    public static void main(String[] args){
		boolean loginSuccess = true;

         if (loginSuccess)
         {
           System.out.println("��½�ɹ�");
          }else{
           System.out.println("ʧ��");
         }

    }
}

*/

/*���ڻ�����������֮��Ļ���ת����
ת������
		*1�����������ͣ�ʣ��7�ֶ��ܻ���ת��
		*2��С�����������ת������Ϊ�Զ�����ת����������С��������
		byte<short<int<long<float<double
			 char<
		�κθ������Ͳ��ܼ����ֽڶ��������ʹ�
		char��short�ɱ�ʾ������������ͬ������char����ȡ�����������
		*3��������ת��С��������ǿ������ת������Ҫǿ��ת���� ���ǻ���ʧ���� ����ʹ��
		*4������������ֵû�г���byte,short,char��ȡֵ��Χ������ֱ�Ӹ�ֵ��byte,short,char���ͱ���
		*5��byte,short,char��������ʱ�򣬸�����ת����int��������
		*6�������������ͻ�����㣬��ת����������������������������
*/

public class DataType4
{			public static void main(String[] args){
	char l = '3';
		
		System.out.println((byte)l);
}
}
