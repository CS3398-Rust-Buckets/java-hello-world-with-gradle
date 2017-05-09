/**************************
Laura Adams
5/8/2017

This file TestSquare.java does 
some Junit tests for the code in ExtraCredit.java,
which has a function findSquare() that 
computes the square of a number.
***************************/
package extraCredit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSquare
{
  private ExtraCredit e;

  @Before
   public void setUp() throws Exception 
   {
      e = new ExtraCredit();
   }

  @Test
   public void testNumberEmpty() 
   {
      //This verifies if all the values are initallized and ready for use
      assertEquals(e.getNum(),1.0, 0);
      assertEquals(e.findSquare(),1.0, 0);
   }

//testSquare1(), testSquare2(), and testSquare3() test the 
   //functionallity of the findSquare() function

   @Test
   public void testSquare1()
   {
      //This tests if 3^2 = 9
      e.setNum(3.0);
      assertEquals(e.getNum(), 3.0, 0);
      assertEquals(e.findSquare(), 9.0, 0);
   }

   @Test
   public void testSquare2()
   {
      //This tests if 4^2 = 16
      e.setNum(4.0);
      assertEquals(e.getNum(), 4.0, 0);
      assertEquals(e.findSquare(), 16.0, 0);
   }

   @Test
   public void testSquare3()
   {
      //This tests if 5^2 = 25
      e.setNum(5.0);
      assertEquals(e.getNum(), 5.0, 0);
      assertEquals(e.findSquare(), 25.0, 0);
   }
}