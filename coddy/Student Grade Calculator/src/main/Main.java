package main;

import java.util.Scanner;

public class Main {
	public static double calculateAverageGrade(int[] grades) {
		// Write your code here
		double gradoPromedio = 0.0 ;
		
		for(int grade : grades) {
			gradoPromedio += grade;
		}
		
		gradoPromedio = gradoPromedio/grades.length;
		
		return gradoPromedio;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String text = scanner.nextLine();
		String text = "87,92,78,95,83,91,88,76";
		
		String[] stringArr = text.split(",");
		int[] studentGrades = new int[stringArr.length];
		for (int i = 0; i < stringArr.length; i++) {
			studentGrades[i] = Integer.parseInt(stringArr[i]);
		}
		double averageGrade = calculateAverageGrade(studentGrades);
		System.out.printf("Average grade: %.2f", averageGrade);
	}
}
