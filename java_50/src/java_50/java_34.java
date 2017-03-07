package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序34】 
	题目：关于递推的经典题目
	数列如下: 一个猴子摘了一堆桃子，
	第一天吃了桃子的一半后又吃了一个，
	第二天也吃了剩下的桃子的一半后又吃了一个，
	以此吃下去，到了第十天还剩下一个桃子，
	问当初猴子总摘了多少个桃子？
	规律: 
	天数    挑子
	10    1
	9     (1+1）*2
	8	  (4+1) *2
 */

public class java_34 {

	public static void main(String[] args) {
		int a = method1(1);
		int b = method2(1);
		System.out.println(a);
		System.out.println(b);
	}
	
	public static int method1(int n)
	{
		if(n == 10)
		{
			return 1;
		}else{
			return (method1(n+1)+1)*2;
		}
	}
	
	public static int method2(int n)
	{
		int qian1 = 1;
		int qian2 = 4;
		int result = 0;
		for(int i =9 ;i>=n;i--){
			result = (qian1+1)*2;
			qian1 = result;
		}
		return result;
	}
}
