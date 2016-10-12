package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序20】  
 * 题目：
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...
 * 求出这个数列的前20项之和。 
 * 程序分析：请抓住分子与分母的变化规律。
 */
public class java_20 {

	public static void main(String[] args) 
	{
		float sum =0;
		
		float t = 1; //分子
		float m = 1; //分母
		
		float t1 = 0;			// 原来的分子要变成分母
			
		for (float i = 1; i <= 20; i++) {
			
			t1 = t+m; //分子 = 分母+分子
			
			sum += t1/m;  //累加
			
			System.out.println(t+"/"+m);
			
			float temp = m; //暂存
			
			m = t1;   //分子变分母
			t = temp;	  //分母变分子
			
			
		}
		
		System.out.println(sum);
	}

}
