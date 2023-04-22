//The Stanton measure of an array is computed as follows. Count the number of 1s in the array. Let this count be n. The
//Stanton measure is the number of times that n appears in the array. For example, the Stanton measure of {1, 4, 3, 2, 1, 2, 3,
//2} is 3 because 1 occurs 2 times in the array and 2 occurs 3 times.
//Write a function named stantonMeasure that returns the Stanton measure of its array argument.
	
	
	
public class stantonMeasure{
	public static void main(String[] args){
		int result = stantonMeasure(new int[] {1});
		System.out.println(result);
		result = stantonMeasure(new int[] {0});
		System.out.println(result);
		result = stantonMeasure(new int[] {3, 1, 1, 4});
		System.out.println(result);
		result = stantonMeasure(new int[] {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4});
		System.out.println(result);
		result = stantonMeasure(new int[] {});
		System.out.println(result);
	}

	static int stantonMeasure(int[] a){
		int stantonMeasure = 0;
		int occurrencesOfOne = 0;
		for(int index = 0; index < a.length; index++){
			if(a[index] == 1){
				occurrencesOfOne++;
			}
		}
		for(int index = 0; index < a.length; index++){
			if(a[index] == occurrencesOfOne){
				stantonMeasure++;
			}
		}
		return stantonMeasure;
	}
}
