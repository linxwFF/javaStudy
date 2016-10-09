package java_50;
/**
 * 
 * @author LinxwFF
 * Description:【程序2】 
 * 		题目： 
 * 		判断101-200之间有多少个素数，并输出所有素数
 * 		程序分析：
 * 		概念：质数，又称素数，是(只)能被1或者自己整除的自然数。
 * 		循环整除，发现除了自己和1以外的能够被整除就不是素数
 * 		
 * 		
 */
public class java_2 {
	
	public static void main(String[] args)
	{
		int count = 0; //统计素数个数
		for (int i = 101; i <= 200; i++) {
			if(isPrime(i)){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("统计素数的个数为：" + count);
	}
	
	public static boolean isPrime(int num)
	{	
		boolean flag = true;
		
		if(num < 2){
			return false;
		} else {
			for(int i = 2; i <= Math.sqrt(num) ; i++){ //循环整除判断， 开根号是为了提高效率，减少循环次数
													   //最多到开根号那边
				if(num%2 == 0){  
					flag = false; //只能被1和自己本身整除，发现一个能被整除就跳出
					break;
				}
			}
		}
			
		return flag;
	}

}
