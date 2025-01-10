package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		int total1 = sumNumber(num1, num2);
		int total2 = subtractNumber(num1, num2);
		int total3 = multiplicationNumber(num1, num2);
		int total4 = divisionNumber(num1, num2);
		
		int [] numbers = { total1, total2, total3, total4};
		
		resultsDisplay(numbers);
	}

	public static int sumNumber(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtractNumber(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplicationNumber(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int divisionNumber(int num1, int num2) {
		return num1 / num2;
	}
	
	public static void resultsDisplay(int[] numbers) {
		for (int number: numbers) {
			System.out.println("計算結果は" + number + "です。");
		}
	}
}
