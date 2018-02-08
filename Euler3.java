/**
 * Working solution on project Euler problem 3: Largest Prime Factor
 * https://projecteuler.net/problem=3
 * 
 * CUrrently WIP, this is currently factor finding
 */

public class Euler3 {
	
	public Euler3(double N){
		
		double factors[] = new double[20]; //arbitrary number of factors, will need potential scaling method
		
		int i; 	//lowest possible factor
		int j = 0; //indexing for factors
		
		double max = Math.sqrt(N); //largest number to check
		System.out.println("max: " + max);
		
		while((max % 1.0 == 0) ) //if the the maximum value is the square root of the previous, example 25  
		{
			factors[j] = max;	//store as a factor, increment index, repeat
			j++;				
			max = Math.sqrt(max);
			System.out.println("root max: " + max);
		}
		
		
		//for(i=2; i < max; i++) //brute force only needs to go up to square root of N
		{
			
		}
		
		printFactors(N, factors);
	}
	
	/**
	 * printFactors: method for displaying all discovered facrots of a number
	 * @param N
	 * @param factors
	 */
	private void printFactors(double N, double[] factors){
		
		int l = factors.length;
		
		System.out.println("discovered factors of " + Double.valueOf(N).intValue() + ":");
		
		for(int i = 0; i < l; i++){
			
			if(factors[i] == 0.0){
				break;	//don't need to print initialized factors
				
			}
			System.out.print(Double.valueOf(factors[i]).intValue());
			
		}
	}

	public static void main(String[] args)
	{
		double N = 13;	//determine the factors of N
		
		new Euler3(N);
	}

}