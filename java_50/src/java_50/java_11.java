package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序11】 
 * 		题目：
 * 		有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 
 * 		程序分析：
 * 		可填在百位、十位、个位的数字都是1、2、3、4。
 * 		组成所有的排列后再去 掉不满足条件的排列。
 */

public class java_11 {
	
	public static void main(String[] args)
	{
		int sum = 0;
		
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i != j){  //排除相同元素，再循环
				for (int j2 = 0; j2 < 5; j2++) {
					if(j2 != i && j2 != j){   //排除相同元素，再循环
						sum = i*100 +j*10+ j2;
						System.out.println(sum);
					}
				}
				}
			}
		}
		
	}
	
}
