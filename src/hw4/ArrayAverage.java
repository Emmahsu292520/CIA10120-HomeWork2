package hw4;

import java.util.Arrays;

public class ArrayAverage {
	
	/*有個一維陣列如下:
	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	(提示:陣列,length屬性) */
	
	public static void main(String[] args) {
		int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		Arrays.sort(array);
		
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum+= array[i];
		}
		
		double arrayAverage = sum/(array.length);
		System.out.println("陣列所有的平均值為:"+arrayAverage);
		
		for(int j = 0; j <array.length; j++) {
			if(array[j] > arrayAverage) {
				System.out.println("大於平均值的有"+array[j]);
			}
		}
	}

}
