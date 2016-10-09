package java_50;

/**
 * 
 * @author LinxwFF
 * Description: 【程序4】
 * 		题目：
 * 		将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5
 * 		程序分析：
 */

public class java_04 {
	
	public static void main(String[] args)
	{
		int n = 90;
		decompose(n);
	}
	
	public static void decompose(int n)
	{
		System.out.print( n + " = ");
		
		for (int i = 2; i < n+1; i++) {
			
			while (n%i == 0 && n != 1) {  //可以被整除（当然1不算，因为1可以整除任何数）
				n/=i;					  //除以最小的质数，剩下的值继续  
				System.out.print(i+"*");
			}
			
			if(n == i){
				System.out.print(i);  
				break;
			}
		}
	}
}
