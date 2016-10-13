package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序28】 
	题目：对10个数进行排序
 */

public class java_28 {

	public static void main(String[] args) 
	{
		int arr[] = {15,20,57,5,88,58,17,9,50,66};
		fun(arr);
	}
	
	public static void fun(int arr[])
	{
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) { //arr.length-i-1 （ 自己那个位置就不用再对比了所以-1）
				if(arr[j]>arr[j+1]){   //位置前后比较，如果是升序，小的放左边
					temp = arr[j];	   //调换位置，就是值对换
					arr[j] = arr[j+1]; //后一位的值和前一位值对调
					arr[j+1] = temp;
				}
			}
		}
		for(int a: arr){
			System.out.print(a+", ");
		}
	}

}
