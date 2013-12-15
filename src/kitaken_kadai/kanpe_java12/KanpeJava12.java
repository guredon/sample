package kitaken_kadai.kanpe_java12;

public class KanpeJava12 {

	public static void main(String[] args) {
	KanpeJava12 hoge = new KanpeJava12(); 
	int x = 30;
	int y = 20;
	int z = 10;
	System.out.println(hoge.getMin(x,y,z));
	}

	int getMin(int a, int b, int c) {
		if (a < b) {
			if (a < c) {
				return a;
			} else if (c < b) {
				return c;
			} else {
				return b;
			}
		} else {
			if (b < c) {
				return b;
			} else {
				return c;
			}
		}
	}
}