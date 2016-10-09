package java_50;

import java.util.Scanner;

/**
 * 
 * @author LinxwFF
 * Description:【程序8】 
 * 		题目：
 * 		求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 		例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 * 	    程序分析：
 */
public class java_8 {

	public static void main(String[] args) 
	{
		System.out.println("请输入a的值");
		Scanner scanner = new Scanner(System.in).useDelimiter("\\s*");  //以空格作为分隔符
		int a = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();
		
		
	}
	public static int add(int a,int n)
	{	
		int sum = 0;
		for(int i=1; i<=n;i++){

		}
		return sum;
	}
}
