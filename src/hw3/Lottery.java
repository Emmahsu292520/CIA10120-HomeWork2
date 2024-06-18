package hw3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lottery {

	public static void main(String[] args) {
		/*阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
		的號碼與總數 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入討厭的數字");
		
		int hateNumber = sc.nextInt();
		int[] lottery = new int[49];
		int sum = 0;
		
		for(int i = 0; i < lottery.length; i++) {
			lottery[i] = i + 1;
//			System.out.println(lottery[i]);
			if(hateNumber == lottery[i] || lottery[i] % 10 == hateNumber || lottery[i] / 10 == hateNumber) {
				lottery[i] = 0;
				
			}
			
		}
		
		
		for(int x = 0; x < lottery.length; x++) {
			if(lottery[x] > 0) {
				System.out.print(lottery[x]+"\t");
				sum += 1;
			}
		}
		System.out.println();
		System.out.println("可選擇的數字總數:"+sum);
		
		/*(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)*/
		Set set = new HashSet();
		
		
		
		for(int x = 0; set.size() <= 6 ; x++) {
			int sixRandomNumber = (int)(Math.random()*49);
			if(lottery[sixRandomNumber] > 0) {
				set.add(lottery[sixRandomNumber]);
			}
		}
		
		System.out.println("亂數印出來的六個數字分別為:"+set);
		
		
		
	}
}
