package java_50;

import java.util.*;

/**
 * 
 * @author LinxwFF
 * Description:	【程序7】 
 *		题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 
 *		程序分析：利用while语句,条件为输入的字符不为'\n'.
 */

public class java_7 {
	
	public static void main(String[] args)
	{
		System.out.println("请输入一串字符："); 
		Scanner scan = new Scanner(System.in);   
		String str = scan.nextLine();//将一行字符转化为字符串  
		scan.close();    
		count(str); 
	}
	
	public static void count(String str)
	{
		String E1 = "[\u4e00-\u9fa5]";//汉字
		String E2 = "[a-zA-Z]"; 	//字母
		String E3 = "[0-9]"; //数字
		String E4 = "\\s"; //空格
		
		int countChina = 0;
		int countLatter = 0;
		int countNum = 0;
		int countSpace = 0;
		int countOther = 0;
		
		char[] array_Char = str.toCharArray(); //字符串变成字符数组
		String[] array_String = new String[array_Char.length];  //初始化字符串数组
		
		//字符数组转换字符串数组
		for (int i = 0; i < array_Char.length; i++) {
			array_String[i] = String.valueOf(array_Char[i]); 
		}
			//遍历数组统计  各类型个数
			for (String s:array_String) {
				if(s.matches(E1)){  //正则匹配
					countChina++;
				}else if (s.matches(E2)) {
					countLatter++;
				}else if (s.matches(E3)) {
					countNum++;
				}else if (s.matches(E4)) {
					countSpace++;
				}else {
					countOther++;
				}
			}
		
		
		System.out.println("输入的汉字个数："+ countChina);  
		System.out.println("输入的字母个数："+ countLatter);  
		System.out.println("输入的数字个数："+ countNum); 
		System.out.println("输入的空格个数："+ countSpace);  
		System.out.println("输入的其它字符个数："+countOther); 
		
	}
}
