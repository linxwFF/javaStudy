package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序23】 
		题目：
		有5个人坐在一起，问第五个人多少岁？
		他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。
		问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。
		最后问第一个人，他说是10岁。
		请问第五个人多大？  
		程序分析：
		利用递归的方法 (递归的方法一定有一个跳出递归的变化，不会一直循环下去)
 */
public class java_23 {

	public static void main(String[] args) 
	{
		System.out.print(fun(5));
	}
	
	public static int fun(int a)
	{
		if(a == 1){
			return 10;
		}else{
			return fun(a-1)+2;
		}
	}

}
