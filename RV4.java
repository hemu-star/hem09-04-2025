class RV4    //Fibonnaci Series
{
	public static void main(String[] args)
	{
		int num=8,first=0,second=1;
		//numfirst=0;
		//numsecond=1;
		System.out.println("Fibonnaci Series:"+first+"  "+second);
		int next=first+second;
		for(int i=3;i<=num;i++)
		{
			next=first+second;
			
			System.out.println(" "+next);
			//next=first+second;
			first=second;
			second=next;
		}
	}
}