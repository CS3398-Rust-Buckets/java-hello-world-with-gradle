package hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestGreeter {

   private Greeter g;
	
   @Before
   public void setUp() throws Exception 
   {
      g = new Greeter();
   }

   @Test
   public void testGreeterEmpty() 
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }
	
   @Test
   public void testGreeter() 
   {
      g.setName("World");
      assertEquals(g.getName(),"World");
      assertEquals(g.sayHello(),"Hello World!");
   }

   @Test
   public void newtest_IGB_GreeterPass()
   {
      assertEquals("A18-James-Pass","A18-James-Pass");
   }

   @Test
   public void newtest_IGB_GreeterFail()
   {  
      assertEquals("A18-James-fail","A18-James-fail");
      This line of code will make the build fail! :/
   }

}
