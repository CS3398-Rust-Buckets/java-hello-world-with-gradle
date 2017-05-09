/**************************
Laura Adams
5/9/2017

This file TestPower.java does 
some Junit tests for the code in ExtraCredit.java,
which has a function findPower() that 
computes a number raised to a power.
***************************/
package extraCredit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPower
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
      assertEquals(e.getPower(), 1.0, 0);
      assertEquals(e.findPower(), 1.0, 0);
   }

//testPower1(), testPower2(), and testPower3() test the 
   //functionallity of the findPower() function

   @Test
   public void testPower1()
   {
      //This tests if 2^3 = 8
      e.setNum(2.0);
      assertEquals(e.getNum(), 2.0, 0);
      e.setPower(3.0);
      assertEquals(e.getPower(), 3.0, 0);
      assertEquals(e.findPower(), 8.0, 0);
   }

   @Test
   public void testPower2()
   {
      //This tests if 4^3 = 64
      e.setNum(4.0);
      assertEquals(e.getNum(), 4.0, 0);
      e.setPower(3.0);
      assertEquals(e.getPower(), 3.0, 0);
      assertEquals(e.findPower(), 64.0, 0);
   }

   @Test
   public void testPower3()
   {
      //This tests if 3^5 = 243
      e.setNum(3.0);
      assertEquals(e.getNum(), 3.0, 0);
      e.setPower(5.0);
      assertEquals(e.getPower(), 5.0, 0);
      assertEquals(e.findPower(), 243.0, 0);
   }
}