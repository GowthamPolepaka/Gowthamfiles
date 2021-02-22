package StringPrograms;

public class String1
{
	public static void main(String[] args)
	{
		//String s1 = "Gowtham";
		String s1 = new String("Gowtham");
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch = s1.charAt(i);
			System.out.println(ch);
		}
		
	}

}
