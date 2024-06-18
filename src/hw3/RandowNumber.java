package hw3;

import java.util.Scanner;

public class RandowNumber {
	public static void main(String[] args) {
		/*• 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
			對則顯示正確訊息,如圖示結果:

			(提示:Scanner,亂數方法,無窮迴圈)
			(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)*/
		int random = (int)(Math.random()*101);
		System.out.println("亂數為:"+random);
		Scanner sc = new Scanner(System.in);
		System.out.println("猜0~100的數字");
		
		
		outer:
		while(true) {
			int answer = sc.nextInt();
			if(answer == random) {
				System.out.println("恭喜你答對了!答案是"+answer);
				break outer;
			}else if(answer < random){
				System.out.println("在猜猜看0~100亂數，在大一些");
			}else if(answer > random) {
				System.out.println("在猜猜看0~100亂數，在小一些");
			}
		}
		
		
	}

}
