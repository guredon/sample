package kitaken_kadai.kanpe_java09;

public class KanpeJava09 {

	public static void main(String[] args) {
		int x=2;
		int y=3;
		System.out.println(getMax(x,y));
	}

	public static int getMax(int a, int b) {
		if(a > b)
			return a;
		else if(b > a)
			return b;
		else
			return a;
	}
}