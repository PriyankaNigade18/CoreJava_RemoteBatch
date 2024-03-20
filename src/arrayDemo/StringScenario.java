package arrayDemo;

public class StringScenario {

	public static void main(String[] args) 
	{
		// Count the vowels in string
		String ss1="Java";
		int count=0;
		
		for(int i=0;i<ss1.length();i++)
		{
			char ch=ss1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')
			{
				count++;
			}
			
		}
		
		System.out.println("Total vowels are: "+count);

		
		//Calculate number of lowercase/uppercase/digit
		
		String s1="Java Programming 18";
		int lcase=0,ucase=0,digit=0;
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			
			if(ch>='A' && ch<='Z')//range A to Z
			{
				ucase++;
			}else if(ch>='a' && ch<='z')
			{
				lcase++;
			}else if(ch>='0' && ch<='9')
			{
				digit++;
			}
			
			
		}
		
		System.out.println("Number of uppercase letters: "+ucase);
		System.out.println("Number of lowercase letters: "+lcase);

		System.out.println("Number of digits: "+digit);

		System.out.println("***************************************");
		
		
		String a="Java";
		String res="";
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				res=res+a.toLowerCase().charAt(i);
			}else if(ch>='a' && ch<='z')
			{
				res=res+a.toUpperCase().charAt(i);
			}
			
			
			
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
