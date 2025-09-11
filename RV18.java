class RV18
{
	public static void main(String[] args)
	{
		int[] ia={67,58,767,67,76,897,908,986,87};
		int max=ia[0];
		for (int i=1;i<ia.length;i++)
		{
			if(ia[i]>max)
				max=ia[i];
		}
		System.out.println("max element in the array is:"+max);
	}
}