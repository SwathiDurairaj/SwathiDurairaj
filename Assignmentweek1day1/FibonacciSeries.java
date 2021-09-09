package Assignmentweek1day1;
import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 1, range = 8;
		System.out.println("The fibonacci series:" + range);
		for (int i = 1; i <= range; i++) {

			System.out.println("the first number:" + num1);
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;

		}

	}

}
