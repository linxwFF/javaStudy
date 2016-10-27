package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序6】
 * 	题目：编写一个方法kn，计算kkk…kk（共n个k，n>0）的值。
 * 		例如，kn(2, 5)返回22222(即5个2)。调用这个方法，求下列s1和s2的值：
 *		s1 = 6 + 66 + 666 + 6666 + 66666	（结果为74070）
 *		s2 = 8 + 888 + 88888 + 8888888   （结果为8978672）
 */
public class java_06 {

	public static void main(String[] args) 
	{
		int s = kn(6, 5);
		System.out.println(s);
	}
	
	public static int kn(int a,int b)
	{
		
		int s = a;
		double t = 0;
		for (int i = 1; i <= b; i++) 
		{	
			t =  t*10 +a;
			System.out.println(t);
			s += t;
		}
		return s; 
	}
}
