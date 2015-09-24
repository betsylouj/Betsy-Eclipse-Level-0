
public class FizzBuzz {
	public static void main(String[] args) {
		int fizz = 0;
		int buzz = 0;
		
		for (int i = 0; i < 100; i++) {
			fizz++;
			buzz++;
			if (fizz == 3 && buzz == 5){
				System.out.println("FizzBuzz");
				fizz = 0;
				buzz = 0;
			}
			else if (fizz==3){
				System.out.println("Fizz");
				fizz = 0;
			}
			else if (buzz == 5){
				System.out.println("Buzz");
				buzz = 0;
			}
			else 
				System.out.println(i+1);
			
		}
		
	}

}
