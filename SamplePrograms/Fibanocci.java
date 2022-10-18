package SamplePrograms;

public class Fibanocci {

	public static void main(String[] args) {
		int count =10;
		int temp =0;
		int temp1=1;
		int sum=0;
		System.out.print(temp+" ");
		System.out.print(temp1+" ");
		for(int i=2;i<count;i++) {
			sum =temp+temp1;
			System.out.print(sum+" ");	
			temp=temp1;
			temp1=sum;
			
			
			
			
		}

	}

}
