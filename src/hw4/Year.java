package hw4;

import java.util.Scanner;

public class Year {
	/*請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天

	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

	(提示1:Scanner,陣列)
	(提示2:需將閏年條件加入)
	基本規則：如果年份能被4整除，那麼這一年就是閏年。
	例外規則：如果年份能被100整除，但不能被400整除，那麼這一年不是閏年。
	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)*/
	public static void main(String[] args) {
		
		
		int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
		
		System.out.println("輸入三個數字分別代表西元yyyy年、mm月、dd日");
		
		int[] date = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < date.length; i++) {
			 date[i]= sc.nextInt();
		}
 		
		if ((date[0] % 4 == 0 && date[0] % 100 != 0) || (date[0] % 400 == 0)) {
		   monthDay[1] = 29;// 閏年
		}
		
		int sum = 0;
		int total = 0;
 		if(date[0] < 0) {
 			System.out.println("yyyy年有錯，請重新輸入");
 		}else if(date[1] < 0 || date[1] > 12) {
 			System.out.println("mm月有錯，請重新輸入");
 		}else if (date[2] < 1 || date[2] > monthDay[date[1] - 1]) { // 檢查日期
            System.out.println("dd日有錯，請重新輸入");	
 		}else {
 			for(int x = 0; x <= (date[1]-2) ; x++) {
 				sum+= monthDay[x];
 			}
 			total = sum + date[2];
 		}
		System.out.println("輸入的日期為該年第"+total+"天");
	}
	
	
}
