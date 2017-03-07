package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序35】 
	题目：百钱买百鸡问题
	5文钱可以买一只公鸡，
	3文钱可以买一只母鸡，
	1文钱可以买3只雏鸡，
	现在用100文钱买一百只鸡，那么各有公鸡、母鸡、雏鸡多少只？

 */
public class java_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		System.out.println("-----------------");
		method2();
	}
	
	public static void method1()
	{
		for(int i=1;i< 100;i++)
		{
			for (int j = 1; j < 100; j++) {
				for (int k = 1; k < 100; k++) {
					if(5*i+3*j+ k/3 == 100 && i+j+k == 100 && k%3 == 0)
					{
						System.out.println("公鸡"+i+"母鸡"+j+"小鸡"+k);
					}
				}
			}
		}
	}
	
	public static void method2()
	{
		int k;
		for(int i=1;i<20;i++)
		{
			for(int j=1;j<33;j++)
			{
				k = 100 -i-j;
				if(5*i+3*j +k/3 == 100 && k%3 == 0)
				{
					System.out.println("公鸡"+i+"母鸡"+j+"小鸡"+k);
				}
			}
		}
	}

}
