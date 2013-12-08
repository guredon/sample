package kitaken_kadai.kanpe_java09;

public class KanpeJava09 {

	public static void main(String[] args) {
		KanpeJava09 hoge = new KanpeJava09(); 
		int x=10;
		int y=20;
		System.out.println(hoge.getMax(x,y));
	}

	int getMax(int a, int b) {
		if(a > b)
			return a;
		else if(b > a)
			return b;
		else
			return a;
	}
}