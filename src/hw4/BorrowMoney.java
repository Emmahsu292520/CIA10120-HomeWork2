package hw4;

import java.util.Scanner;

public class BorrowMoney {
	/*• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
	表如下:

	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
	員工編號: 25 19 27 共 3 人!」*/  
	
	
	
	public static void main(String[] args) {
		
		int[][] colleague = {{25, 32, 8, 19, 27},
				{2500, 800, 500, 1000, 1200}		
		};
		
		System.out.println("輸入要借的金額");
		Scanner sc = new Scanner(System.in);
		int borrowMoney = sc.nextInt();
		
		
		int count = 0;
		for(int i = 1; i < colleague.length ; i++) {
			for(int j = 0; j < colleague[i].length; j++) {
				if(borrowMoney < colleague[i][j]) {
//					System.out.println("可藉金額"+colleague[i][j]);
				 System.out.println("可藉金額的員工編號:"+colleague[0][j]);
				 ++count;
				}
			}
			
		}
		System.out.println("共"+count+"人");
		sc.close();
		
	}
	
	

}
