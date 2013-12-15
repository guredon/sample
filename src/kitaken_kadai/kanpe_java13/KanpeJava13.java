package kitaken_kadai.kanpe_java13;

public class KanpeJava13 {

	public static void main(String[] args) {
		KanpeJava13 hoge = new KanpeJava13(); 
		int x = 30;
		int y = 10;
		int z = 20;
		int sum = x + y + z;
		int mid = hoge.getMid(x,y,z,sum);
		System.out.println(mid);
	}
	
	int getMid(int a, int b, int c, int s) {
	
		int large = (a < b)? b : a;
		int max = (large < c)? c : large;

		int small = (a < b)? a : b;
		int min = (small < c)? small : c;

		int result = s - max - min;
		return result;
	}
}