package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序13】 
		题目：一个整数，它加上100后是一个完全平方数，
		再加上168又是一个完全平方数，请问该数是多少？
		程序分析：在10万以内判断，先将该数加上100后再开方，
		再将该数加上268后再开方，如果开方后的结果满足如下条件，
		即是结果。
		完全平方数:完全平方即用一个整数乘以自己例如1*1，2*2，3*3等，依此类推。
		1. Math.sqrt(num+100)
		2. Math.sqrt(num+268)
		3. 完全平方数  自己乘自己
 */
public class java_13 {
	public static void main(String[] args)
	{
		for (int i = 0; i < 100000; i++) {
			if(isCompSqrt(i+100) && isCompSqrt(i+268))
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isCompSqrt(int n)
	{
		boolean isComp = false;
		for (int i = 1; i <= Math.sqrt(n) + 1; i++) { 
			if (i* Math.sqrt(n) == Math.pow(i, 2)) //开根号后相等
			{   	
				isComp = true;
				break;
			}
		}
		return isComp;
	}
}
