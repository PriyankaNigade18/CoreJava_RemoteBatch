package week1_Basics;

public class OperatorsDemo
{

	public static void main(String[] args)
	{
	System.out.println("*******Arithemetic Operators***********");
			
		int a=100,b=50;
//		int c=a+b;
//		System.out.println(c);
//		System.out.println("Addition is: "+a+b);	
//			
//		System.out.println(a+b+" Addition is:");
		
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Modulus is: "+(a%b));
		
		/*
		 * Increment ++  
		 * -------------------
		 * post Increment         PreIncrement
		 * a++                        ++a
		 * Decrement --
		 * Post Decrement         PreDecrement
		 * a--							--a
		 */
		
		int a1=100;
		System.out.println(a1);//100
		System.out.println(a1++);//100
		System.out.println(a1);//101
		
			
		int b1=100;
		System.out.println(b1);//100
		b1++;
		System.out.println(b1);//101
		
		//preIncrement
		int a2=100;
		System.out.println(a2);//100
		System.out.println(++a2);//101
		System.out.println(a2);//101
		
		
		int b2=100;
		System.out.println(b2);//100
		++b2;
		System.out.println(b2);//101
		
		int c1=90;
		int d1=c1++;
		System.out.println(c1);//91
		System.out.println(d1);//90
		
		int p=167;
		int q=p++;
		System.out.println(p);//168
		System.out.println(q);////167
		
		int i=89;
		int j=++i;
		System.out.println(i);//90
		System.out.println(j);//90
		System.out.println("******Decrement*********");
		
		
		int p1=389;
		System.out.println(p1);//389
		System.out.println(p1--);//389
		System.out.println(p1);//388
		
		int p2=678;
		System.out.println(p2);//678
		p2--;
		System.out.println(p2);//677
		
		int q1=567;
		System.out.println(q1);//567
		System.out.println(--q1);//566
		
		int r=58;
		int s=r--;
		System.out.println(r);//57
		System.out.println(s);//58
		
		int x=90;
		int y=--x;
		System.out.println(x);//89
		System.out.println(y);//89
		System.out.println("***************Relational Operator**********");
		//x=y=89  p2=677  r=57 q1=566 i=j=90
		
		System.out.println("Greater than >: "+(p2>q1));//true
		System.out.println(r>p2);//false
		System.out.println("less than <: "+(x<q1));//true
		System.out.println(r<y);//true
		System.out.println(x<y);//false
		System.out.println("greater than equal to: >="+(p2>=q1));//true
		System.out.println(i>=j);//true
		System.out.println("less than equal to: <="+(r<=i));//true
		System.out.println(j<=r);//false
		System.out.println("Comaprison =="+(i==j));//true
		System.out.println("not equal to !=: "+(p2!=q1));//true
		System.out.println(i!=j);//false
		System.out.println("**********Logical Operator**********");
		
		/*
		 * a b   &&    ||  !(a)
		 * T T	  T     T   F	
		 * T F    F     T   F
		 * F T    F     T   T
		 * F F    F     F   T 
		 */
		
		System.out.println((p2!=q1) && (i==j));//true
		System.out.println((x<y) && (i==j));//false
		System.out.println((i==j) && (x<y));//false
		System.out.println((j<=r) && (x<y));//false
		
		System.out.println((p2!=q1) || (i==j));//true
		System.out.println((x<y) || (i==j));//true
		System.out.println((i==j) ||(x<y));//true
		System.out.println((j<=r) || (x<y));//false
		
		//!(Not)
		System.out.println(x<y);//false
		System.out.println(!(x<y));//true
		
		System.out.println("************Conditional Operator******");
		
		int t=100,u=898;
		
		if(t>u)
		{
			System.out.println(t+" is greater than "+u);
		}else
		{
			System.out.println(u+" is greater than "+t);
			
		}
		System.out.println("*********************************");
		//condition?true:false (Ternary operator)
		
		System.out.println(t>u?t+" is greater than "+u:u+" is greater than "+t);
		
		//or
		
		int max=(t>u)?t:u;
		int min=(u<t)?u:t;
		System.out.println("Greater value is: "+max);
		System.out.println("Lesser value is: "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			

	}

}
