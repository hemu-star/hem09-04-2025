class Min
{
	public static void main(String[] args)
	{
		int[] a={50,100,20,40,60,10};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min element of array is :"+min);
		
	}
}