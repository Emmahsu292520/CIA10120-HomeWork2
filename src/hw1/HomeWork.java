package hw1;

public class HomeWork {

	public static void main (String[] args) {
		
//		1.請設計一隻Java程式,計算12,6這兩個數值的和與積
		int x = 12;
		int y = 6;
		
		int sum = x + y;
		int multiplication = x * y;
		System.out.println("sum:"+ sum);
		System.out.println("multiplication:"+ multiplication);
		
		
		
//		2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)	
		int eggs = 200;
		int dozen = 12;
		System.out.println("共" + eggs/dozen +"打" + eggs % 12 + "顆");
		
		
//		3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
		int second = 256559;
		int day = 24 * 60 * 60;
		int hour = 60 * 60;
		int minute = 60;
		
		int howMuchDay = second / day;
		int remainingTime = second % day;
		
		int howMuchHour = remainingTime / hour;
		remainingTime = remainingTime % hour;
		
		int howMuchMinute = remainingTime / minute;
		remainingTime = remainingTime % minute;
		
		System.out.println("天數:"+howMuchDay+" "+ "小時:" + howMuchHour +" "+ "分:" + howMuchMinute+" " + "秒:" + remainingTime);
		
//		4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長	
		
		final double PI = 3.1415;
		int radius = 5;
		double circleArea =  Math.pow(radius, 2)*PI;
		double circumference = radius * 2 * PI;
		
		System.out.println("圓面積:" + circleArea+ " " + "圓周長:" +circumference);
		
		
//		5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		
		long savings = 1500000;
		double interestRate = 0.02;
		int compoundInterest = 1;
		int year = 10;
		double totalsavings = savings * Math.pow((1 + interestRate/compoundInterest), compoundInterest * year); 
		System.out.println("十年後的本金有:" + totalsavings);
		
		
/*		6.請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
			5 + 5
			5 + ‘5’
			5 + “5”
			並請用註解各別說明答案的產生原因    */
		
		
//		5 + 5 = 10; 這邊只是單純的加法 
		
		
		
		int xx = 5;
		char yy = '5';
		System.out.println(xx+yy);
//		5 + ‘5’   因為char透過unicode table的型別轉換是53 ，所以加起來是58
		
		
//		5 + “5” = 55 ，因為在+的左右邊如果遇到String等於是串接的意思
		
	}
}
