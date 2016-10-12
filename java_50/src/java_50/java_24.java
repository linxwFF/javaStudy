package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序24】 
		题目：
		给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */

public class java_24 {

	public static void main(String[] args) 
	{
		int a = 25781;
		int i = 0;
		int [] arr = new int[5];
		while(a!=0){
			arr[i] = a%10;	//求最后一位的余数
			a /= 10; //降10倍  最后第二位
			i++;
		}
		
		for(int x :arr){
			System.out.println(x);
		}
		
		
	}
}
