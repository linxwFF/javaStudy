package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序33】 
	题目：关于递推的经典题目
	数列如下: 1,2,3,6,9,18,27...求第20项的值是多少？
	规律: 第n个数是n-2个数的三倍。
 */

public class java_33 {
	static int i1 = 0;
	static int i2 = 0;

	public static void main(String[] args) {
		
		int a = method1(20);
		int b = method2(20);
		System.out.println(a);
		System.out.println(b+" "+i1+" "+i2);

	}
	
	public static int method1(int n)
	{  i1++;
		if(n == 1){
			return 1;
		}else if(n==2){
			return 2;
		}else{
			return (method1(n-2))*3;
		}
	}
	
	public static int method2(int n)
	{
		i2++;
		int qian1 = 1;
		int qian2 = 2;
		int result = 0;
		for(int i =3;i<=n; ++i)
		{
			result = qian1*3;
			qian1 = qian2;
			qian2 = result;
		}
		return result;
	}

}
