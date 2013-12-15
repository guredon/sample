package kitaken_kadai.kanpe_Java14;

public class KanpeJava14 {

	public static void main(String[] args){
	KanpeJava14 hoge = new KanpeJava14();
	int n = 11;
	System.out.println(hoge.isPrime(n));
	}
	
	boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++; 
			}
		}
	boolean result = count == 2;
	return result;
	}
}