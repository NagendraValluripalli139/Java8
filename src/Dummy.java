import java.util.stream.IntStream;

public class Dummy {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println(sum);
		
		  int sum1= IntStream.rangeClosed(0,100)
		            //.parallel()
		            .map(Integer::new)
		            .sum();
         System.out.println("Sum1 :"+sum1);
	}
	
}
