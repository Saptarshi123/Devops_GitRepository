package com.cg.hsbc;
import org.junit.*;
public class AppTest 
{
	private App a1=null;
	@Before
	public void seUp() throws Exception {
		a1=new App();
	}

	@After
	public void teaDown() throws Exception {
		a1=null;
	}

	@Test
	public void testGreetMe(){
		Assert.assertEquals("Welcome: Saptarshi",a1.greetMe());
	} 
	 
    public AppTest()
    {
        super();
    }

   
}
