class Even_Odd1
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,6,7,8,9};
		System.out.println("Printing even numbers in the string...");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		System.out.println("printing odd numbers in the string");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
	}
}