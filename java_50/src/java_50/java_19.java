package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序19】
 * 		题目：
 * 		编写一个方法sumDigits，计算一个整数各位数字之和。
 * 		例如，sumDigits(123)返回6（即1+2+3）。
 * 		调用这个方法，分别计算15、753和4582的各位数字之和。
 */

public class java_19 {

	public static void main(String[] args) 
	{
		System.out.print(sumDigits(4582));
	}
	
	public static int sumDigits(int number)
	{
		int sum = 0;
		for (int i = (number+"").length(); i > 0; i--) {
			sum += (number/Math.pow(10, i-1))%10;
			//(123/100)%10 = 1
			//(123/10)%10 = 2
			//(123/1)%10 = 3
		}
		return sum;
	}
}
