package java_50;

/**
 * 
 * @author LinxwFF
 * Description:【程序30】 
	题目：
	有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中
 */


public class java_30 {

	public static void main(String[] args) 
	{
		int arr [] = {5, 9, 15, 17, 20, 50, 57, 58, 66, 88};
		int a = 18;
		int arr1[] = fun(arr, a);
		for(int b : arr1){
			System.out.println(b + " ");
		}
	}
	
	public static int[] fun(int arr[],int a)
	{	
		int tempArr[] = new int[arr.length+1];
		for(int i = 0; i< arr.length ; i++){
				
				if(a > arr[i]){
					tempArr[i]=arr[i];
					tempArr[i+1]=a;
				}else {
					tempArr[i+1]=arr[i];
				}
			
		}
		return tempArr;
	}

}
