package arrayDemo;

public class StringDemo2_Methods {

	public static void main(String[] args) 
	{
		// length()
		String s1="Hello All";
		System.out.println("Length of String is: "+s1.length());//9
		
		//charAt(index):returns character from the given index
		System.out.println("Character of index 7: "+s1.charAt(7));//l
		
		//indexOf(char ch):It returns index of first occurrence of a character
		System.out.println(s1.indexOf('H'));//0
		System.out.println(s1.indexOf('l'));//2-first occurrence
		
		//indexOf(char ch,int start_index)
		System.out.println(s1.indexOf('l',6));//7
		System.out.println(s1.indexOf('l',4));//7
		
		//lastIndexOf(char ch)
		System.out.println(s1.lastIndexOf('l'));//8
		
		//toLowerCase()
		System.out.println(s1.toLowerCase());
		
		
		//toUpperCase()
		System.out.println(s1.toUpperCase());
		
		/*
		 * declare string with your name and 
		 * letter at position even should print in uppercase 
		 * and letter at position odd should print in lowercase
		 */
		
		String name="priyanka";
		String res="";
		for(int i=0;i<name.length();i++)
		{
			
			if(i%2==0)
			{
				res=res+name.toUpperCase().charAt(i);
			}else
			{
				res=res+name.toLowerCase().charAt(i);
			}
		}
		
		System.out.println(res);
		
		//replace(char old,char new_char)
		
		System.out.println(s1);
		System.out.println(s1.replace('l','x'));
		
		
		//replace(old_sequence_of char,new_sequence_of char)
		System.out.println(s1);
		System.out.println(s1.replace("All","Everyone"));
		
		
		//concat(String s)
		
		String s2="Computer";
		String s3="Applications";
		
		
		System.out.println(s2.concat(" "+s3));
		//or
		System.out.println(s2+" "+s3);
		
		// substring(int start_index)
		String s4="Computers Engineering";
		System.out.println(s4.substring(3));
		
		//substring(int startindex,int endindex)
		System.out.println(s4.substring(3,9));//puters
		
		/*
		 * equality between string
		 * 1.equals()
		 * 2.equalsIgnoreCase()
		 */
		
		String actual="Please enter valid phoneNumber!";
		
		String expected="Please enter valid phoneNumber!";
		
		System.out.println("Strings are equal?: "+actual.equals(expected));//true
		
		
		System.out.println(actual.equalsIgnoreCase(expected));
		
		
		// int compareTo(String s)
		/*
		 * -ve if string is smaller
		 * +ve if string is bigger
		 * 0 if string is same
		 * 
		 */
		String s7="Hello";
		String s5="Hello";
		String s6="Hello All";
		System.out.println(s7.compareTo(s5));//0
		System.out.println(s5.compareTo(s6));//-4
		System.out.println(s6.compareTo(s5));//4
		
		//trim()
		String s8="      Welcome All      ";
		System.out.println(s8);
		
		System.out.println(s8.trim());
		
		//contains()
		System.out.println("Is string contains welcome?:"+s8.contains("Welcome"));
		System.out.println("Is string contains All?:"+s8.contains("All"));

		System.out.println("Is string contains Hello?:"+s8.contains("Hello"));//f

		System.out.println("Is string contains wel?:"+s8.contains("Wel"));

		
		//startsWith(prefix)
		String s9="Welcome to learn Java Object oriented principles!";
		
		System.out.println(s9.contains("Object"));
		System.out.println("String starts with Welcome?: "+s9.startsWith("Welcome"));
		
		System.out.println("String starts with come?: "+s9.startsWith("come"));//f

		System.out.println("String starts with Wel?: "+s9.startsWith("Wel"));

		System.out.println("String starts with W?: "+s9.startsWith("W"));

			
		//endsWith(suffix)
		
		System.out.println("String endwith principles!?: "+s9.endsWith("principles!"));
		
		System.out.println("String endwith !?: "+s9.endsWith("!"));

		System.out.println("String endwith .?: "+s9.endsWith("."));

		System.out.println("String endwith ples!?: "+s9.endsWith("ples!"));

		
		
		//split(regexp)
		String languages="CProg,C++,Java,Python";
		System.out.println(languages);
		String arr[]=languages.split(",");
		
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println(arr[0]);//CProg
		
		String pl=languages.split(",")[3];
		System.out.println(pl);
		
		
		String date="March 2024";
		String month=date.split(" ")[0];
		String year=date.split(" ")[1];
		
		System.out.println("Month is:"+month);
		
		System.out.println("Year is:"+year);

		/*
		 * Write a code to test bill amount is 2500/-
		 */
		String billmsg="Total bill is 2500 Thank you for your order!";
		
		String data=billmsg.split(" ")[3];
		
		int amount=Integer.parseInt(data);
		if(amount==2500)
		{
			System.out.println("Amount matched!");
		}else
		{
			System.out.println("Amount not matched!");

		}
		/*
		 * StringBuffer StringBuilder classes are mutable
		 * New keyword way to declare
		 * 
		 */
		
		StringBuilder sr=new StringBuilder("Hello");
		System.out.println(sr);
		sr=sr.append(" All");
		System.out.println(sr);
				
		//Print string in reverse order using method
		System.out.println(sr.reverse());
		
		//String reverse without method
		String ss1="Java Programming";
		String result="";
		
		for(int i=ss1.length()-1;i>=0;i--)
		{
			result=result+ss1.charAt(i);
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
