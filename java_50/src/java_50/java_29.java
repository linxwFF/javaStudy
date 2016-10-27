package java_50;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author LinxwFF
 * Description:【程序29】 
	题目：
	1.  数组a中存放10个四位十进制整数{1451,7843,4565,5327,3454,2365,4461,6542,1208,1463}，
	统计千位和十位之和与百位和个位之和相等的数据个数，
	并将满足条件的数据存入数组b中，将b输出。
	参考结果如下图：
 */
public class java_29 {

	public static void main(String[] args) 
	{
		int a[] = {1451,7843,4565,5327,3454,2365,4461,6542,1208,1463};
		int b[] = fun(a);
		System.out.println("=================Configuration: <Default> =================");
		for(int i = 0 ;i < b.length ; i++){  
            System.out.println("b["+i+"] = " + b[i]);  
        }  
        System.out.println("符合条件的数共"+b.length+"个 \n");
        System.out.println("Process completed");
	}
	
	public static int [] fun(int a[])
	{
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int thousand = (a[i]/1000)%10;
			int hundred = (a[i]/100)%10;
			int ten = (a[i]/10)%10;
			int Entries = a[i]%10;
			if((thousand + ten) == (hundred+Entries)){
				b.add(a[i]);
			}
		}
		int[] arrb = new int[b.size()];
		for (int i = 0; i < arrb.length; i++) {
			arrb[i] = b.get(i);
		}
		
		return arrb;
	}

}
