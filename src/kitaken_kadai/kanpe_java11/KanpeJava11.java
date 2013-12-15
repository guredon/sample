package kitaken_kadai.kanpe_java11;

public class KanpeJava11 {

	public static void main(String[] args) {
		KanpeJava11 hoge = new KanpeJava11(); 
		int x = 20;
		int y = 30;
		int z = 10;
		System.out.println(hoge.getMax(x,y,z));
	}

	int getMax(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			} else if (c > b) {
				return c;
			} else {
				return b;
			}
		} else {
			if (b > c) {
				return b;
			} else {
				return c;
			}
		}
	}
}