import java.util.Scanner;


class PrimeNum1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int n= sc.nextInt();
		boolean flag = true;
		
		if(n==1){
			System.out.println("Not a Prime number");
			return;
		}
		else{
			for (int i=2;i<=n/2;i++){
				if (n%i==0) flag= false;
				break;
			}
		}
		if (flag)System.out.println("Prime number");
		else System.out.println("Not a Prime number");
	}
}
