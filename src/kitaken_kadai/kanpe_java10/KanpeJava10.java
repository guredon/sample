package kitaken_kadai.kanpe_java10;

public class KanpeJava10 {

	public static void main(String[] args) {
		KanpeJava10 hoge = new KanpeJava10(); 
		int x = 10;
		int y = 20;
		System.out.println(hoge.getMin(x,y));
	}

	int getMin(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
}