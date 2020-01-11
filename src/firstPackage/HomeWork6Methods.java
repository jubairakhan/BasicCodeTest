package firstPackage;

import java.util.Arrays;

public class HomeWork6Methods {
	
	
	//Create methods to :
	//  1. Reverse a string
//	      Eg: Input to method : Sample
//	            Output/Return from method : elpmaS
		
		public String reverrseAString(String string){
			String str ="";
			
			for (int i =  string.length()-1; i >= 0; i--) {
				str += string.charAt(i);
			}
			return str;
		}
		

		
		
		// 2. Reverse an array (fyi: length of input array can vary)
//	      Eg: Input to method : [25, 15, 3, 2, 40] or [20, 10, 44]
//	            Output/Return from method : [40, 2, 3, 15, 25] or [44, 10, 20]
		
		public int reverseAnArray(int[] array){
			
			int arr=0;
			System.out.print("#2:Reverse of an array is : ");
			for (int i = array.length-1; i >=0 ; i--) {
				arr=array[i];
				System.out.print(arr +" ");
			}
			System.out.println();
			return arr;
			
		}



//3. Add all numbers in a given array (fyi: length of input array can vary)
//Eg: Input to method : [20, 10, 40, 44]
//    Output/Return from method : 114

public int addingArrayNumber(int [] array){
int sum = 0;
for (int i=0;i<array.length;i++) {

//for (int i =  array.length-1; i>=0 ; i--) {
	sum = sum + array[i];
}
return sum;
}

//4. Sort an array
//Eg: Input to method : [20, 10, 40, 44]
//    Output/Return from method : [10, 20, 40, 44]

public void sortingAnArray(int [] array){

Arrays.sort(array);
 System.out.print("#4 Sorting of an Array is : ");

 for (int i = 0; i < array.length; i++) {
	 System.out.print(array[i]+" ");
}
 System.out.println();
}

//5. Find Average of a given array
//Eg: Input to method : [20, 10, 40, 44]
//    Output/Return from method : 28.5
public double averageOfArray (int [] array){
double sum = 0, average = 0;

for (int i = 0; i < array.length; i++) {
	sum = sum + array[i];
	average = sum / array.length;
}
return average;
}
//6. Find maximum number in given array
//Eg: Input to method : [20, 10, 40, 44, 32]
//    Output/Return from method : 44
public int findMaximum(int [] array){
int max = array[0];

for (int i = 1; i <= array.length-1; i++) {
	if (max < array[i]) 
		max = array[i];
}
return max;
}

//7. Find minimum number in given array
//Eg: Input to method : [20, 10, 40, 44]
//    Output/Return from method : 10
public int findMinimum(int [] array){
int min = array[0];

for (int i = 1; i <= array.length-1; i++) {
	if (min > array[i]) 
		min = array[i];
}
return min;
}
}


