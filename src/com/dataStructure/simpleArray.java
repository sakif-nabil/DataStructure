package com.dataStructure;

public class simpleArray {

	public static void main(String[] args) {
		int[] number= new int[5];
		number[0]=11;
		number[1]=2;
		number[2]=4;
		number[3]=42;
		number[4]=12;
		System.out.println("Simple Array");
		for(int i=0;i<number.length; i++) {
			System.out.print(number[i]+"\t");
		}
		
		// Object Array
		System.out.println(".");
		System.out.println("Object Array");
		Students[] stu= new Students[3];
		stu[0]= new Students("Ali",1);
		stu[1]= new Students("nabil",2);
		stu[2]= new Students("yassine",3);
		
		for(Students students:stu) {
			System.out.println("name "+students.name+"  :id "+ students.id);
		}
		
		int[][] table= new int[3][3];
		table[0][0]=1;
		table[0][1]=2;
		table[0][2]=40;
		table[1][0]=1;
		table[1][1]=50;
		table[1][2]=1;
		table[2][0]=7;
		table[2][1]=1;
		table[2][2]=9;
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(table[i][j] +"\t");
			}
		}


	}

}
