class Max
{
	public static void main(String[] args)
	{
		int[] a={1000,3277,3246817,34878,10005};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max element of array is:"+max);
	}
}