package oop.Encapsulation;

public class FacebookLoginTest {

	public static void main(String[] args) 
	{

		LoginPage lp=new LoginPage();
		lp.setUsername("Priyanka");
		lp.setPassword("test123");
		lp.doLogin(lp.getUsername(),lp.getPassword());

		
		LoginPage lp2=new LoginPage();
		lp2.setUsername("Reva");
		lp2.setPassword("test123");
		lp2.doLogin(lp2.getUsername(),lp2.getPassword());
	}

}
