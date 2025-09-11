class Even_Odd
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,6};
		System.out.println("printing even no in the array.........");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		System.out.println("printing odd numbers in the array.........");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
	}
}