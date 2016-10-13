package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序31】 
	题目：
	将一个数组逆序输出。 程序分析：用第一个与最后一个交换。
 */

public class java_31 {

	public static void main(String[] args) 
	{
		int arr[] = {15,20,57,5,88,58,17,9,50,66};
		int arr1[] = fun(arr);
		for(int a: arr1){
			System.out.println(a);
		}
	}
	
	public static int[] fun(int arr[])
	{
		int tempArr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			tempArr[arr.length-1-i] = arr[i];  //第一个数和最后一个数挑换
		}
		return tempArr;
	}
	
}
