package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序5】
 * 		题目：
 * 		利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 		程序分析：
 * 		(a>b)?a:b这是条件运算符的基本例子
 */
public class java_5 {
	
	public static void main(String[] args)
	{
		int sorce = 90;
		System.out.println(rank(sorce));
	}
	
	public static String rank(int sorce)
	{	
		return (sorce >= 90) ? "A": (sorce >= 60 && sorce < 89) ? "B" : "C";
	}
}
