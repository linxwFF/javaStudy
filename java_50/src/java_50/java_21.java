package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序21】 
	题目：
	求1+2!+3!+...+20!的和  
	程序分析：
	此程序只是把累加变成了累乘。
 */

public class java_21 {

	public static void main(String[] args) 
	{
		long sum = 0;
		long temp = 1;
		
		for (int i = 1; i <= 20; i++) 
		{
			temp=1;//必须每次都初始化，否则结果不对
			for (int j = 1; j <= i; j++) {
				temp *= j; //阶乘
			}
			sum +=temp;
			System.out.println(sum);
		}
	}

}
