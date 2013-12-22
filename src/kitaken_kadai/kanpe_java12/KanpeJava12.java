package kitaken_kadai.kanpe_java12;

public class KanpeJava12 {

	public static void main(String[] args) {
		KanpeJava12 hoge = new KanpeJava12(); 
		int x = 20;
		int y = 10;
		int z = 30;
		int min = hoge.getMin(x,y,z);
		System.out.println(min);
	}

	int getMin(int a, int b, int c) {
		int small = (a < b)? a : b;
		int result = (small < c)? small : c;
		return result;
	}	
}