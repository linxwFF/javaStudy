package java_50;

import java.util.Scanner;

/**
 * 
 * @author LinxwFF
 * Description:【程序12】 
 * 	题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%;
 * 	利润高于10万元，低于20万元时，低于10万元的部分按10%提成,
 * 	高于10万元的部分，可可提成7.5%;
 * 	20万到40万之间时，高于20万元的部分，可提成5%;
 * 	40万到60万之间时高于40万元的部分，可提成3%;
 * 	60万到100万之间时，高于60万元的部分，可提成1.5%;
 * 	高于100万元时，超过100万元的部分按1%提成;
 * 	从键盘输入当月利润I，求应发放奖金总数？
 */
public class java_12 {

	public static void main(String[] args) 
	{
		System.out.println("从键盘输入当月利润I，求应发放奖金总数");
		Scanner scanner = new Scanner(System.in);
		double num = scanner.nextDouble();
		scanner.close();
		System.out.println(money(num));
	}
	
	public static double  money(double num)
	{
		double sum = 0;
		
		if (num <= 10) {   //低于或等于10万元时
			sum = num * (10.0/100.0);
		}else if(num < 20) {	//利润高于10万元，低于20万元时
			double temp = (num-10);
			if(temp < 0){
				sum = -temp * (10.0/100.0);
			}else {
				sum = temp * (7.5/100.0);
			}
		}else if(num < 40){ //20万到40万之间时
			sum = num * (5.0/100.0);
		}else if(num < 60){ //40万到60万之间时
			sum = num * (3.0/100.0);
		}else if(num < 100){ //60万到100万之间时
			sum = num * (1.5/100.0);
		}else if(num >= 100){
			sum = num * (1.0/100.0);
		}
		
		return sum;
	}

}
