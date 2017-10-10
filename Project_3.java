import java.lang.Math;
import java.util.Scanner;

//Michael Gould
//CS 505-851
//314-52-087

public class Main {
	
	public static void main(String[] args){
		
		System.out.print("Please enter upper bound of primes to be searched: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] array = new int[input];
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		sieve(array);		
	
	}
	
	public static void sieve(int[] array){
		
		int upperBound = (int)(Math.sqrt(array.length));		
		
		for(int i = 1; i < upperBound; i++){
			if(array[i] != 0) {
				for(int j = (array[i] * 2 - 1); j < array.length; j += array[i]) {
					array[j] = 0;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			//code in case zeros are to be eliminated
			//if(array[i] != 0)
				System.out.println(array[i]);
		}
	}
	
	public static void goldbach(int[] array){
		
		int index = 0;
		int[] evens = new int[];
		int[] primes = new int[];
		
		for(i = 4; i < 1000000; i + 2){
			evens[index] = i;
			index++;
		}
		
		int small = 0;
		int large = evens.length - 1;
		
		for(int count = 0; count < evens.length; count++){
			while (small < large){
				if (primes[small] + primes[large] == evens[count])
					System.out.println(primes[small] " + " primes[large] " = " evens[count]);
				else if (primes[small + primes[large] < evens[count])
				small++;
				else
				large--;
		}
}		