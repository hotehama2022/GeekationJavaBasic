package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// 問1		
		int a = 10;
		int b = 5;
		
		boolean result1 = (a > b);
		System.out.println(result1);

		// 問2
		boolean isSunny = true;
		boolean isWarm = true;
		
		boolean result2 = (isSunny && isWarm);
		System.out.println(result2);
		
		// 問3
		int x = 2;
		int y = 4;
		
		boolean result3 = (x >= 0 && y % 2 == 0);
		System.out.println(result3);
		
		// 問4
		boolean hasPermission = false;
		
		boolean result4 = !hasPermission;
		System.out.println(result4);
	}

}
