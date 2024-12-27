package basicSyntax;

public class IfSwitch {

	public static void main(String[] args) {
		// 問1	
		int num = 6;
		boolean isMultiple = false;
		
		if (num % 2 == 0) {
			isMultiple = true;
			System.out.println("2の倍数です。");
		}
		if (num % 3 == 0) {
			isMultiple = true;
			System.out.println("3の倍数です。");
		}
		
		if (!isMultiple) {
			System.out.println("どちらでもありません。");
		}
		
		// 問2
		String pref = "北海";
		
		switch (pref) {
			case "北海":
				System.out.println("北海道");
				break;
			case "東京":
				System.out.println("東京都");
				break;
			case "京都":
				System.out.println("京都府");
				break;
			default:
				System.out.println("当てはまりません。");
				break;
		}

	}

}
