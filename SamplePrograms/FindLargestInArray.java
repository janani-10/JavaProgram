package SamplePrograms;

public class FindLargestInArray {
	public static void main(String[] args) {
		int array1[]= {10,2,3,4,5,6,777};
		int temp =0;
		for(int i=0;i<(array1.length);i++) {
			for(int j=i+1;i<array1.length;i++) {
				if(array1[i] > array1[j]) {
					temp = array1[i];
					array1[i]= array1[j];
					array1[j]=temp;
				}
			}
		}
		
		System.out.println("Largest number in the array is "+ temp);
	}

}
