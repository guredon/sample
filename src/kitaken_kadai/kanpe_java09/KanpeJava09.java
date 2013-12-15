package kitaken_kadai.kanpe_java09;

public class KanpeJava09 {

	public static void main(String[] args) {
		KanpeJava09 hoge = new KanpeJava09(); 
		int x = 30;
		int y = 20;
		System.out.println(hoge.getMax(x,y));
	}

	int getMax(int a, int b) {
		if (b < a) {
			return a;
		} else {
			return b;
		}
	}
}