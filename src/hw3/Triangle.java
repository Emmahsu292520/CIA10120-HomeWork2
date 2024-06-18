package hw3;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		/*請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
		三角形、其它三角形或不是三角形,如圖示結果:

		(提示:Scanner,三角形成立條件,判斷式if else)
		(進階功能:加入直角三角形的判斷)  */
		
	int[] side = new int [3];
	System.out.println("請輸入三個數字，分別代表長、寬、高");
	
	for(int i = 0; i < side.length; i++) {
		Scanner sc = new Scanner(System.in);
		side[i] = sc.nextInt();
	}
		
	
	if(side[0] != 0 && side[1] != 0 && side[2] != 0) {	
		if(side[0] == side[1] && side [1] == side[2]) {
			System.out.println("正三角形");
			
		}else if(side[0] == side[1] && side[0]!= side[2] || side[0] == side[2] && side[0] != side[1]
				
				|| side[1] == side[2] && side[1] != side[0]) {
			System.out.println("等腰三角形");
		}else if(Math.pow(side[0], 2) + Math.pow(side[1], 2) == Math.pow(side[2], 2) 
				|| Math.pow(side[1], 2) + Math.pow(side[2], 2) == Math.pow(side[0], 2)
				|| Math.pow(side[0], 2) + Math.pow(side[2], 2) == Math.pow(side[1], 2)) {
			System.out.println("直角三角形");
		}else {
			System.out.println("其他三角型");
		}
	
	
	}else {
		System.out.println("不是三角形");
	}
		
	}

}
