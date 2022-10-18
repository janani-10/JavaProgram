package SamplePrograms;

public class Palindrome {

	public static void main(String[] args) {
		
		String s="malayalam";
		String temp =s;
		String r="";
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
		System.out.println(temp);
		System.out.println(r);
		if(temp.equals(r)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}
		
		int a=66999;
		int temp1=a;
		int r1;
		String reversenum="";
		String reversenum1="";
		while(a>0){
			r1=a%10;
			reversenum =Integer.toString(r1);
			reversenum1= reversenum1+reversenum;
			
			a=a/10;
		}
		if(temp1== Integer.parseInt(reversenum1)) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not palindrome");
		}
		

	}

}
