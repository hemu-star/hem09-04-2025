class RV7   //finding sum of digits in a number
{
	public static void main(String[] args)
	{
		int num=16870980;
		int sum=0;
		while(num>0)
			for(int i=1;i<=num;i++)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}