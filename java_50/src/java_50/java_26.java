package java_50;

/**
 * 
 * @author LinxwFF
 * Description: 【程序25】
 * 		题目：
 * 	  编写两个方法reverse和isPalindrome。
	（1）方法reverse用于返回一个整数的反向倒置数。
	例如，reverse(123)返回321。
	（2）方法isPalindrome判断一个整数是否是回文整数。
	在此方法中调用reverse方法获得该整数的反向数，
	如果反向数与它的顺向数一致，则这个数就是回文整数。
	
	调用isPalindrome方法，分别判断123、7117是否是回文整数。
 */
public class java_26 {

	public static void main(String[] args) 
	{	
		System.out.println(reverse(123321));
//		System.out.println(reverse1(123321));
		System.out.println(isPalindrome(123321));
	}
	
	public static int reverse(int number)
	{	
		int s = 0;
		
		for (int i = Integer.toString(number).length(); i > 0; i--) {
			s *= 10;
			s += number%10;
			number/=10;
		}
		
		return s;
	}
	
	public static int reverse1(int number)
	{	
		StringBuffer sb = new StringBuffer(Integer.toString(number));
		sb.reverse();
		
		return Integer.parseInt(sb.toString());
	}
	
	public static boolean isPalindrome(int number)
	{
		boolean flag = false;
		
		if (number == reverse(number) ) {
			flag = true;
		}
		
		return flag;
	}
}
