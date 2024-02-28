package controlflowstatements;

public class NestedForLoop {

	public static void main(String[] args)
	{

		
		
		for(int r=1;r<=4;r++)
		{
						
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" ");
			}
			
			System.out.println();//next line		
		}
		
		
		System.out.println("****************************");
		
		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				System.out.print(i+" ");
			}else
			{
				System.out.println(i);
			}
		}
		
		
		
		

	}

}
