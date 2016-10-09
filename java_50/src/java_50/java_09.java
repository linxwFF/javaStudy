package java_50;

import java.lang.reflect.Method;

/**
 * 
 * @author LinxwFF
 * Description:【程序9】 
 *      题目：
 *      一个数如果恰好等于它的因子之和，这个数就称为"完数"。
 *      例如6=1＋2＋3.编程找出1000以内的所有完数。
 *      程序分析：
 *      什么是数的因子?因子就是所有可以整除这个数的数,不包括这个数自身.　　
 *      因数包括这个数本身而因子不包括,如：比如15的因子是1,3,5 　　而因数为1,3,5,15.　
 *      　	完数是指此数的所有因子之和等于此数,例如：28=1+2+4+7+14.
 *      
 *      1.求因子
 *      2.所有因子相加是否等于 此数
 */

public class java_09 {
	
	public static void main(String[] args)
	{
		method(1000);
	}
	
	public static void method(int num)
	{	
		int temp;
		
		for(int i=1; i<num; i++){
//			System.out.print(i + ": 因子数");
			temp = 0;
			for(int j=1;j < i;j++){	//循环找出可以被整除的因子数
				if(i%j == 0){ 
					temp += j;     //所有因子相加
//					System.out.print(j);
				}
			}
			if(temp == i){     //所有因子相加是否等于 此数
				System.out.println("完数：" + i);
			}
			
//			System.out.print( "和" + temp + "\n");
		}
	}
}
