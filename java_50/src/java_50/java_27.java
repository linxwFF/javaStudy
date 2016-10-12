package java_50;

import java.util.Scanner;

/**
 * 
 * @author LinxwFF
 * Description:【程序27】 
	题目：
	求100之内的素数  
	程序分析：
	素数，只能被1和自身整除的；
 */

public class java_27 {

	public static void main(String[] args) 
	{
		int num = 100;
		System.out.println(1);
		for (int i = 2; i <= num; i++) {
			
			int n = 2;  //从2开始循环一直除 ， （任何数都可以被1整除）
			while (n<i) { //除到自己-1
	             if (i%n == 0)  break;  //若能整除说明n不是素数，跳出当前循环
	             n++;
	        }
			
			if(i == n){ //还没有可以整除的数，就说明只能被自身整数了
				System.out.println(i);
			}
		}
	}
	

	
}
