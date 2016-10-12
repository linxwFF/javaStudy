package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序22】
 * 题目：利用递归方法求5!。
 */
public class java_22 {

	public static void main(String[] args) 
	{
		int s;
		s = fun(5);
		System.out.print(s);
	}
	
	public static int fun(int a)
	{
		if(a == 1 ){
			return 1 ;
		}else{
			return a * fun(a-1);
		}
 	}

}
