/* to find maxm element in an array*/
class RV17
{
	public static void main(String[] args)
	{
		int[] a={52,79,47,29,83,12};
		int max=a[0];
		for (int i=1;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max no in the array is:"+max);
	}
}	
	