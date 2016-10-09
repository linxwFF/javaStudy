package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序10】 
 * 		题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 		再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 * 		程序分析：
 */		
public class java_10 {
	public static void main(String[] args)
	{
		method(100);
	}
	
	public static void method(double h)
	{	
		double temp = 0;
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += h;
			h = h/2;	
			System.out.println("第"+i+ "次"+ h +"   "+ sum);
		}
		System.out.println("共经过"+ sum +"米,第10次反弹" + h +"米");
	}
}
