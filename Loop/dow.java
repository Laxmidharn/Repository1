class dow 
{
	public static void main(String[] args) 
	{
		int n =3826,sum=0;
		
		do{
		while (n>0)
		{
			sum+=n%10;
			n/=10;
		}
			n=sum;
			sum=0;
			System.out.println(n);
	}while (n>9);
	}
}
