package JavaIntern;
import java.util.*;
public class StudentGradeCalculator {
	Scanner sc = new Scanner(System.in);
	int i;
	int sub = 5;
	int marks[] = new int[sub];
	int total;
	
	void getdata() {
		System.out.println("Enter the marks of five subjects : ");
		for(int i = 0;i < sub; i++) {
			marks[i] = sc.nextInt();
		}
	}
	
	void viewdata() {
		System.out.println("The marks obtained are : ");
		for(int i = 0;i < sub;i++) {
			System.out.println(marks[i]);
		}
	}
	void grade() {
		
		for(int i = 0;i < sub;i++) {
			total += marks[i];
		}
		  System.out.println("The total marks obtained are : "+total);
	    	double avg = (double)total / sub;
		  System.out.println("The average marks obtained are : "+avg+"%");
		  System.out.print("The grade obtained is : ");
		  
		if(avg > 90) {
			
			System.out.println("A+ grade");
		}
		if(avg == 90 || avg > 80) {
			
			System.out.println("A grade");
		}
		else if(avg == 80 || avg > 70) {
			
			System.out.println("B+ grade");
		}
		else if(avg == 70 || avg > 60) {
			
			System.out.println("B grade");
		}
		else if(avg == 60 || avg > 50) {
			
			System.out.println("C+ grade");
		}
		else {
			System.out.println("Fail");
		}
	}
	public static void main(String args[]) {
		StudentGradeCalculator s = new StudentGradeCalculator();
		s.getdata();
		s.viewdata();
		s.grade();
	}
	

}
