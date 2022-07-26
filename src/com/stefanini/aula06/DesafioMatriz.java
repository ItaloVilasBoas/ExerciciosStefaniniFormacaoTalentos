package com.stefanini.aula06;

public class DesafioMatriz {
	public static void main(String[] args) {
		int[][] multiDimensionalArray = {{1,2, 3, 4}, {5, 6, 7}};
		
		//for(int i = 0; i < multiDimensionalArray.length; i++) {
			//for(int j = 0; j < multiDimensionalArray[i].length; j++) {
				//System.out.println(multiDimensionalArray[i][j]);
			//}
		//}
		
		for(int[] m : multiDimensionalArray) {
			for(int v: m) {
				System.out.println(v);
			}
		}
	}
}
