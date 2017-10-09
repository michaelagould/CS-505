Java.util.Math

//Michael Gould
//CS 505-851
//314-52-087

public class Main {
	
	public static void main(String[] args){
		
	System.out.print("Please enter upper bound of primes to be searched: ");
	Scanner scan = new Scanner(System.in);
	int input = scan.nextInt();
	int[] array = new array[input];
	sieve(array);
		
	}
}
	
	public static void sieve(int[] array){
		
		int upperBound = Math.sqrt(array.length);
		boolean[] initArray = new boolean[array.length];
		int[] results = new int[];
		
		//initializes new boolean array to hold indeces of primes
		for(int i = 0, i < array.length, i++)
				initArray[i] = true;
		
		//finds non prime indeces and marks them false in initArray
		for(int i = 2; i <= array.length; i++){
			if(initArray[i]){
				for ( int j = i * i; j < upperBound; j += i)
						initArray[j] = false;
			}
		}
	
		//stores results of boolean entries in array to cooresponding interger array
		for(int i = 2; i < initArray; i++){
			if (initArray[i])
				results[i] = i;
		}
		for(int count = 0; count < results.length; count++)
			System.out.println(results[count]);
		
	}
	
	public static void goldbach(int[] array){
		
		int index = 0;
		int[] evens = new int[];
		
		for(i = 4; i < array.length; i + 2){
			evens[]
		
	}
}		