package java_50;

import java.util.Scanner;

/**
 * 
 * @author LinxwFF
 * Description:【程序15】 
		题目：
		输入三个整数x,y,z，请把这三个数由小到大输出。  
		程序分析：
		
 */
public class java_15 {

	public static void main(String[] args) 
	{
		System.out.println("依次输入三个数");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		scanner.close();
		order(x, y, z);
	}
	
	public static void order(int x,int y,int z)
	{	
		int temp ;			//大小顺序为 X,Y,Z
		if(x > y){			//如果X大就换左边
			temp = x;
			x = y;
			y = temp;
		}
		if(x > z){			//如果X大就换左边
			temp = x;
			x = z;
			z = temp;
		}
		if(y > z){			//如果Y大就换左边
			temp = z;
			z = y;
			y = temp;
		}
		
		System.out.print(x + " " + y + " " +z);
	}

}
