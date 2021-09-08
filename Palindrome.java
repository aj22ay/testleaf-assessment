package week1.day2;

public class Palindrome {

	public static void main(String[] args){
		int n=454,sum=0,rem;
		int a=n;
		while(n>0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if (sum==a)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome number");
	}

}
