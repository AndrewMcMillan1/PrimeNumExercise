package com.quintrix.assignments;

public class PrimeNumExercise {

	public static void main(String[] args) {
		
		
		int primeCount = 0;
		int number = 2;  // begin testing at the number two to avoid needing a special case for the number 1 
		boolean isPrime = true;
		
				
		// Print 100 prime numbers. 
		while (primeCount < 100) {
						
			
			// Factors come in pairs and one must be less than or equal to the square root. If i = 2 or 3 the loop doesn't execute.
			// 2 is the first divisor to test for
			for (int i = 2; i <= Math.sqrt(number); i++) {
				
				if (number %i == 0) {
					
					isPrime = false;
					break;
				}								
			}
			// Print prime numbers to console and increment count
			if (isPrime) {
				
				System.out.println(number);
				primeCount++;										
			}
			// Reset bool to true and increment number for next for loop iteration
			isPrime = true;
			number++;
		}

	}

}
