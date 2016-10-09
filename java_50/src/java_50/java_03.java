package java_50;
/**
 * 
 * @author LinxwFF
 * Description:【程序3】
 * 		题目：
 * 		打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 		例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
 * 		程序分析：
 * 		依次获取三位数的个，十，百，位的数字
 * 		依次三次方相加
 */
public class java_03 {
	
	public static void main(String[] args)
	{
		for (int i = 100; i <= 999; i++) {
			if(flower(i)){
				System.out.println(i);
			}
		}
	}
	
	public static boolean flower(int num)
	{	
		int a = (num/100)%10; //百位
		int b = (num/10)%10;  //十位
		int c = num%10;		//个位
		int temp = (int)Math.pow(a, 3) + (int)Math.pow(b, 3) + (int)Math.pow(c, 3);
		if(temp == num){
			return true;
		}
		return false;
	}

}
