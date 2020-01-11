package firstPackage;

public class ElevenProj {
	

public static void main(String[] args) {
		
		int [] array = {20, 10, 40, 44};
		String string = "object oriented programing";
		String input = "sample";
		
		
		HomeWork6Methods obj = new HomeWork6Methods();
		
	//	1. Reverse a string
		System.out.println("#1: The reversing of a string is : "+ obj.reverrseAString(string));
		System.out.println("The reversing of a string is : "+ obj.reverrseAString(input));
		
		System.out.println("______________o_________________________");
		
		// 2. Reverse an array (fyi: length of input array can vary
		
			 
		 obj.reverseAnArray(array); 
		 
		 System.out.println("______________o_________________________");
		 
		// 3. Add all numbers in a given array (fyi: length of input array can vary)
			System.out.println(" #3 The Add all numbers of a given Array is : "+ obj.addingArrayNumber(array));
			
			System.out.println("______________o_________________________");
			
			
		//  4. Sort an array
			obj.sortingAnArray(array);
			
			System.out.println("______________o_________________________");
			
			
			
			//  5. Find Average of a given array
			System.out.println("The Average of an Array is : "+ obj.averageOfArray(array));
			
			System.out.println("______________o_________________________");
			
		//  6. Find maximum number in given array
			System.out.println("The maximum number of an Array is : "+ obj.findMaximum(array));
			
			System.out.println("______________o_________________________");
			
		//  7. Find minimum number in given array
			System.out.println("The minimum number of an Array is : "+ obj.findMinimum(array));
			
}

}

