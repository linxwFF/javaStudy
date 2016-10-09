package java_50;

import java.util.Scanner;

/**
 * 
 * @author LinxwFF
 * Description:【程序14】 
		题目：
		输入某年某月某日，判断这一天是这一年的第几天？ 
		程序分析：
		1.把月份放进数组中，加起来
		
 */
public class java_14 {

	public static void main(String[] args) 
	{
		System.out.println("依次输入年月日");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		scanner.close();
		days(year, month, day);
	}
	
	public static void days(int year,int month,int day)
	{	
		//月份天数
		int[] month_date = {31,28,31,30,31,30,31,31,30,31,30};
		int days=0;
		int count = 365;
		//闰年 366天
		if(year%4 ==0){
			//二月天数
			month_date[1] = 29;
			count = 366;
		}
		
		for (int i = 1; i < month; i++) {
			days += month_date[i]; 
		}
		System.out.print(days +"/"+ count);
	}

}
