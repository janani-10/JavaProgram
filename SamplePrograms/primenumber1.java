package SamplePrograms;

public class primenumber1 {

	public static void main(String[] args) {
		int a=5;
		int count =0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count =count+1;
			}
		}
		if(count==2) {
			System.out.println("The given number is prime number");
		}
		else {
			System.out.println("The given number is not prime number");
		}
		

	}

}
