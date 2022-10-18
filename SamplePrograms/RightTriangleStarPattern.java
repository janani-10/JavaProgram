package SamplePrograms;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
			System.out.print(" ");
		    if(i==j) {
		    	for(int k=1;k<=1;k++) {
		    		System.out.print("* ");
		    	}
		    	
		    }
			}
			System.out.println();
		}
		
		
	}
	

}
