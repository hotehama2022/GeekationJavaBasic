package basicSyntax;

public class GeekIntroduction {
	public static void Greeting(int age, double height) {
		System.out.println("こんにちは! 私はGeek君でごわす。");
		System.out.println("年は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");
	}
	
	public static void SpecialSkill(int num1, int num2) {
		if (num1 < 1 || num2 < 1) {
			System.out.println("num1とnum2は0より大きい値にしてください。");
			
			return;
		} else if (num1 >= num2) {
			System.out.println("num2はnum1より大きい値にしてください。");
			
			return;
		} else if (num1 > 300 || num2 > 300) {
			System.out.println("num1とnum2は300以下にしてください。");
			
			return;
		}
		
		for(int i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "は3の倍数かつ5の倍数です。");
				continue;
			} else if (i % 3 == 0) {
				System.out.println(i + "は3の倍数です。");
				continue;
			} else if (i % 5 == 0) {
				System.out.println(i + "は5の倍数です。");
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}
