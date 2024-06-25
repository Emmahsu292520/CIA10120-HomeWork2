package hw4;

public class Planet {
	/*有個字串陣列如下 (八大行星):
	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
	(提示:字元比對,String方法)*/
	
	public static void main(String[] args) {
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		int count = 0;
		for(int i = 0; i < planet.length; i++) {
			for(int j = 0; j < planet[i].length(); j++) {
				if(planet[i].charAt(j) == 'a' || planet[i].charAt(j) == 'e' || 
						planet[i].charAt(j) == 'i' || planet[i].charAt(j) == 'o' || planet[i].charAt(j) == 'u') {
					++count;
				}
				   
			}
		}
		System.out.println(count);
		
	};

}
