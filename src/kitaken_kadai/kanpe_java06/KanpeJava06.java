package kitaken_kadai.kanpe_java06;

public class KanpeJava06 {
	public static void main(String[] args) {
		for (int l = 1; l <= 9; l++) {
			System.out.println(l + "の段");
			for (int r=1; r<=9; r++) {
				System.out.println(l + "*" + l + "=" + l*r);
			}
		}
	}
}