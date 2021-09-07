package week1.day2;

public class ArmStrong {

	public static void main(String[] args) {
		int n=153,sum=0,rem,c=0;
		int f=n,a=n;
		while(n>0) 
		{
			int q=n%10;
			c++;
			n=n/10;
		}
		while(a>0) 
		{
			rem=a%10;
			sum=sum+(int) Math.pow(rem,c);
			a=a/10;
		}
		if(sum==f)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
	}

}
