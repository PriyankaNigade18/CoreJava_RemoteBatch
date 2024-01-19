package wwek3_Basics;

public class MathematicalLibrary {

	public static void main(String[] args)
	{
		//Math.min()
		int min=Math.min(100,200);
		System.out.println("Mininum number is: "+min);
		
		double res1=Math.min(67.11,12.11);
		System.out.println("Minimum of double number is: "+res1);

		int res2=Math.min(-10,-20);
		System.out.println("Minimum number of negative value is: "+res2);
		
		//Math.max()
		int res3=Math.max(1000,600);
		System.out.println("Maximum of number is: "+res3);
		
		double res4=Math.max(78.66,70.56);
		System.out.println(res4);
		
		//Math.pow()
		
		double res5=Math.pow(2,3);
		System.out.println(res5);
		
		double res6=Math.pow(2.0,3.0);
		System.out.println(res6);
		
		//Math.cbrt()=cube root
		
		double res7=Math.cbrt(27);
		System.out.println(res7);
		
		//Math.log()
		double res8=Math.log(6.25);
		System.out.println(res8);//1.83
		
		
		//Math.abs()-positive
		
		int res9=Math.abs(-8);
		System.out.println(res9);//8
		
		double res10=Math.abs(9.99);
		System.out.println(res10);//9.99
		
		
		//Math.round()-rounded off
		long res11=Math.round(8.0);
		System.out.println(res11);//8
		long res12=Math.round(5.9);
		System.out.println(res12);//6
		
		long res13=Math.round(-56.8);
		System.out.println(res13);//-57
		
		//Math.ceil()=smallest integer and greater or equal value
		System.out.println(Math.ceil(8));//8.0
		System.out.println(Math.ceil(8.5));//9.0
		System.out.println(Math.ceil(-7));//-7.0
		
		System.out.println(Math.sqrt(9));//3.0
		
		System.out.println("Addition is:"+Math.addExact(10,10));
		System.out.println("Subtraction is: "+Math.subtractExact(100,30));
		System.out.println("Multiplication is: "+Math.multiplyExact(10, 10));


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
