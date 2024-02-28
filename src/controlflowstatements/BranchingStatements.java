package controlflowstatements;

public class BranchingStatements {

	public static void main(String[] args)
	{
		//break will take control outside of switch and loop

		
		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
			break;//exit from loop
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("*************************");
		
		//continue will skip the certain part of the code 
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
				
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("****************************");
		//write a code to print only even number from 1 to 10 using continue
		
		
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				continue;
			}else
			{
				System.out.println("Even number:"+i);
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
