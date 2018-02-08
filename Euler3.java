/**
 * Working solution on project Euler problem 3: Largest Prime Factor
 * https://projecteuler.net/problem=3
 * 
 * Discovers all prime factors of a number
 */

public class Euler3 {
	
	public Euler3(double N){
		
		double factors[] = new double[20]; //arbitrary number of factors, will need potential scaling method
		System.out.println("Factor me:" + N);
		int i; 	//current factor to be checked
		int j = 0; //indexing for factors
		
		double max = Math.sqrt(N); //largest number to check
		//System.out.println("max: " + max);
		
		while((max % 1.0 == 0) ) //if the the maximum value is the square root of the previous i.e. no trailing decimal values   
		{
			factors[j] = max;	//store as a factor, increment index, repeat
			j++;				
			max = Math.sqrt(max);
			System.out.println("root max: " + max);
		}
		
		max = Math.ceil(max); //round up to the next value, this will be the upper most bound to check
		System.out.println("max test value: " + max);
		
		double c = N;	//copy of initial value 
		for(i=2; i < max; i++) //brute force only needs to go up to square root of N
		{
			double r = c/i; //result of the division by lowest factor
			//System.out.println("result: " + r);
			
			if(r % 1.0 == 0){	//if a clean division occurs
				System.out.println("added " + i);
				factors[j] = i; //save the factor
				j++;			//increment
				c = r;		//continue division from this new result
			}
		}
		
		printFactors(N, factors); //final display of all factors
	}
	
	/**
	 * printFactors: method for displaying all discovered factors of a number, 
	 * @param N
	 * @param factors
	 */
	private void printFactors(double N, double[] factors){
		
		int l = factors.length;
		
		System.out.println("discovered factors of " + Double.valueOf(N) + ":");
		
		for(int i = 0; i < l; i++){
			
			if(factors[i] == 0.0){
				break;	//don't need to print initialized factors
				
			}
			System.out.print(Double.valueOf(factors[i]).intValue() + ", ");
			
		}
	}

	public static void main(String[] args)
	{
		double N = 600851475143.0;	//determine the factors of N
		
		new Euler3(N);
	}

}