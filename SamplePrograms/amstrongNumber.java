package SamplePrograms;

public class amstrongNumber {

	public static void main(String[] args) {
		int a=371;
		int ams =a;
		int b=a;
		int temp=1;
		double sum=0;
		int count=0;
		int c=1;
		while(b>0) {
			c=b%10;
			count++;
			b=b/10;
			
		}
		
		while(a>0) {
			temp = a%10;
			sum=sum+Math.pow(temp,count);
			a=a/10;
		}
		int sum1 =(int)Math.round(sum);
		if(ams==sum1) {
			System.out.println("The given number is amstrong number");
		}
		else {
			System.out.println("The given number is not amstrong number");
		}
		
		

	}

}
