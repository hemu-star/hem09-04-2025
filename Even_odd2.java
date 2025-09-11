class Even_odd2
{
	public static void main(String[] args)
	{
		int[] d={3,4,6,8,9,4,9,0,7,9,4,8,8};
		System.out.println("printing even no. from the array");
		for(int i=0;i<d.length;i++)
		{
			if(d[i]%2==0)
			System.out.println(d[i]);
		}
		System.out.println("printing odd no. from the array");
		for(int i=0;i<d.length;i++)
		{
			if(d[i]%2!=0)
				System.out.println(d[i]);
		}
		
	}
}