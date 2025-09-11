class FibonacciSeries
{
	public static void main(String[] args)
	{
		int n=5,first=0,second=1;
		int next;
		System.out.print("Fibonaci Series:"+first+" "+second);
		
		for(int i=3;i<=n;i++)
		{
			next=first+second;
			System.out.print(" "+next);
		
			
			first=second;
			second=next;
		}
	}
}