package kitaken_kadai.kanpe_java13;

public class KanpeJava13 {

	public static void main(String[] args) {
	KanpeJava13 hoge = new KanpeJava13(); 
	int x = 30;
	int y = 10;
	int z = 20;
	System.out.println(hoge.getMin(x,y,z));
	}

	int getMin(int a, int b, int c) {
		if (a < b) {
			if (a < c) {
				if (b < c) {
					return c;
				} else {
					return b;
				}
			} return a;
		} else {
			if (b < c) {
				return c;
			} else {
				return b;
			}
		}
	}
}