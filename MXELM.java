class MXELM
{
	public static void main(String[] args)
	{
		int[] a={1256,34278,3289,8932,390,3289,489};
		int max=a[5];
		for (int i=1;i<a.length ;i++ )
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max")
	}
}