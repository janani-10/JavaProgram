package SamplePrograms;

public class SwappingOfNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("The value of a before swapping is "+ a);
		System.out.println("The value of b before swapping is "+ b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println();
		System.out.println("The value of a after swapping is "+ a);
		System.out.println("The value of b after swapping is "+ b);
		
		//Without using third variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a after swapping is "+ a);
		System.out.println("The value of b after swapping is "+ b);

	}

}
