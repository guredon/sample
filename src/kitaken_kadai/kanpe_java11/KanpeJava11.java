package kitaken_kadai.kanpe_java11;

public class KanpeJava11 {

	public static void main(String[] args) {
		KanpeJava11 hoge = new KanpeJava11(); 
		int x = 20;
		int y = 30;
		int z = 10;
		int max = hoge.getMax(x,y,z);
		System.out.println(max);
	}

	int getMax(int a, int b, int c) {
		int large = (a < b)? b : a;
		int result = (large < c)? c : large;
		return result;
	}	
}