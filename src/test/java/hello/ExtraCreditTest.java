/********************************************
Template for hello package:

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
}

***********************************************************/
package extraCredit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testExtraCredit
{
  private ExtraCredit m;

  @Before
   public void setUp() throws Exception 
   {
      m = new ExtraCredit();
   }

  @Test
   public void testNumberEmpty() 
   {
      assertEquals(m.getNum(),1);
      assertEquals(m.getPower(), 1);
      assertEquals(g.findPower(),1);
   }

}
