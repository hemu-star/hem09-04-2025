class Str
{
	public static void main(String[] args)
	{
		String s1="NARESHIT";
		String s2="nareshit";
		String s3="NARESH";
		System.out.println(s1.length());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.contains(s3));//true
		System.out.println(s1.concat(s2));
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf("S"));
		System.out.println(s1.replace("NA","SU"));
		System.out.println(s3.startsWith("n"));
		
		
		
		
		
	}
}