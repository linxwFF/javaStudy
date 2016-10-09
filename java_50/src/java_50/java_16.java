package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序16】 
		题目：
		输出9*9口诀。  
		程序分析：
		
 */
public class java_16 {

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(j +"*" + i +"=" + i*j +"  ");
			}
			System.out.print("\n");
		}
	}
	

}
