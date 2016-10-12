package java_50;

import java.util.Scanner;

/**
 * 
 * @author LinxwFF
 * Description:【程序18】
 * 	要求：循环输入成绩，当输入的成绩不在0-100之间时退出输入，然后进行成绩统计。
 */
public class java_18 {

	public static void main(String[] args) 
	{	
		int rank = 0, a = 0,b = 0,c = 0,d = 0,e = 0;
		
		System.out.println("成绩统计");
		
		while (rank>=0 && rank<=100) {
			System.out.println("请输入分数：");
			Scanner scanner = new Scanner(System.in);
			rank = scanner.nextInt();
				if (rank >= 90) {
					a++;
				}else if(rank >= 80) {
					b++;
				}else if(rank >= 70){
					c++;
				}else if(rank >= 60){
					d++;
				}else{
					e++;
				}
		}
		
		System.out.println("优秀"+ a);
		System.out.println("良好"+ b);
		System.out.println("一般"+ c);
		System.out.println("及格"+ d);
		System.out.println("不及格"+ e);
	}

}
