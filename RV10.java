class RV10//printing even & odd numbers in an array
{
	public static void main(String[] args)
	{
		int[] ia={1,2,3,4,5,6,7,8,9};
		System.out.println("printing even numbers...");
		for(int i=0;i<ia.length;i++)
		{
			if(ia[i]%2==0)
			{
				System.out.println(ia[i]);
			}
			
		}
		System.out.println("printing odd numbers ...");
		for(int i=0;i<ia.length;i++)
		{
		if(ia[i]%2!=0)
		{
			System.out.println(ia[i]);
		}
		}
	}
}