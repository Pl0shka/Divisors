public class Divisors {
	public static void main(String[] args) {
		
		int number, divider;		
		
		// This loop searches for all 
		// possible divisors (integers) of any range of numbers.		
		for (number = 2; number <= 250; number++) again: {
			System.out.println("Number " + number + " is divisible by:\n1");
			
				for (divider = 2; divider <= number; divider++) {
					
					if ((number % divider) == 0) {						
						System.out.println(divider);
					}
					
					if (number == divider) {								
						System.out.println();
						break again;
					}			
			}			
		} 
	}
}