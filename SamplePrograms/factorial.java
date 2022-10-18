package SamplePrograms;

public class factorial {

	public static void main(String[] args) {
		int a=10;
		int temp=1;
		for (int i=a;i>=1;i--) {
			
			temp = temp*i;
			
		}
		System.out.println("The factorial of given number is "+temp);

	}

}
