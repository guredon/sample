package kitaken_kadai.kanpe_java08;

public class KanpeJava08 {

	public static void main(String[] args) {
		KanpeJava08 hoge = new KanpeJava08(); 
		for (int i = 1; i <= 100; i++) {
			hoge.FizzBuzz(i);
		}
	}
	
	void FizzBuzz(int a) {
		if (a % 15 == 0)
			System.out.println("FizzBuzz");
		else if (a % 3 == 0)
			System.out.println("Fizz");
		else if(a % 5== 0)
			System.out.println("Buzz");
		else
			System.out.println(a);
	}
}