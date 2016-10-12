package java_50;

import java.util.Scanner;

/**
 * 
 * @author LinxwFF
 * Description:【程序25】 
		题目：
		一个5位数，判断它是不是回文数。
		即12321是回文数，个位与万位相同，十位与千位相同。
 */

public class java_25 {

	public static void main(String[] args) 
	{
		System.out.println("请输入一个5位数");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.print(huiwen(num));
	}
	
	public static boolean huiwen(int num)
	{
		boolean flag = false;
		if(num < 10000 || num > 99999){
			System.out.print("输入的数不是5位数");
		}
		int a = num%10; //个位数
		int b = (num/10)%10;//十位数
		int c = (num/1000)%10; //千位数
		int d = (num/10000)%10; //万位数
		
		if(a == d && b == c){
			flag = true;
		}
		
		return flag;
	}
}
