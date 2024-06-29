package hw4;

public class TestScore {
	
	public static void main(String[] args) {
		/*班上有8位同學,他們進行了6次考試結果如下:
			請算出每位同學考最高分的次數*/
		int[][] score = {
						{10, 35, 40, 100, 90, 85, 75, 70},
						{37, 75, 77, 89, 64, 75, 70, 95},
						{100, 70, 79, 90, 75, 70, 79, 90},
						{77, 95, 70, 89, 60, 75, 85, 89},
						{98, 70, 89, 90, 75, 90, 89, 90},
						{90, 80, 100, 75, 50, 20, 99, 75}
		};
		
		int count = 0;
		int studentId = 0;
		for(int i = 0; i < score.length; i++) {
			int highScoreStudent = score[i][0];
			for(int j = 0; j <score[i].length; j++) {
				if( highScoreStudent <= score[i][j]) {
					highScoreStudent = score[i][j];
					studentId =  j +1;
				}
				 count = i + 1;
			}System.out.println("第"+count+"次分數最高的學生為:"+studentId);
		}
				
				
		
		
	}

}
